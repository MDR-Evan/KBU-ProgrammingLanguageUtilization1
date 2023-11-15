import java.util.Scanner;

public class week2_exam6{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String address;

        System.out.println("당신의 이름은 ?");
        name = keyboard.nextLine();
        System.out.printf("%s의 나이은 ?\n",name);
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s의 주소은 ?\n",name);
        address = keyboard.nextLine();

        System.out.printf("%s의 나이는 %d 살 입니다.\n주소는 %s입니다.",name, age, address);
    }
}