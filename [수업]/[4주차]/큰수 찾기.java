import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2;
        int result;
        String result_1;

        System.out.printf("같지 않은 정수 2개 입력 : \n");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        result = num1 == num2 ? 0 : num1 > num2 ? num1 : num2;
        result_1 = result == 0 ? "같다" : String.format("%d가 크다.",result);

        System.out.printf("입력 받은 정수 : %d, %d\n",num1,num2);
        System.out.printf("결과 : %s\n",result_1);
    }
}
