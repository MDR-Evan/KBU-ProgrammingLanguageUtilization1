import java.util.Scanner;
//임의의 문자열을 입력 받아 역순으로 출력하는 Program을 작성하시오.
public class week9_exam1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String temp;

        System.out.print("문자열 입력 : ");
        temp = keyboard.nextLine();

        char[] reverse = new char[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            reverse[temp.length() - i - 1] = temp.charAt(i);
        }
        System.out.println("\t역순 출력");
        System.out.println("      " + new String(reverse));

        char[] convert = new char[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) >= 'A' && temp.charAt(i) <= 'Z') {
                convert[i] = (char) (temp.charAt(i) + 32);
            } else if (temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z') {
                    convert[i] = (char) (temp.charAt(i) - 32);
            } else {
                convert[i] = temp.charAt(i);
            }
        }

        System.out.println("\t대소문자 변환 출력");
        System.out.println("      " + new String(convert));

        char[] encryption = new char[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            encryption[i] = (char) (temp.charAt(i) + 5);
        }

        System.out.println("\t암호화 출력");
        System.out.println("      " + new String(encryption));

        char[] descryption = new char[encryption.length];
        for (int i = 0; i < encryption.length; i++) {
            descryption[i] = (char) (encryption[i] - 5);
        }

        System.out.println("\t복호화 출력");
        System.out.println("      " + new String(descryption));
    }
}
