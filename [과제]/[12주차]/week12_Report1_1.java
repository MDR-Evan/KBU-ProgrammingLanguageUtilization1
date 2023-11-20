import java.util.Scanner;

public class week12_Report1_1 {
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

    private static int max4(int num1, int num2, int num3, int num4) {
        return max(max(max(num1,num2), num3), num4);
    }

    public static void main(String[] args) {
        int num1 = input_data(), num2 = input_data(), num3 = input_data(), num4 = input_data();
        System.out.printf("%d, %d, %d, %d중 가장 큰 값은 %d 입니다.", num1, num2, num3, num4, max4(num1, num2, num3, num4));
    }
}