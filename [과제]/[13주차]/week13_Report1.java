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

        // 1. 3차원 배열 전체 전달
        processEntireArray(data);

        // 2. 2차원 배열씩 부분 전달
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                processSubArray(new int[][]{data[i][j]}); // 2차원 배열 전달
            }
        }

        // 3. 1차원 배열씩 부분 전달
        for (int i = 0; i < data.length; i++) {
            processSingleArray(data[i]); // 1차원 배열 전달
        }

        // 4. 개별 원소로 전달
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = triple(data[i][j][k]); // 개별 원소 전달
                }
            }
        }

        print(data, "\n******* Processed data *******");
    }

    private static int triple(int value) { // 개별 원소로 전달
        return value * 3;
    }

    private static void processSubArray(int[][] data) { // 2차원 배열씩 부분 전달
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = triple(data[i][j]);
            }
        }
    }

    private static void processSingleArray(int[][] data) { // 3. 1차원 배열씩 부분 전달
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = triple(data[i][j]);
            }
        }
    }

    private static void processEntireArray(int[][][] data) { // 1. 3차원 배열 전체 전달
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
