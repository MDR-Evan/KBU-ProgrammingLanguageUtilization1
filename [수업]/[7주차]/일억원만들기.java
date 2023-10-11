/* 첫날은 1원부터 시작하여 다음날은 전날의 2배의 저축을 하면 언제 1억원에 도달할 수 있을까요? */
public class 일억원만들기 {
    public static void main(String[] args) {
        int day = 0, money = 1, bank = 0;

        while (true) {
            day++;
            bank += money;
            if (100000000 <= bank){
                break;
            } else {
                System.out.printf("%3d일\t입금액 : %,10d 원\t잔액 : %,10d 원\n",day,money,bank);
            }
            money *= 2;
        }

        System.out.printf("\n\n\t\t\t%3d일\t잔액 : %,10d",day,bank);
    }
}