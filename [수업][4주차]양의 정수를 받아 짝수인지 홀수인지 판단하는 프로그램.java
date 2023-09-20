import java.util.Scanner;

public class Ex {//양의 정수를 받아 짝수인지 홀수인지 판단하는 프로그램 작성
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num;
        char result;

        System.out.print("양의 정수 입력 : ");
        num = keyboard.nextInt();

        result = (num % 2 == 0) ? '짝' : '홀';

        System.out.printf("\n입력 받은 %d는 %c수 입니다.\n",num, result);
    }
}
