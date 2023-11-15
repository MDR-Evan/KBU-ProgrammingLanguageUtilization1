import java.util.Scanner;
/* 사용자의 나이와 성별, 키, 몸무게를 입력 받은 후 표준 체 중을 구하고 다음 공식을 이용하여 얼마나 저 체중, 정상 또 는 초과(경도, 중등도, 경도비만) 인지를 표시하는 프로그램 을 작성하여라 */
public class week6_exam6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char gender;
        int height, weight;
        float standard;
        String result, message = "필요 없습니다.";

        System.out.print("성별을 고르시오.\n(남자 = 1, 여자 = 2)\n");
        gender = keyboard.nextLine().charAt(0);
        System.out.print("키를 입력하시오 : ");
        height = keyboard.nextInt();
        System.out.print("몸무게를 입력하시오 : ");
        weight = keyboard.nextInt();

        if (gender == 1) {
            standard = (height - 100) * 0.9f;
        } else {
            standard = (height - 100) * 0.85f;
        }

        float ratio = (weight - standard) / standard * 100;
        if (ratio <= -10.0f) {
            result = "저체중";
        } else if (ratio < 20.0f) {
            result = "정상";
        } else if (ratio <= 29.0f) {
            result = "경도 비만";
        } else if (ratio <= 49.0f) {
            result = "중등도 비만";
        } else {
            result = "고도 비만";
        }

        if (result.equals("경도 비만") || result.equals("중등도 비만") || result.equals("고도 비만")) {
            message = "필요 합니다.";
        }

        System.out.printf("\n키가 %d Cm인 %c자의 표준체중은 %.1f Kg 입니다.\n당신은 %s으로 표준체중보다 %.1f%% (%.1f Kg) %s 입니다.\n당신은 다이어트가 %s\n",height, gender == '1' ? '남' : '여' , standard, result, ratio, Math.abs(weight - standard), (standard > weight) ? "미달" : "초과",message);
    }
}
