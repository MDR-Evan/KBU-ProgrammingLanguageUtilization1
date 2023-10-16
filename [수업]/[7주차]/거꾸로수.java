import java.io.IOException;
import java.util.Scanner;
/* 9자리 이하의 정수를 입력받아 입력된 수의 거꾸로 수를 구 하는 프로그램을 작성하여라. */
public class 거꾸로수 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        final int Max = 999999999;
        int num, reverse = 0, temp;

        do {
            System.out.print("9자리 이하의 숫자를 입력 :");
            num = keyboard.nextInt();

            if (num <= Max && -Max <= num) {
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        } while (true);

        System.out.printf("%,d의 숫자를 반전하면 ",num);

        do {
            reverse *= 10;
            temp = num % 10;
            reverse += temp;
            num /= 10;
        } while (num != 0);

        System.out.printf("%,d입니다.",reverse);
    }
}