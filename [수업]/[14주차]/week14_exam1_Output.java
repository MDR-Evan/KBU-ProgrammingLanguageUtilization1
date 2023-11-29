public class week14_exam1_Output {
    public void display(String[][] person, int[][] money) {
        line();
        System.out.println("\t  이름\t사번\t\t호봉\t\t  기본급\t\t   수당\t\t  급여액\t\t\t세금\t\t\t연금\t\t  지급액");
        line();
        for (int i = 0; i < person.length; i++) {
            System.out.printf("\t%4s\t%4s\t%2s\t\t%,9d\t%,9d\t%,9d\t%,9d\t%,9d\t%,9d\n",
                    person[i][0], person[i][1], person[i][2], money[i][0], money[i][1], money[i][2], money[i][3], money[i][4], money[i][5]);
        }
        line();
    }

//    public void display(String[] person) {                                                                              // 메소드 오버로딩
//        System.out.printf("\t%4s\t%5s\t%2s\n",person[0], person[1], person[2]);
//    }

    public void line() {
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
    }

    public void sort(String[][] person, int[][] money) {
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (money[i][5] < money[j][5]) {
                    String[] Str_temp = new String[3];
                    Str_temp = person[j];
                    person[j] = person[i];
                    person[i] = Str_temp;

                    int[] int_temp = new int[3];
                    int_temp = money[j];
                    money[j] = money[i];
                    money[i] = int_temp;
                }
            }
        }
    }
}
