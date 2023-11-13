import java.util.Scanner;

public class week11_Report1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[][] person = { //사번, 이름
                {"1123", "김달현"},
//                {"1123", "김달현"},
//                {"1123", "김달현"}, {"1123", "김달현"},
//                {"1123", "김달현"}, {"1123", "김달현"},
//                {"1123", "김달현"}, {"1123", "김달현"},
//                {"1123", "김달현"}, {"1123", "김달현"}
        };
        int[][] data = { // 부서코드, 보훈(원호), 급, 호 , 공제액
                {1, 0, 1, 2, 0}, {5, 0, 2, 2, 0},
                {2, 0, 1, 2, 0}, {4, 0, 2, 2, 0},
                {3, 0, 3, 2, 0}, {3, 0, 3, 2, 0},
                {4, 0, 3, 2, 0}, {2, 0, 3, 2, 0},
                {5, 0, 3, 2, 0}, {1, 0, 3, 2, 0}
        };
        int[][] base_pay = { // (1급 : 1호봉, 2호봉, 3호봉, 4호봉, 5호봉), (2급 : 1호봉, 2호봉, 3호봉, 4호봉, 5호봉), (3급 : 1호봉, 2호봉, 3호봉, 4호봉, 5호봉)
                {1250000, 1200000, 1150000, 1100000, 1050000},
                {950000, 925000, 900000, 875000, 850000},
                {750000, 725000, 700000, 675000, 650000}
        };
        int[] department_pay = {250000, 250000, 350000, 350000, 300000}; // 경리, 인사, 영업, 생산, 서비스
        int[] grade_pay = {300000, 200000, 100000}; // 1급, 2급, 3급
        int[] benefit_pay = new int[person.length];
        int i = 0;

        // 입력
        for (i = 0; i < person.length; i++) {
            System.out.printf("사원 %d번의 이름을 입력하세요 : ", i + 1);
            person[i][1] = keyboard.nextLine();
            person[i][0] = null;

            System.out.printf("%s 사원의 사번을 입력하세요 : ", person[i][1]);
            while (person[i][0] == null) {
                String ID = keyboard.nextLine();
                if (ID.length() == 4) {
                    person[i][0] = ID;
                } else {
                    System.err.print("사번은 4자여야 합니다. 다시 입력해주세요 : ");
                }
            }

            System.out.printf("%s 사원의 부서코드를 입력하세요 : ", person[i][1]);
            data[i][0] = keyboard.nextInt();

            System.out.printf("%s 사원의 보훈의 여부를 입력하세요 ('O' = 1, 'X' = 0): ", person[i][1]);
            data[i][1] = keyboard.nextInt();

            System.out.printf("%s 사원의 직급을 입력하세요 : ", person[i][1]);
            data[i][2] = keyboard.nextInt();

            System.out.printf("%s 사원의 호봉을 입력하세요 : ", person[i][1]);
            data[i][3] = keyboard.nextInt();

            System.out.printf("%s 사원의 공제액을 입력하세요 (MAX 300,000원) : ", person[i][1]);
            benefit_pay[i] = keyboard.nextInt();
            keyboard.nextLine();
        }

        // 부서코드 -> 부서
        String[] department = new String[person.length];
        for (i = 0; i < person.length; i++) {
            if (data[i][0] == 1) {
                department[i] = "경리과";
            } else if (data[i][0] == 2) {
                department[i] = "인사과";
            } else if (data[i][0] == 3) {
                department[i] = "영업팀";
            } else if (data[i][0] == 4) {
                department[i] = "생산과";
            } else {
                department[i] = "서비스";
            }
        }

        // 보훈 -> 원호
        String[] bohun = new String[person.length];
        for (i = 0; i < person.length; i++) {
            if (data[i][1] == 1) {
                bohun[i] = "O";
            } else {
                bohun[i] = "X";
            }
        }

        // 본봉
        int[] salary = new int[person.length];
        for (i = 0; i < person.length; i++) {
            if (data[i][2] == 1) { // 1급
                if (data[i][3] == 1) {
                    salary[i] = base_pay[0][0];
                } else if (data[i][3] == 2) {
                    salary[i] = base_pay[0][1];
                } else if (data[i][3] == 3) {
                    salary[i] = base_pay[0][2];
                } else if (data[i][3] == 4) {
                    salary[i] = base_pay[0][3];
                } else {
                    salary[i] = base_pay[0][4];
                }
            } else if (data[i][2] == 2) { // 2급
                if (data[i][3] == 1) {
                    salary[i] = base_pay[1][0];
                } else if (data[i][3] == 2) {
                    salary[i] = base_pay[1][1];
                } else if (data[i][3] == 3) {
                    salary[i] = base_pay[1][2];
                } else if (data[i][3] == 4) {
                    salary[i] = base_pay[1][3];
                } else {
                    salary[i] = base_pay[1][4];
                }
            } else { // 3급
                if (data[i][3] == 1) {
                    salary[i] = base_pay[2][0];
                } else if (data[i][3] == 2) {
                    salary[i] = base_pay[2][1];
                } else if (data[i][3] == 3) {
                    salary[i] = base_pay[2][2];
                } else if (data[i][3] == 4) {
                    salary[i] = base_pay[2][3];
                } else {
                    salary[i] = base_pay[2][4];
                }
            }
        }

        // 직급수당
        int[] grade_salary = new int[person.length];
        for (i = 0; i < person.length; i++) {
            if (data[i][2] == 1) {
                grade_salary[i] = grade_pay[0];
            } else if (data[i][2] == 2) {
                grade_salary[i] = grade_pay[1];
            } else {
                grade_salary[i] = grade_pay[2];
            }
        }

        // 업무수당
        int[] department_salary = new int[person.length];
        for (i = 0; i < person.length; i++) {
            if (data[i][0] == 1) {
                department_salary[i] = department_pay[0];
            } else if (data[i][0] == 2) {
                department_salary[i] = department_pay[1];
            } else if (data[i][0] == 3) {
                department_salary[i] = department_pay[2];
            } else if (data[i][0] == 4) {
                department_salary[i] = department_pay[3];
            } else {
                department_salary[i] = department_pay[4];
            }
        }

        // 개인공제
        int[] personal_benefit = new int[person.length];
        for (i = 0; i < person.length; i++) {
            data[i][4] = (int) ((salary[i] + grade_salary[i] + department_salary[i]) * 0.03f);
            personal_benefit[i] = benefit_pay[i] + data[i][4];
        }


        // 세금
        int[] tax = new int[person.length];
        for (i = 0; i < person.length; i++) {
            int[] temp = new int[person.length];
            temp[i] = (salary[i] + grade_salary[i] + department_salary[i]) - personal_benefit[i];
            if (salary[i] > 700000) {
                if (data[i][1] == 1 && 700000 <= salary[i]) {
                    tax[i] = (int) (salary[i] * 0.03f);
                } else if (data[i][1] == 0 && 700000 <= salary[i] && salary[i] < 800000) {
                    tax[i] = (int) (salary[i] * 0.05f);
                } else if (data[i][1] == 0 && 800000 <= salary[i] && salary[i] < 1000000) {
                    tax[i] = (int) (salary[i] * 0.07f);
                } else {
                    tax[i] = (int) (salary[i] * 0.09f);
                }
            } else {
                tax[i] = 0;
            }
        }

        // 지급액
        int[] pay = new int[person.length];
        for (i = 0; i < person.length; i++) {
            pay[i] = salary[i] + department_salary[i] + grade_salary[i] - personal_benefit[i] - tax[i];
        }

        System.out.println("==========================================================================================================================");
        System.out.println("부서      사번      이름      급-호     원호      본봉      직급수당        업무수당        개인공제        세금      지급액     비고");
        System.out.println("==========================================================================================================================");
        for (i = 0; i < person.length; i++) {
            System.out.printf("%s   %s      %s      %d-%d       %s      %d      %d      %d      %d      %d      %d\n",department[i] ,person[i][0], person[i][1], data[i][2], data[i][3], bohun[i], salary[i], grade_salary[i], department_salary[i], personal_benefit[i], tax[i], pay[i]);
        }
        System.out.println("==========================================================================================================================");
    }
}