import java.util.Scanner;

public class week5_Report1 {
    public static void main(String[] args) {
/*우리나라 화폐에는 50,000원 권부터 1원짜리 동전까지 10개의 화폐가 있다. 원하는 금액을 입력 받아 가장 적은 수의 화폐로 교환하는 프로그램을 작성하여라.*/
        Scanner keyboard = new Scanner(System.in);

        int money, 오만원, 만원, 오천원, 천원, 오백원, 백원, 오십원, 십원, 오원, 일원, 계산;

        System.out.print("금액을 입력하시오. (단위 : 원)\n");
        money = keyboard.nextInt();

        오만원 = money / 50000;
        계산 = money % 50000;
        만원 = 계산 / 10000;
        계산 = 계산 % 10000;
        오천원 = 계산 / 5000;
        계산 = 계산 % 5000;
        천원 = 계산 / 1000;
        계산 = 계산 % 1000;
        오백원 = 계산 / 500;
        계산 = 계산 % 500;
        백원 = 계산 / 100;
        계산 = 계산 % 100;
        오십원 = 계산 / 50;
        계산 = 계산 % 50;
        십원 = 계산 / 10;
        계산 = 계산 % 10;
        오원 = 계산 / 5;
        계산 = 계산 % 5;
        일원 = 계산 / 1;

        System.out.printf("\n입력된 금액은 %,d원 입니다.\n",money);
        System.out.printf("**********잔돈**********\n");
        System.out.printf("오만원 : %d장\n",오만원);
        System.out.printf("만원 : %d장\n",만원);
        System.out.printf("오천원 : %d장\n",오천원);
        System.out.printf("천원 : %d장\n",천원);
        System.out.printf("오백원 : %d개\n",오백원);
        System.out.printf("백원 : %d개\n",백원);
        System.out.printf("오십원 : %d개\n",오십원);
        System.out.printf("십원 : %d개\n",십원);
        System.out.printf("오원 : %d개\n",오원);
        System.out.printf("일원 : %d개\n",일원);
        System.out.printf("**********************");
    }
}