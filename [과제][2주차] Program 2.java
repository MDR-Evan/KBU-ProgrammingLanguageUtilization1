import java.util.Scanner;

public class ScanMyData {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        float weight;
        float height;

        System.out.print("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요\n");
        age = keyboard.nextInt();
        weight = keyboard.nextFloat();
        height = keyboard.nextFloat();

        System.out.printf("당신의 나이는 %d살 입니다.\n",age);
        System.out.printf("당신의 체중은 %.1fkg 입니다.\n", weight);
        System.out.printf("당신의 신장은 %.1fcm 입니다. \n",height);
    }
}
