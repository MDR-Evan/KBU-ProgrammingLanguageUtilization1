public class week13_Report3 {
    public static void main(String[] args) {
        int[][] table = {{ 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        System.out.printf("right = %d, left = %d \n", countright(table), countleft(table));     //이게 대각선들 구한 값이고
        System.out.printf("right = %d, left = %d \n", count(table, "right"), count(table, "left")); // 얜 머임
    }

    private static Object countleft(int[][] table) {
        int i, j = 4;
        int result = 0;

        for (i = 0; i < table.length; i++, j--) {
            result += table[i][j];
        }
        return result;
    }
    private static Object countright(int[][] table) {
        int i, j = 0;
        int result = 0;

        for (i = 0; i < table.length; i++, j++) {
            result += table[i][j];
        }
        return result;
    }


}
