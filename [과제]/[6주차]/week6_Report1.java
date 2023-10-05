import java.util.Scanner;
/* 세 정수를 입력 받아 이를 대, 중, 소로 나뉘어 max, mid, min으로 할당하여 출력하는 Program을 작성하여라. */
public class week6_Report1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;
        int min = 0, mid = 0, max = 0;
        int high, low;

        System.out.print("세 정수를 입력하시오.\n");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        if (num1 > num2) {
            high = num1;
            low = num2;
        } else {
            high = num2;
            low = num1;
        }

        if (num3 > low) {
            min = low;
            if (num3 > high) {
                max = num3;
                mid = high;
            } else {
                max = high;
                mid = num3;
            }
        } else {
            max = high;
            mid = low;
            min = num3;
        }

        System.out.printf("입력받은 %d, %d, %d를 크기 순으로 나열하면 %d, %d, %d 입니다.", num1, num2, num3, min, mid, max);
    }
}