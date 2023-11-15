import java.util.Scanner;

/* while문과 break문을 사용하여 -1이 입력될 때까지 입력된 숫자의 개수를 출력하시오. */
public class week7_exam8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int data;

        int count = 0;
        while (true) {
            data = keyboard.nextInt();
            if (data != -1)
                count++;
            else
                break;
        }

        System.out.printf("%d개의 Data를 받았습니다.",count);
    }
}