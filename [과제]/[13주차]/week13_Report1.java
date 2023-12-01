public class week13_Report1 {
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

        triple(data);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                triple2(new int[][]{data[i][j]});
            }
        }

        for (int i = 0; i < data.length; i++) {
            triple1(data[i]);
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = triple(data[i][j][k]);
                }
            }
        }

        print(data, "\n******* Processed data *******");
    }

    private static int triple(int value) { // 개별 원소로 전달
        return value * 3;
    }

    private static void triple2(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = triple(data[i][j]);
            }
        }
    }

    private static void triple1(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = triple(data[i][j]);
            }
        }
    }

    private static void triple(int[][][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = triple(data[i][j][k]);
                }
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
