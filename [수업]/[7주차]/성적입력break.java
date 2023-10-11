import java.io.IOException;
import java.util.Scanner;

public class 성적입력break {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int score, man = 0;
        
        while (true) {
            do {
                System.out.printf("%d번 째 학생의 JAVA 성적 입력 : ",man + 1);
                score = keyboard.nextInt();
                if (0 <= score && score <= 100)
                    break;
                else {
                    System.err.println("점수오류");
                    System.in.read();
                }
            } while (true);
            man++;
            if (man == 10)
                break;
        }

    }
}