public class week13_exam4 {
    public static void main(String[] args) {
        int[][] data = {{1, 3, 6, 9, 12}, {1, 2, 4, 8, 16}};

        display(data, "Before");

//        multiple(data);     // call by reference
//        for (int i = 0; i < data.length; i++) {     // call by referene 1차원 배열
//            multiple(data[i]);
//        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {  // call by value
                data[i][j] = multiple(data[i][j]);
            }
        }

        display(data, "After");
    }

    private static int multiple(int data) {

        data *= 2;
        return  data;
    }

    private static void multiple(int[] data) {    // 1차원
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }

    private static void multiple(int[][] data) {    // 2차원
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] *= 2;
            }
        }
    }

    private static void display(int[][] data, String After) {
        System.out.printf("%s\n",After);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%4d, ", data[i][j]);
            }
        }
        System.out.println("\b\b");
    }
}


