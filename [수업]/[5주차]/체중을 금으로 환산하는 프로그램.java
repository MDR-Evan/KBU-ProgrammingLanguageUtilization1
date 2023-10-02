import java.util.Scanner;

public class Program3 { // 당신의 체중을 입력 받아 금값으로 계산하는 Program (1,000원 미만은 버림)
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float weight, gram, result;
        final float gold = 3.75f, price = 316550; // 1 gold는 3.75 Kg, 316,000원
        long money;

        System.out.print("당신의 몸무게(Kg)는 ?\n 입력 : ");
        weight = keyboard.nextFloat();

        gram = weight * 1000;
        result = gram / gold;
        money = (long) (result * price);
        money /= 1000;
        money *= 1000;

        System.out.printf("\n 몸무게 %.1fKg은 %.0f돈이고, \n 금 1돈은 %,.0f원이면, 금으로 환산한 나의 몸값은 %,d원 입니다.", weight, result, price, money);
    }
}
