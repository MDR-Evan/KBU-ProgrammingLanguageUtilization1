import java.util.Scanner;

public class week2_Report1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.print("이름 : ");
        name = keyboard.nextLine();

        System.out.printf("안녕하십니까 ? %s님",name);
    }
}