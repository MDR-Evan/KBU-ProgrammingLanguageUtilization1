import java.util.Scanner;
/* 가정용 수도요금 계산 프로그램을 다음 조건을 이용하여 작성하여라. */
public class week6_Report2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int contract, fee, 초과요금;
        final int 기본요금 = 1600, 용구 = 500;

        System.out.print("수도 사용량을 입력하시오. (단위 : L)\n");
        contract = keyboard.nextInt();

        if (contract <= 20) {
            fee = 기본요금 + 용구;
        } else if (21 <= contract || contract <= 40) {
            fee = 기본요금 + 용구 + ((contract - 20) * 125); // 초과요금 : 리터당 125원
        } else if (41 <= contract || contract <= 80) {
            fee = 기본요금 + 용구 + ((contract - 20) * 165); // 초과요금 : 리터당 165원
        } else if (81 <= contract || contract <= 100) {
            fee = 기본요금 + 용구 + ((contract - 20) * 185); // 초과요금 : 리터당 185원
        } else {
            fee = 기본요금 + 용구 + ((contract - 20) * 205); // 초과요금 : 리터당 205원
        }

        System.out.printf("\n수도 사용량 : %d L\n수도요금 : %,d원",contract,fee);
    }
}
