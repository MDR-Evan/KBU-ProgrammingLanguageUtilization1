import java.util.Scanner;

public class Refort3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int total, saving, life;
        double engel;
        String result;

        System.out.print("\t\t총 지출비를 입력하시오 : ");
        total = keyboard.nextInt();
        System.out.print("\t\t총 저축액을 입력하시오 : ");
        saving = keyboard.nextInt();

        life = total - saving;
        engel = (double) life / (double) total * 100;
        result = 0 <= engel && engel <= 30 ? "상류층" : 31 <= engel && engel <= 50 ? "중산층" : "하류층" ;

        System.out.printf("\n\t\t\t총 지출비 : %d원\n\t\t\t총 저축액 : %d원\n\t\t\t식 생활비 : %d원\n\t당신의 엥겔 지수는 %.0f%% 이고 %s입니다.\n",total,saving,life,engel,result);
    }
}