import java.util.Scanner;

public class week11_Report1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[][] person = {//new String[10][2] 
                {"0216", "김진용"}, {"1111", "김선민"},
                {"2222", "김익주"}, {"3333", "오정민"},
                {"4444", "김광호"}, {"5555", "이순주"},
                {"6666", "설재승"}, {"7777", "김진형"},
                {"8888", "지나"}, {"9999", "하피제"}
        }; // 사번 | 이름
        int[][] data = {//new int[10][6];
                {1, 1, 1, 5, 1, 0}, {2, 1, 2, 4, 2, 0},
                {3, 0, 3, 3, 3, 0}, {4, 0, 4, 2, 4, 0},
                {1, 1, 5, 1, 5, 0}, {1, 1, 1, 5, 6, 0},
                {1, 1, 2, 4, 7, 0}, {1, 1, 3, 3, 8, 0},
                {1, 1, 4, 2, 9, 0}, {1, 1, 5, 1, 10, 0}
        };// 부서코드 | 보훈(원호) | 급 | 호 | 공제액 | 기본공제
        int i = 0;
        // 입력
        for (i = 0; i < person.length; i++) {
            System.out.println("==================================================================");
            // 이름
            System.out.printf("사원 %d번의 이름을 입력하세요 : ", i + 1);
            person[i][1] = keyboard.nextLine();
            person[i][0] = null;
            data[i][0] = 0;
            // 사번
            System.out.printf("%s 사원의 사번을 입력하세요 : ", person[i][1]);
            while (person[i][0] == null) {
                String ID = keyboard.nextLine();
                if (ID.length() == 4) {
                    person[i][0] = ID;
                } else {
                    System.err.print("사번은 4자여야 합니다. 다시 입력해주세요 : ");
                }
            }
            // 부서코드
            System.out.printf("%s 사원의 부서코드를 입력하세요 : ", person[i][1]);
            while (true) {
                int department = keyboard.nextInt();

                if (0 < department && department < 6) {
                    data[i][0] = department;
                    break;
                } else {
                    System.err.print("부서코드는 [ 1 경리팀, 2 인사팀, 3 영업팀, 4 생산팀, 5 서비스 ]입니다. 다시 입력해주세요 : ");
                    keyboard.nextLine();
                }
            }
            // 보훈
            System.out.printf("%s 사원의 보훈의 여부를 입력하세요 ('O' = 1, 'X' = 0): ", person[i][1]);
            while (true) {
                int bohun = keyboard.nextInt();

                if (0 == bohun || 1 == bohun) {
                    data[i][1] = bohun;
                    break;
                } else {
                    System.err.print("보훈대상자 구분은 [ 보훈대상자가 아니면 '0' 보훈대상자가 맞으면 '1' ]입니다. 다시 입력해주세요 : ");
                    keyboard.nextLine();
                }
            }
            // 직급
            System.out.printf("%s 사원의 직급을 입력하세요 : ", person[i][1]);
            while (true) {
                int grade = keyboard.nextInt();

                if (0 < grade && grade < 4) {
                    data[i][2] = grade;
                    break;
                } else {
                    System.err.print("직급은 [ 1 ~ 3급 ]입니다. 다시 입력해주세요 : ");
                    keyboard.nextLine();
                }
            }
            // 호봉
            System.out.printf("%s 사원의 호봉을 입력하세요 : ", person[i][1]);
            while (true) {
                int clas = keyboard.nextInt();

                if (0 < clas && clas < 6) {
                    data[i][3] = clas;
                    break;
                } else {
                    System.err.print("호봉은 [ 1 ~ 5호봉 ]입니다. 다시 입력해주세요 : ");
                    keyboard.nextLine();
                }
            }
            // 공제액
            System.out.printf("%s 사원의 공제액을 입력하세요 : ", person[i][1]);
            while (true) {
                int benefit = keyboard.nextInt();

                if (0 <= benefit && benefit <= 300000) {
                    data[i][4] = benefit;
                    break;
                } else {
                    System.err.print("공제액은 [ 최대 300,000원 ]까지 저축 가능합니다. 다시 입력해주세요 : ");
                    keyboard.nextLine();
                }
            }
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
            bohun[i] = data[i][1] == 1 ? "O" : "X";
        }
        // 본봉
        int[] salary = new int[person.length];
        for (i = 0; i < person.length; i++) {
            if (data[i][2] == 1) { // 1급
                if (data[i][3] == 1) {
                    salary[i] = 1250000;
                } else if (data[i][3] == 2) {
                    salary[i] = 1200000;
                } else if (data[i][3] == 3) {
                    salary[i] = 1150000;
                } else if (data[i][3] == 4) {
                    salary[i] = 1100000;
                } else {
                    salary[i] = 1050000;
                }
            } else if (data[i][2] == 2) { // 2급
                if (data[i][3] == 1) {
                    salary[i] = 950000;
                } else if (data[i][3] == 2) {
                    salary[i] = 925000;
                } else if (data[i][3] == 3) {
                    salary[i] = 900000;
                } else if (data[i][3] == 4) {
                    salary[i] = 875000;
                } else {
                    salary[i] = 850000;
                }
            } else { // 3급
                if (data[i][3] == 1) {
                    salary[i] = 750000;
                } else if (data[i][3] == 2) {
                    salary[i] = 725000;
                } else if (data[i][3] == 3) {
                    salary[i] = 700000;
                } else if (data[i][3] == 4) {
                    salary[i] = 675000;
                } else {
                    salary[i] = 650000;
                }
            }
        }
        // 직급수당
        int[] grade_salary = new int[person.length];
        for (i = 0; i < person.length; i++) {
            if (data[i][2] == 1) {
                grade_salary[i] = 300000;
            } else if (data[i][2] == 2) {
                grade_salary[i] = 200000;
            } else {
                grade_salary[i] = 100000;
            }
        }
        // 업무수당
        int[] department_salary = new int[person.length];
        for (i = 0; i < person.length; i++) {
            if (data[i][0] == 1) {
                department_salary[i] = 250000;
            } else if (data[i][0] == 2) {
                department_salary[i] = 250000;
            } else if (data[i][0] == 3) {
                department_salary[i] = 350000;
            } else if (data[i][0] == 4) {
                department_salary[i] = 350000;
            } else {
                department_salary[i] = 300000;
            }
        }
        // 개인공제
        int[] personal_benefit = new int[person.length];
        for (i = 0; i < person.length; i++) {
            data[i][5] = (int) ((salary[i] + grade_salary[i] + department_salary[i]) * 0.03f);
            personal_benefit[i] = data[i][4] + data[i][5];
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

        // pay 배열을 기준으로 한 버블 정렬
        for (int j = 0; j < person.length - 1; j++) {
            for (int k = 0; k < person.length - 1 - j; k++) {
                if (pay[k] < pay[k + 1]) {
                    // pay 배열 원소 교환
                    int tempPay = pay[k];
                    pay[k] = pay[k + 1];
                    pay[k + 1] = tempPay;

                    // 다른 배열에 대응하는 요소 교환
                    // 부서 교환
                    String tempDepartment = department[k];
                    department[k] = department[k + 1];
                    department[k + 1] = tempDepartment;

                    // 사원 번호 교환
                    String tempPersonID = person[k][0];
                    person[k][0] = person[k + 1][0];
                    person[k + 1][0] = tempPersonID;

                    // 사원 이름 교환
                    String tempPersonNAME = person[k][1];
                    person[k][1] = person[k + 1][1];
                    person[k + 1][1] = tempPersonNAME;

                    // 직급, 호봉, 보훈, 본봉 교환
                    int tempGrade = data[k][2];
                    data[k][2] = data[k + 1][2];
                    data[k + 1][2] = tempGrade;

                    int tempClas = data[k][3];
                    data[k][3] = data[k + 1][3];
                    data[k + 1][3] = tempClas;

                    int tempBohun = data[k][1];
                    data[k][1] = data[k + 1][1];
                    data[k + 1][1] = tempBohun;

                    int tempSalary = salary[k];
                    salary[k] = salary[k + 1];
                    salary[k + 1] = tempSalary;

                    // 직급수당, 업무수당, 개인공제, 세금, 지급액 교환
                    int tempGradeSalary = grade_salary[k];
                    grade_salary[k] = grade_salary[k + 1];
                    grade_salary[k + 1] = tempGradeSalary;

                    int tempDepartmentSalary = department_salary[k];
                    department_salary[k] = department_salary[k + 1];
                    department_salary[k + 1] = tempDepartmentSalary;

                    int tempPersonalBenefit = personal_benefit[k];
                    personal_benefit[k] = personal_benefit[k + 1];
                    personal_benefit[k + 1] = tempPersonalBenefit;

                    int tempTax = tax[k];
                    tax[k] = tax[k + 1];
                    tax[k + 1] = tempTax;
                }
            }
        }

        System.out.println("====================================================================================================================================================================================");
        System.out.println("\t  부서 \t\t사번 \t\t이름 \t\t급 - 호 \t\t원호 \t\t본봉 \t\t\t  직급수당 \t\t\t  업무수당 \t\t\t  개인공제 \t\t\t  세금 \t\t\t 지급액 \t\t\t비고");
        System.out.println("====================================================================================================================================================================================");
        for (i = 0; i < person.length; i++) {
            System.out.printf("\t%4s \t\t%4s \t %5s \t\t%1d - %1d \t\t %1s \t\t  %,9d \t\t%,9d \t\t\t%,9d \t\t\t%,9d \t\t  %,9d \t   %,9d\n",department[i] ,person[i][0], person[i][1], data[i][2], data[i][3], bohun[i], salary[i], grade_salary[i], department_salary[i], personal_benefit[i], tax[i], pay[i]);
        }
        System.out.println("====================================================================================================================================================================================");
    }
}