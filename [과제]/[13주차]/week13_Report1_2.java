public class week13_Report1_2 {     //  2차원 배열 전달
    public static void main(String[] args) {
        int[][][] data =
                {
                        {
                                {2, 4, 5}, {8, 7, 6}
                        },
                        {
                                {3, 5, 6}, {9, 12, 10}
                        }
                };

        print(data, "******* Source data *******");
        // 2. 2차원 배열씩 부분 전달
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                triple(new int[][]{data[i][j]});
            }
        }
        print(data, "\n******* Processed data *******");
    }
    private static void triple(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] *= 3;
            }
        }
    }
    private static void print(int[][][] data, String s) {
        System.out.printf("%s\n", s);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.printf("%4d, ", data[i][j][k]);
                    System.out.printf("\b\b");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}