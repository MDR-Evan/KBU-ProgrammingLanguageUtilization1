import java.io.IOException;
import java.util.Scanner;

public class Input {
    public void dataRead(String[][] person, int[][] data) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        for (int i = 0; i < person.length; i++) {
            System.out.printf("사용자님의 이름을 입력하시오.\n -> ");
            person[i][1] = keyboard.next();
            System.out.printf("%s님의 사용자 번호를 입력하시오.\n -> ",person[i][1]);
            person[i][0] = keyboard.next();
            System.out.printf("%s님의 세대수를 입력하시오.\n -> ",person[i][1]);
            person[i][2] = keyboard.next();
            System.out.printf("%s님의 전기사용량(Kw)을 입력하시오.\n -> ",person[i][1]);
            person[i][3] = keyboard.next();
            if (!(person[i][0].length() == 5)){
                System.err.println("사용자번호는 숫자로 5자리 입니다. 다시 입력해주세요.");
                System.in.read();
                i--;
            }
            System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        }

    }
}
