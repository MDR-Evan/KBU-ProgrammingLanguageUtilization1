import java.util.Scanner;
/* 국어, 영어, 수학 성적을 입력하여 평균을 구하고 평균이 80점 이상이면 “성적 양호”, 60점 이상이면 “노력”을, 60점 미만이면 “성적 불량”을 출력하는 프로그램 작성하여라. */
public class week6_Report3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float Korean, English, Math, average;
        int grade;
        final int score = 60, ASCII = 'A'+9;
        char plus;
        String result;

        System.out.print("국어 점수 입력 : ");
        Korean = keyboard.nextInt();
        System.out.print("영어 점수 입력 : ");
        English = keyboard.nextInt();
        System.out.print("수학 점수 입력 : ");
        Math = keyboard.nextInt();

        average = (Korean + English + Math) / 3;

        if (average >= 80 ) {
            result = "성적 양호";
        } else if ( average >= 60) {
            result = "노력";
        } else {
            result = "성적 불량";
        }

        grade = (average < score) || (average == 0) ? 'F' : (int) (average == 100 ? 'A' : (ASCII - average / 10));
        plus = (average == 100) ? '+' : (average < score) || (average == 0) ? ' ' : (average % 10) <= 4 ? '0' : '+';

        System.out.printf("\n==========================================================\n");
        System.out.printf("\t국 어\t영 어\t수 학\t평  균\t학  점\t\t결 과\n");
        System.out.printf("\t %.0f\t\t %.0f\t\t %.0f\t\t%.2f\t  %c%c\t  %s", Korean, English, Math, average, grade, plus, result);
        System.out.printf("\n==========================================================");
    }
}
