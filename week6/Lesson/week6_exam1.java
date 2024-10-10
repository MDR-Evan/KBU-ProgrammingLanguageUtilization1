import java.util.Scanner;
/* 정수 num1, num2를 입력 받아 그 중에서 큰 수를 출력하 는 Program을 작성 하시오. */
public class week6_exam1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, result;

        System.out.print("두 개의 정수를 입력 하시오.\n");
        num1 = keyboard.nextInt();;
        num2 = keyboard.nextInt();

        // if문
        /*if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }*/
        
        // 조건연산자
        result = (num1 > num2) ? num1 : num2;

        System.out.printf("입력 받은 %d와 %d중 더 큰수는 %d 입니다.",num1,num2,result);
    }
}
