public class week11_Report1 {
    public static void main(String[] args) {

        String[][] person = { //사번, 이름
                {"1123", "김달현"}, {"1123", "김달현"},
                {"1123", "김달현"}, {"1123", "김달현"},
                {"1123", "김달현"}, {"1123", "김달현"},
                {"1123", "김달현"}, {"1123", "김달현"},
                {"1123", "김달현"}, {"1123", "김달현"}
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
        int i = 0;

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
        
        /**
         * 공제금은 개인의 저축 금액으로 30만원을 넘지 않음
         * 기본 공제는 (기본급 + 업무 수당 + 직급 수당)의 3%
         * 개인 공제 = 공제금 + 기본 공제
         * 기본급과 각종 수당을 합한 금액에서 개인 공제를 뺀 금액을 과세 대상 금액으로 함
         * 세금은 과세 대상 금액을 기준으로 일정 요율을 적용
         * 보훈 대상자이면서 세금 대상자는 기본급의 3%의 세금만을 징수함
         * 지급액 = 본봉 + 업무수당 + 직급수당 - 개인공제 합(저축 + 기본 공제) - 세금
         * 출력 시 지급액의 내림차순으로 정렬할 것
         */

        System.out.println("==========================================================================================================================");
        System.out.println("부서      사번      이름      급-호     원호      본봉      직급수당        업무수당        개인공제        세금      지급액     비고");
        System.out.println("==========================================================================================================================");
        for (i = 0; i < person.length; i++) {
            System.out.printf("%s   %s      %s      %d-%d       %s      %d      %d      %d\n",department[i] ,person[i][0], person[i][1], data[i][2], data[i][3], bohun[i], salary[i], grade_salary[i], department_salary[i]);


        }
        System.out.println("==========================================================================================================================");
    }
}
