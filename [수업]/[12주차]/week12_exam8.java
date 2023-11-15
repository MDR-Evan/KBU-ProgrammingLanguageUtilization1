import java.util.Scanner;

public class week12_exam8 {
    private static String convert(int number, int base) {
        char[] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E'};
        String result = "";
        while (number != 0) {
            int index = number % base;
            result = digit[index] + result;
            number /= base;
        }
        return result;
    }

    private static int input(String input){
        Scanner keyboard = new Scanner(System.in);
        int data;
        System.out.print(input);
        data = keyboard.nextInt();

        return data;
    }
    public static void main(String[] args) {
        int number = input("변환할 자연수 입력 : "), base = input("변환할 진법 입력 : ");

        System.out.printf("%d의 %d진법의 값 : %s", number, base, convert(number,base));
    }
}
