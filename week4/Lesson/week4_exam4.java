import java.util.Scanner;

public class week4_exam4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char ch;
        String result;

        System.out.printf("하나의 문자 입력 : ");
        ch = keyboard.next().charAt(0);

        result = ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' ? "올바른 문자 입니다" : "올바르지 않은 문자 입니다.";

        System.out.printf("입력 받은 문자 %c는 %s\n",ch,result);
    }
}
