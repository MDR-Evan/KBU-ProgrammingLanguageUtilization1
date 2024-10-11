import java.io.IOException;
import java.util.Scanner;

public class week7_exam5 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int score;

        do{
            System.out.printf("JAVA 점수 입력 : ");
            score = keyboard.nextInt();
            if (score < 0 || 100 < score) {
                System.err.println("입력오류");;
                System.in.read();
                continue;
            } else {
                break;
            }
        } while (true);
    }
}