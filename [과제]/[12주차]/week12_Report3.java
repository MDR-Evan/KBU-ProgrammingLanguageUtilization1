import java.util.Stack;

//import java.util.Scanner;
//
//public class week12_Report3 {
//    private static void variable() {
//        String[] number = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//        String[] money_1 = {"", "만", "억", "조"};
//        String[] money_2 = {"", "십", "백", "천"};
//        return;
//    }
//
//    private static long input_data() {
//        Scanner keyboard = new Scanner(System.in);
//
//        long money;
//
//        System.out.print("금액 입력 : ");
//        money = keyboard.nextLong();
//
//        return money;
//    }
//
//    private static void calculation() {
//
//    }
//}
import java.util.Scanner;

public class week12_Report3 {

    public static String convertNumberToHangul(String number) {
        String[] han1 = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String[] han2 = {"", "십", "백", "천"};
        String[] han3 = {"", "만", "억", "조", "경"};
        StringBuilder result = new StringBuilder();
        int len = number.length();
        int nowInt = 0;
        boolean hasHan3 = false;

        for (int i = len; i > 0; i--) {
            nowInt = Integer.parseInt(number.substring(len - i, len - i + 1));
            int han2Pick = (i - 1) % 4;

            if (nowInt > 0) {
                result.append(han1[nowInt]).append(han2[han2Pick]);
                if (han2Pick > 0) {
                    hasHan3 = false;
                }
            }

            if (!hasHan3 && han2Pick == 0) {
                result.append(han3[(i - 1) / 4]);
                hasHan3 = true;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("금액을 입력하세요: ");
        int inputNumber = scanner.nextInt();

        // 입력 받은 정수를 문자열로 변환하여 한글로 출력
        String numberString = Integer.toString(inputNumber);
        String hangulResult = convertNumberToHangul(numberString);

        System.out.println("한글로 변환된 결과: " + hangulResult + "원");

        scanner.close();
    }
}

