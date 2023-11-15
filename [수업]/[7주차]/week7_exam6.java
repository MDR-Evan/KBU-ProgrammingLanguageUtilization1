import java.io.IOException;
import java.util.Scanner;

/* 어떤 양의 정수를 입력 받아 그것이 소수인지 검사하는 프 로그램을 작성하여라. */
public class week7_exam6 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int num, count = 0;

        /*
        do {
            int num;
            System.out.print("양의 정수 입력 : ");
            num = keyboard.nextInt();
            if (1 < num){
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        } while (true);
         */
        for (num = 2; num <= 100; num++)
            count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                count++;
            }
        }

        if (count != 0) {
            System.out.printf("%d는 소수가 아닙니다.\n",num);
        } else {
            System.out.printf("%d는 소수입니다.\n",num);
        }
    }
}