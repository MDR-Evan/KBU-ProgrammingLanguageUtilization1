import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// 10명의 출전 선수(이름과 소속이 있음)를 처리 하려면 어떻게 해야 할까요?
public class week10_exam2 {
    public static void main(String[] args) throws IOException {
        Scanner 입력 = new Scanner(System.in);
        String[][] 사람 = {
                {"홍길동","서울"}, {"이대한","경기"},
                {"한민국","강원"}, {"이Java","충북"},
                {"한성봉","대전"}, {"김선민","전북"},
                {"오정민","광주"}, {"김익주","울산"},
                {"김광호","부산"}, {"김진용","대구"}
        };

        float[][] 점수 = {
                {67.8f, 89.6f, 65.4f, 78.9f, 81.6f, 78.9f, 82.6f},  // 홍길동
                {67.8f, 89.6f, 65.4f, 78.9f, 81.6f, 75.2f, 82.6f},  // 이대한
                {67.8f, 89.6f, 65.4f, 78.9f, 31.2f, 78.9f, 82.6f},  // 한민국
                {67.8f, 89.6f, 65.4f, 64.5f, 81.6f, 78.9f, 82.6f},  // 이Java
                {67.8f, 89.6f, 65.4f, 60.0f, 81.6f, 78.9f, 82.6f},  // 한석봉
                {67.8f, 89.6f, 100.0f, 78.9f, 81.6f, 78.9f, 82.6f},  // 김선민
                {67.8f, 91.2f, 65.4f, 78.9f, 81.6f, 78.9f, 82.6f},  // 오정민
                {67.8f, 89.6f, 65.4f, 80.0f, 81.6f, 78.9f, 82.6f},  // 김익주
                {67.8f, 89.6f, 65.4f, 78.9f, 81.6f, 60.0f, 82.6f},  // 김광호
                {84.2f, 89.6f, 95.4f, 94.1f, 81.6f, 91.2f, 82.6f}   // 김진용
        };

        float[][] 결과 = new float[점수.length][4];                  // {최대, 최소, 총합, 평균};
        float[] 순위 = new float[점수.length];

        for (int i = 0; i < 사람.length; i++){
            System.out.println();
//            for (int j = 0; j < 점수[i].length; j++) {
//                System.out.printf("%s님의 체점관%d 점수 : ", 사람[i][0], j+1);
//                점수[i][j] = 입력.nextFloat();
//                if (!(60.0f <= 점수[i][j] && 점수[i][j] <= 100.0f)) {
//                    System.err.println("입력 점수 오류");
//                    System.in.read();
//                    j--;
//                }
//            }
        }














        for (int i = 0; i < 점수.length; i++) {
            결과[i][0] = 0.0f;
            결과[i][1] = 100.0f;
            for (int j = 0; j < 점수[i].length; j++) {
                if (결과[i][0] < 점수[i][j]) {
                    결과[i][0] = 점수[i][j];
                }
                if (점수[i][j] < 결과[i][1]) {
                    결과[i][1] = 점수[i][j];
                }
            }
        }

        for (int i = 0; i < 점수.length; i++) {
            결과[i][2] = 0.0f;
        }

        for (int i = 0; i < 점수.length; i++) {
            for (int j = 0; j < 점수[i].length; j++) {
                결과[i][2] += 점수[i][j];
            }
        }

        for (int i = 0; i < 점수.length; i++) {
            결과[i][2] -= (결과[i][0] + 결과[i][1]);
        }

        for (int i = 0; i < 점수.length; i++) {
            결과[i][3] = 결과[i][2] / (점수.length - 2);
        }

        for (int i = 0; i < 사람.length - 1; i++) {
            for (int j = 1; j < 사람.length - i; j++) {
                if (결과[i][3] > 결과[j][3]);
                String[] temp = 사람[i];
                사람[i] = 사람[j];
                사람[j] = temp;

                float[] data_1 = 점수[i];
                점수[i] = 점수[j];
                점수[j] = data_1;

                float[] data_2 = 결과[i];
                결과[i] = 결과[j];
                결과[j] = data_2;
            }
        }

        for (int i = 0; i < 사람.length; i++) {
            순위[i] = i + 1;
        }

        for (int i = 0; i < 사람.length - 1; i++) {
            if (결과[i][3] == 결과[i+1][3]) {
                순위[i+1] = 순위[i];
            }
        }








        System.out.printf("*************************************************************************\n");
        System.out.printf("\t 선수\t 팀  | 채점1\t 채점2\t 채점3\t 채점4\t 채점5\t 채점6\t 채점7   | 최고점수\t 최소점수\t 총합점수\t 평균점수\t 등수\n");
        System.out.printf("*************************************************************************\n");
        for (int i = 0; i < 사람.length; i++) {
            System.out.printf("\t%3s\t%2s |",사람[i][0], 사람[i][1]);
            for (int j = 0; j < 점수[i].length; j++) {
                System.out.printf("%5.1f\t",점수[i][j]);
            }
            System.out.printf("|");
            for (int j = 0; j < 결과[i].length; j++) {
                System.out.printf(" %5.1f\t", 결과[i][j]);
            }
            System.out.printf("%2.0f\n",순위[i]);
//            System.out.println();
        }
        System.out.printf("*************************************************************************\n");
    }
}
