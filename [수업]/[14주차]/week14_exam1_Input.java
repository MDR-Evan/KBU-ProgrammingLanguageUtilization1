import java.io.IOException;
import java.util.Scanner;

public class week14_exam1_Input {
    public void dataRead(String[][] person, int[][] money) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < person.length; i++) {
            System.out.printf("%s님의 수당을 입력하시오.\n -> ",person[i][0]);
            money[i][1] = keyboard.nextInt();
            if (!(0 <= money[i][1] && money[i] [1] <= 1000000)) {
                System.err.println("오!!!!!류!!!!!발!!!!!생!!!!!");
                System.in.read();
                i--;
            }
        }
    }
    public void give(int[][] money) throws IOException {
        for (int i = 0; i < money.length; i++) {
            money[i][1] = 1000000 ;
        }
    }

}
