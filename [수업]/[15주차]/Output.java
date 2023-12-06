public class Output {
    public void display(String[][] person, int[][] data) {
        line();
        System.out.println("\t\t\t\t\t\t\t\t\t\t전\t기\t요\t금");
        line();
        System.out.println("\t번호\t\t이름\t\t세대수\t   사용량(Kw)\t기본요금\t\t사용요금\t\t부가가치세\t\t전력기금\t\t사용금액");
        line();
        for (int i = 0; i < person.length; i++) {
            System.out.printf("   %5s\t%3s\t  %1s\t\t\t%4s\t   %,7d\t   %,7d\t   %,7d\t\t  %,7d\t   %,7d\n",
                    person[i][0], person[i][1], person[i][2], person[i][3], data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
        }
        line();
    }

    public void line() {
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
    }

    public void sort(String[][] person, int[][] data) {
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (data[i][4] < data[j][4]) {
                    String[] Str_temp = new String[3];
                    Str_temp = person[j];
                    person[j] = person[i];
                    person[i] = Str_temp;

                    int[] int_temp = new int[3];
                    int_temp = data[j];
                    data[j] = data[i];
                    data[i] = int_temp;
                }
            }
        }
    }
}
