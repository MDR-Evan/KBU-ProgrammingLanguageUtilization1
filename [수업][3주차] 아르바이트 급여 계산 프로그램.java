import java.util.Scanner;

public class test4 { // 아르바이트 급여 계산
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int wallat, pay, time, salary;
        final int Week = 7; //일주일 Symbolic Constant

        System.out.printf("현재 지갑에 얼마 있나요 ?\n");
        wallat = keyboard.nextInt();
        System.out.printf("시간당 임금이 얼마 인가요 ? \n");
        pay = keyboard.nextInt();
        System.out.printf("몇시간이나 근로했나요 ? \n");
        time = keyboard.nextInt();

        salary = pay * time * Week;

        System.out.printf("현재 지갑의 돈 : %d원 \n",wallat);
        System.out.printf("시간당 임금 : %d원 \n",pay);
        System.out.printf("하루에 %d시간 일하였습니다.\n",time);
        System.out.printf("주급 : %d원 \n",salary);
        System.out.printf("나의 총 자산은 : %d원",salary+wallat);
    }
}
