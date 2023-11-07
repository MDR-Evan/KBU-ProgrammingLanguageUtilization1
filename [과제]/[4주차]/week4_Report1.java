import java.util.Scanner;

public class week4_Report1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char ch, convert, resultS, resultC;
        String result;

        System.out.print("문자를 입력하시오 : ");
        ch = keyboard.next().charAt(0);

        convert = ('a' <= ch && ch <= 'z') ? '소' : ('A' <= ch && ch <= 'Z') ? '대' : 'x';
        resultS = convert == '소' ? (char) (ch - 32) : convert == '대' ? (char) (ch + 32) : 'E';
        result = convert == '소' ?
                String.format("입력문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.",ch ,resultS) :
                convert == '대' ?
                        String.format("입력문자는 %c는 대문자이고, 소문자로 변경하면 %c 입니다.",ch ,resultS) :
                        convert == 'x' ?
                                String.format("영문자가 아닙니다.") :
                                String.format("Error");

        System.out.printf("\n%s\n",result);
    }
}
