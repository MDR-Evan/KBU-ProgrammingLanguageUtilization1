import java.util.Scanner;
// 키보드로부터 주민등록번호를 입력 받아 주민등록번호가 올바른 번호인지 아닌지를 검사하는 프로그램을 배열을 사용하여 작성하여라.
// 주민등록번호를 배열에 저장하여라
public class week9_Report3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        String idcard;
        int sum = 0, value = 0, result = 0;
        int[] verification = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        // 입력창
        System.out.printf("주민등록번호를 입력하세오.\n예시 : 000101-1111111\n입력 : ");
        idcard = id.nextLine();
        // 하이픈 제거
        char[] chars = idcard.replace("-", "").toCharArray();
        int[] IDcardnumber = new int[12];
        // 주민등록번호 오류검증
        for (int i = 0; i < 12; i++) {
            IDcardnumber[i] = Character.getNumericValue(chars[i]) * verification[i];
        }
        // 검증코드 추출
        for (int i = 0; i < 12; i++) {
            sum += IDcardnumber[i];
            value = sum % 11;
        }
        // 주민등록 검사 비트
        if (value < 10) {
            result = 11 - value;
        } else {
            result = 11 - 10;
        }
        // 출력창
        if (chars.length == 13) {
            char 주민번호 = chars[12];
            int 검증코드 = Character.getNumericValue(주민번호); // 12번째 숫자

            if (result == 검증코드) {
                System.out.println("올바른 주민번호입니다.");
            } else {
                System.out.println("올바르지 않은 주민번호입니다.");
            }
        } else {
            System.out.println("주민등록번호의 길이가 올바르지 않습니다.");
        }
    }
}