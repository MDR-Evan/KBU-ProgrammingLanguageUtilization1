import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//체조 경기장에서 한 선수의 경기 내용을 7인의 채점관이 채점하여 최고 점수와 최소 점수를 제외한 5명의 채점관 점수를 평균하여 최종 점수로 한다.
//점수는 100.0점 만점으로 최소 점수는 60.0점이다
//홍길동 선수의 최종 점수를 계산하여라.
public class week9_Report2 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        Double[] scores = new Double[7];
        String[] name = {"1감독","2감독","3감독","4감독","5감독","6감독","7감독"};
        Double sum = 0.0;
        Double avr = 0.0;

        // Zero Count
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (double) 0;
        }
        // 점수 입력
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%s 점수 입력 : ",name[i]);
            scores[i] = keyboard.nextDouble();
            if (60.0 <= scores[i] && scores[i] <= 100.0) {
            } else {
                System.err.println("입력 오류!\n점수는 60점에서 100점 사이여야 합니다.");
                i--;
            }
        }
        // 점수 정렬
        Arrays.sort(scores);
        //최고 점수와 최소 점수를 제외한 평균 점수
        for (int i = 1; i < 6; i++) {
            sum += scores[i];
        }
        avr = sum / 5.0;
        // 결과 출력
        System.out.printf("\n홍길동 선수의 최종 점수 : %.2f점", avr);
    }
}
