import java.io.IOException;
import java.util.Scanner;

public class exam5 {
    static int readData(String s) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int lenght;
        while (true) {
            System.out.printf(s);
            lenght = keyboard.nextInt();
            if (lenght > 0) {
                break;
            } else {
                System.err.println("입력오류");
                System.in.read();
            }
        }
        return lenght;
    }

    public static int area(int col, int row) {
        return col * row;
    }

    public static void display(int col, int row, int area) {
        char type = type(col, row);
        System.out.printf("%c사각형의 가로 길이 : %d ㎝", type, col);
        System.out.printf("%c사각형의 세로 길이 : %d ㎝", type, row);
        System.out.printf("%c사각형의 면적 : %d ㎠", type, area);
    }

    private static char type(int col, int row) {
        char result = '직';
        if (col == row) {
            result = '정';
        }
        return result;
    }
}
