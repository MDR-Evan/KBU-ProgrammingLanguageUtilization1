import java.util.Scanner;

public class week3_exam1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String apple;
        int count;
        String name;
        float height;

        System.out.println("사과의 종류는 ?");
        apple = keyboard.nextLine();
        System.out.println("사과의 갯수는 ?");
        count = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("당신의 이름은 ?");
        name = keyboard.nextLine();
        System.out.println("당신의 키는 ?");
        height = keyboard.nextFloat();

        System.out.printf("사과의 종류는 %s이고, 사과의 갯수는 %d개 입니다.\n%s님의 키는 %.1fCM입니다.",apple, count, name, height);

    }
}
