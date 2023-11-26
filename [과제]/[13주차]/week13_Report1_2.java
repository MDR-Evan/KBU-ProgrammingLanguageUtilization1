public class week13_Report1_2 { //1차원
    public static void main(String[] args) {
        int[][] data =
                {
                        {2, 4, 5}, {8, 7, 6}, {3, 5, 6}, {9, 12, 10}
                };

        print(data, "******* Source data *******");
        result();
        print(data, "\n******* Triple data *******");
    }

    private static void result(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j< data[i].length; j++) {
                triple(data[i][j]);
            }
        }
    }

    private static void triple(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 3;
        }
    }

    private static void print(int[][] data, String s) {
        System.out.printf("%s\n",s);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%4d, ",data[i][j]);
                System.out.printf("\b\b");
            }
            System.out.println();
        }
    }
}
