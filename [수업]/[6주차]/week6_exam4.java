import java.io.IOException;
import java.util.Scanner;
/* 다음 조건에 따라 급여액에 따른 세금을 계산하는 프로그램 을 작성하여라. 단, 30,000,000원 초과하는 급여 자는 없다 */
public class week6_exam4 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int money, tax;

        do {
            System.out.print("당신의 급여를 입력 하시오.\n");
            money = keyboard.nextInt();
            if (money >= 0 && money <= 30000000)
                break;
            else {
                System.err.print("급여 입력 오류");
                System.in.read();
            }
        } while (true);

        if (money < 2000000) {
            tax = 0;
        } else if (money <= 4000000) {
            tax = (int) ((money - 2000000) * 10 / 100.0);
        } else if (money <= 6000000) {
            tax = (int) ((money - 2000000) * 8 / 100.0);
        } else if (money <= 20000000) {
            tax = (int) ((money - 2000000) * 6 / 100.0);
        } else {
            tax = (int) ((money - 2000000) * 5 / 100.0);
        }

        System.out.printf("급여 : %,d원\n세금 : %,d원\n",money,tax);
    }
}
