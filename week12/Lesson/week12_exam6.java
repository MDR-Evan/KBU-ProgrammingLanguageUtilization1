import java.io.IOException;
import java.util.Scanner;

public class week12_exam6 {
    private static int add(int start, int end) {
        int result = 0;

        for (int i = start; i < end+1; i++) {
            result += i;
        }

        return result;
    }

    private static int readData(String input) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int data;
        while (true) {
            System.out.print(input);
            data = keyboard.nextInt();
            if (data > 0) {
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
        return data;
    }
    public static void main(String[] args) throws IOException {
        int start = readData("시작 데이터 입력 : "), end = readData("종료 데이터 입력 : ");
        if (end <= start) {
            System.err.println("Error");
            System.exit(-1);
        } else {
            System.out.printf("%d + %d + ··· ··· ··· + %d = %d\n", start, start+1, end, add(start, end));
            int result = add(start, end);
        }
    }
}
