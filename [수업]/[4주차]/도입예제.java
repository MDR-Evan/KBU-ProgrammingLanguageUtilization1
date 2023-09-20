import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num;
        char result;
        String result_1;

        System.out.print("정수 입력 : ");
        num = keyboard.nextInt();

        result = (num == 0) ? '0' : (num > 0 ? '양' : '음');
        result_1 = result == '0' ?
                String.format("%c 입니다.\n",result) :
                String.format("%c수 입니다.\n",result);

        System.out.printf("입력 받은 정수 %d는 %s",num, result_1);
    }
}
