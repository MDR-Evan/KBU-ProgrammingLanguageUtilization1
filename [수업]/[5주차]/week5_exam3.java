import java.util.Scanner;

public class Program2 { //사람은 평생 몇 회의 심작 박동을 하는지 구하는 Program
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int life, min;
        final int heart = 65, Year = 365, Day = 24, Hour = 60;  // 기호적 상수
        long count;

        System.out.print("당신의 이름은 ?\n 입력 : ");
        name = keyboard.nextLine();
        System.out.printf("%s님 나이는 ?\n 입력 : ", name);
        life = keyboard.nextInt();

        min = 1 * Year * Day * Hour; // 1년 = 8760시간 = 525,600분
        count = (long)life * min * heart;

        System.out.printf("\n****************** 분당 평균 심장 박동 : %d회 ******************\n%s님이 %d년 동안 살면서, 약 %d회의 심장박동이 이루어졌습니다.", heart, name, life, count);
    }
}
