import java.util.Scanner;
//다음 조건에 의해 나이(age)에 따른 체육관 입장료 계산하는 Program을 작성하여라.
public class Report1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        String fee;

        System.out.print("당신의 나이는 ? ");
        age = keyboard.nextInt();

        fee = (18 <= age) ? "4,000원" : (13 <= age && age < 18) ? "3,000원" : (7 <= age && age < 13) ? "1,000원" : "무료";
        System.out.printf("체육관 입장료 = %s", fee);
    }
}
