public class week13_Report1_3 {
    public static void main(String[] args) {
        int[] data;
        data = triple();

        print(data, "******* Source data *******");


        for (int i = 0; i < data.length; i++) {
            triple(data[i]);
        }


        print(data, "\n******* Triple data *******");
    }

    private static int[] triple() {
        int[][] data = {{2, 4, 5}, {8, 7, 6}, {3, 5, 6}, {9, 12, 10}};

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] *= 3;
            }
        }
    }

    private static void print(int[][] data, String s) {
        System.out.printf("%s\n",s);
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%4d, ",data[i]);
            System.out.printf("\b\b");
            System.out.println();
        }
    }
}