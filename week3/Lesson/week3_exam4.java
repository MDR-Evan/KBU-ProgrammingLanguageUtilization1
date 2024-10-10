import java.util.Scanner;

public class week3_exam4 { //예제 : 자동차 연비 계산
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float oil, kilo, 연비;

        System.out.printf("자동차 연료 사용량 입력 : ");
        oil = keyboard.nextFloat();
        System.out.printf("주행 거리 입력 : ");
        kilo = keyboard.nextFloat();

        연비 = kilo / oil;

        System.out.printf("\n연료량 : %.2f L\n",oil);
        System.out.printf("주행거리 : %.2f Km\n",kilo);
        System.out.printf("연비 : %.2f Km/L\n",연비);
    }
}
