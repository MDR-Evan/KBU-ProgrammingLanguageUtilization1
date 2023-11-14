/* 1에서 10 마일(mile)을 까지 입력 받아 미터(meter)법으로 환산하는 Program을 작성하여라 */
public class Mile을Meter로변환 {
    public static void main(String[] args) {
        float mile;
        final float unit = 1609.344f;

        for (int meter = 1; meter <= 10; meter++){
            mile = meter * unit;

            System.out.printf("%2d Meter는 %9.3f Mile 입니다.\n",meter,mile);
        }
        System.out.println("********************************");
        int meter = 1;
        while (meter <= 10){
            mile = meter * unit;

            System.out.printf("%2d Meter는 %9.3f Mile 입니다.\n",meter++,mile);
        }
    }
}