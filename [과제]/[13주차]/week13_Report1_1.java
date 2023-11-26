public class week13_Report1_1 { //0차원
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
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = triple(data[i][j][k]);
                }
            }
        }
        print(data, "\n******* Triple data *******");
    }

    private static int triple(int data) {
        data *= 3;
        return data;
    }

    private static void print(int[][][] data, String s) {
        System.out.printf("%s\n",s);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.printf("%4d, ",data[i][j][k]);
                    System.out.printf("\b\b");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
