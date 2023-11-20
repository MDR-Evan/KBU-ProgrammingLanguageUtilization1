import java.util.Scanner;

public class week12_Report1 {
    private static int input_data() {
        Scanner keyboard = new Scanner(System.in);

        int data;

        System.out.print("정수 입력 : ");
        data = keyboard.nextInt();

        return data;
    }

    private static int max(int num1, int num2) {
        return num1 < num2 ? num2 : num1;
    }

    public static void main(String[] args) {
        int num1 = input_data(), num2 = input_data();

        System.out.printf("%d와 %d중 큰 값은 %d 입니다.", num1, num2, max(num1, num2));
    }
}