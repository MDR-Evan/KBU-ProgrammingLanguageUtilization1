import java.awt.geom.Arc2D;
import java.io.IOException;
import java.util.Scanner;

// 체조 경기장에서 한 선수의 경기 내용을 7인의 채점관이 채점하여 최고 점수 와 최소 점수를 삭제한 5명의 채점관 점수를 평균하여 점수로 한다.
// 100점 만점으로 최소 점수는 60점이다.
public class week10_exam1 {
    public static void main(String[] args) throws IOException {
        Scanner c1 = new Scanner(System.in);

        String 이름 = "홍길동";
        float[] 점수 = new float[7];
//        float[] 점수 = new float[] {67.8f, 89.6f, 65.4f, 78.9f, 81.6f, 78.9f, 82.6f};
        int i = 0;
        float 최고점수 = 0.0f, 최소점수 = 100.0f, 총합 = 0.0f, 평균 = 0.0f;

        do {
            System.out.printf("%s선수의 채점관%d의 점수 입력 : ", 이름, i+1);
            점수[i] = c1.nextFloat();
            if (!(60.0f <= 점수[i] && 점수[i] <= 100.0f)) {
                System.err.print("점수 범위 오류");
                System.in.read();
            } else {
                i++;
            }
        } while (i < 점수.length);
        
        for (i=0; i < 점수.length; i++) {
            if (최고점수 < 점수[i]) {
                최고점수 = 점수[i];
            }
            if (점수[i] < 최소점수) {
                최소점수 = 점수[i];
            }
        }

        for (i = 0; i < 점수.length; i++) {
            총합 += 점수[i];
        }
        총합 -= (최고점수 + 최소점수);
        평균 = 총합 / (점수.length - 2);

        System.out.printf(">->->->->%s 선수의 점수<-<-<-<-<\n", 이름);
        for (i = 0; i < 점수.length; i++) {
            System.out.printf("\t채점관 %d의 점수 : %5.1f\n", i+1, 점수[i]);
        }
        System.out.printf("\t\t최고 점수 : %5.1f\n", 최고점수);
        System.out.printf("\t\t최소 점수 : %5.1f\n", 최소점수);
        System.out.printf("\t\t평균 점수 : %5.1f\n", 평균);
    }
}
