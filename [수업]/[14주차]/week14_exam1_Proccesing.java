public class week14_exam1_Proccesing {
    public void pay_stepProcess(String[][] person, int[][] money) {
        for (int i = 0; i < person.length; i++) {
            int pay_step = Integer.parseInt(person[i][2]);
            switch (pay_step) {
                case 1 : money[i][0] = 1650000;
                         break;
                case 2 : money[i][0] = 1680000;
                         break;
                case 3 : money[i][0] = 1700000;
                         break;
                case 4 : money[i][0] = 1720000;
                         break;
                case 5 : money[i][0] = 1750000;
                         break;
                default : money[i][0] = 0;
            }
        }
    }

    public void wagesProcess(int[][] money) {
        for (int i = 0; i < money.length; i++) {
            money[i][2] = money[i][0] +  money[i][1];
        }
    }

    public void taxProcess(int[][] money) {
        for (int i = 0; i < money.length; i++) {
            if (money[i][2] < 2000000) {
                money[i][3] = (int) (money[i][2] * (5.0f/100));
            } else if (money[i][2] < 2600000) {
                money[i][3] = (int) (money[i][2] * (8.0f/100));
            } else {
                money[i][3] = (int) (money[i][2] * (10.0f/100));
            }
        }
    }

    public void pensionProcess(int[][] money) {
        for (int i = 0; i < money.length; i++) {
            money[i][4] = (int) (money[i][2] * (7.3f/100));
        }
    }

    public void salaryProcess(int[][] money) {
        for (int i = 0; i < money.length; i++) {
            money[i][5] = money[i][2] - (money[i][3] + money[i][4]);
        }
    }
}
