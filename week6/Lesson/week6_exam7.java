import java.util.Scanner;
/* 임의의 정수를 읽어서 그 수가 홀수인지 짝수인지를 판별하 는 순서도 및 Program을 작성하자. */
public class week6_exam7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num;
        String result;

        System.out.print("정수를 입력 하시오.\n");
        num = keyboard.nextInt();

        // if문
        /*if (num % 2 == 0) {
            result = "짝";
        }
        else {
            result = "홀";
        }*/

        // switch문
        /*switch (num % 2) {
            case 0 :
                result = "짝";
                break;
            default :
                result = "홀";
        }*/

        // 조건연산자
        result = (num % 2 == 0) ? "짝" : "홀";

        System.out.printf("\n입력 받은 정수 %d는 %s수 입니다.",num,result);
    }
}
