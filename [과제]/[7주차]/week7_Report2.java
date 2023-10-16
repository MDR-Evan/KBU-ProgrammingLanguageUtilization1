import java.time.Year;

/*한 달에 500원짜리 동전, 100원짜리 동전 각각 10개를 돼지저금통에 저금하기로 하였다.
30년 동안 저금을 한다면 총 저금액이 얼마가 될지 계산하는 프로그램을 작성하시오
 */
public class week7_Report2 {
    public static void main(String[] args) {
        final int Save = (500 * 10) + (100 * 10);
        int result = 0;

        for (int year = 0; year <= 30; year++) {
            for (int month = 0; month <= 30; month++) {
                if (year == 30 && month == 12) {
                    result = Save * month * year;
                    System.out.printf("30년간 저금한 총 금액은 %,d 원 입니다.\n", result);
                }
            }
        }
    }
}