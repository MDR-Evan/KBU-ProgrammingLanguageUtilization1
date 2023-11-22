public class week13_exam5 {
    public static void main(String[] args) {
        int[][][] data =
                {
                    {
                        {1,2,3},{4,5,6},{10,20,30},{40,50,60}
                    },
                    {
                        {1,2,3},{4,5,6},{10,20,30},{40,50,60}
                    }
                };
        display(data,"before");
//        multiful(data);       // call by reference 3차원 배열
//        for (int i = 0; i < data.length; i++) {
//            multiful(data[i]);      // call by reference 2차원 배열
//        }
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                multiful(data[i][j]);   // call by reference 1차원 배열
//            }
//        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = multiful(data[i][j][k]);   // call by value
                }
            }
        }
        display(data, "after");
    }

    private static int multiful(int data) {
        data *= 2;
        return data;
    }
    private static void multiful(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }
    private static void multiful(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0 ; j < data[i].length; j++) {
                data[i][j] *= 2;
            }
        }
    }
    private static void multiful(int[][][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0 ; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] *= 2;
                }
            }
        }
    }

    private static void display(int[][][] data, String before) {
        System.out.printf("%s",before);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0 ; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.printf("%4d, ",data[i][j][k]);
                    System.out.printf("\b\b");
                }
            }
            System.out.println();
        }
    }
}
