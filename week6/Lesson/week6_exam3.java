import java.util.Scanner;
/* 세 정수를 입력 받아, 그 중에서 가장 큰 수를 찾는 Program을 하여라. */
public class week6_exam3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;
        int result = 0;

        System.out.print("세 개의 정수를 입력 하시오.\n");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        // if문
        if (num1 > num2) {
            if (num1 > num3) {
                result = num1;
            } else {
                    result = num3;
            }
        } else if (num2 > num3) {
            result = num2;
        } else {
            result = num3;
        }

        System.out.printf("입력 받은 %d, %d, %d 중에서 가장 큰 수는 %d 입니다.",num1, num2, num3, result);
    }
}
