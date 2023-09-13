import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String school = "경복대학교";                    //선언문

        System.out.print("학교명 입력 : ");              // 입력 (Input)
        school = keyboard.nextLine();

        school = school + " 화이팅";                    // 처리 (Process)

        System.out.printf("학교명 : %s",school);        // 출력 (Output)
    }
}
