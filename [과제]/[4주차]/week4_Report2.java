import java.util.Scanner;

public class week4_Report2 {
    public static void main(String[] args) {
        Scanner keyboardm = new Scanner(System.in);

        int jumsu, grade;
        final int score = 60;
        final int ASCII = 'A'+9;
        char plus;

        System.out.print("점수 입력 : ");
        jumsu = keyboardm.nextInt();

        grade = (jumsu < score) || (jumsu == 0) ? 'F' : jumsu == 100 ? 'A' : (ASCII - jumsu/10);
        plus = (jumsu == 100) ? '+' : (jumsu < score) || (jumsu == 0) ? ' ' : (jumsu % 10) <= 4 ? '0' : '+';

        System.out.printf("점수 = %d\n학점 = %c%c\n",jumsu,grade,plus);
    }
}