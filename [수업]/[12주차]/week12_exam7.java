import java.util.Scanner;

public class week12_exam7 {
    private static int readData() {
        Scanner keyboard = new Scanner(System.in);
        int data;
        System.out.printf("정수 데이터 입력 : ");
        data = keyboard.nextInt();

        return data;
    }

    private static int count(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }

    private static int count3(int num1, int num2, int num3) {
        return count(count(num1, num2), num3);
    }

    private static int count4(int num1, int num2, int num3, int num4) {
        return count(count(num1, num2), count(num3, num4));
    }

    public static void main(String[] args) {
        int num1 = readData(), num2 = readData();

        System.out.printf("%d와 %d중 작은 값은 %d입니다.",num1, num2, count(num1, num2));
    }
}
