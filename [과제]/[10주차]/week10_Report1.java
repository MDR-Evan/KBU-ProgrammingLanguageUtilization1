import javax.swing.*;
import java.util.Scanner;

/*학생 10명의 학번(hakbun), 이름(name), 3과목(국어(kor), 영어(eng), 수학(math)) 성적을 입력 받아 학생 각각의 총점(sum), 평균(avg)과 등수(rank)를 구하는 Program을 작성하여라*/
public class week10_Report1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] 학번이름 = {
                {"0801211", "홍길동"},
                {"0801234", "이혜인"},
                {"0801345", "김명성"},
                {"0801567", "경복대"},
                {"0801678", "이대학"},
                {"0801251", "여성학"},
                {"0801987", "정대인"},
                {"0801684", "학성기"},
                {"0801754", "조동기"},
                {"0801840", "박대박"}
        };
        float[][] 성적 = {
                {90, 90, 95},
                {87, 88, 90},
                {75, 100, 95},
                {100, 100, 99},
                {100, 75, 89},
                {79, 70, 65},
                {83, 69, 89},
                {92, 91, 98},
                {90, 65, 89},
                {77, 71, 100}
        };
        float[][] 성적처리 = new float[성적.length][2];   //총점, 평균
        float[] 등수 = new float[성적.length];
        String[][] 등급 = {
                {"(수)", "(우)", "(미)", "(양)", "(가)"},
                {"(A+)", "(A)", "(B+)", "(B)", "(C+)", "(C)", "(D+)", "(D)", "(F)"},
                {"(A)", "(B)", "(C)", "(D)", "(F)"}
        };
        String 등급출력 = null;

        // 성적 입력란
//        for (int i = 0; i < 학번이름.length; i++){
//            System.out.printf("학번 : ");
//            학번이름[i][1] = input.nextLine();
//            System.out.printf("이름 : ");
//            학번이름[i][2] = input.nextLine();
//            System.out.printf("국어 성적 : ");
//            성적[i][1] = input.nextFloat();
//            System.out.printf("영어 성적 : ");
//            성적[i][2] = input.nextFloat();
//            System.out.printf("수학 성적 : ");
//            성적[i][3] = input.nextFloat();
//        }

        // 총합
        for (int i = 0; i < 성적.length; i++) {
            for (int j = 0; j < 성적[i].length; j++) {
                성적처리[i][0] += 성적[i][j];
            }
        }
        // 평균
        for (int i = 0; i < 성적.length; i++) {
            성적처리[i][1] = 성적처리[i][0] / 성적[i].length;
        }
        // 정렬
        for (int i = 0; i < 학번이름.length - 1; i++) {
            for (int j = i+1; j < 학번이름.length; j++) {
                if (성적처리[i][1] < 성적처리[j][1]) {
                    String[] temp = 학번이름[i];
                    학번이름[i] = 학번이름[j];
                    학번이름[j] = temp;

                    float[] data_1 = 성적[i];
                    성적[i] = 성적[j];
                    성적[j] = data_1;

                    float[] data_2 = 성적처리[i];
                    성적처리[i] = 성적처리[j];
                    성적처리[j] = data_2;
                }
            }
        }
        // 등수
        for (int i = 0; i < 학번이름.length; i++) {
            등수[i] = i + 1;
        }
        // 공동순위
        for (int i = 0; i < 학번이름.length - 1; i++) {
            if (성적처리[i][1] == 성적처리[i+1][1]) {
                등수[i+1] = 등수[i];
            }
        }
        // 국어등급
        for (int i = 0; i < 성적[0].length; i++) {
            for (int j = 0; j < 성적.length; j++) {
                if (90 <= 성적[j][0] && 성적[j][0] <= 100) {
                    등급[i][0] = "수";
                } else if (80 <= 성적[j][0] && 성적[j][0] < 90) {
                    등급[i][0] = "우";
                } else if (70 <= 성적[j][0] && 성적[j][0] < 80) {
                    등급[i][0] = "미";
                } else if (60 <= 성적[j][0] && 성적[j][0] < 70) {
                    등급[i][0] = "양";
                } else {
                    등급[i][0] = "가";
                }
            }
        }
        // 영어등급
        for (int i = 0; i < 성적[1].length; i++) {
            for (int j = 0; j < 성적.length; j++) {
                if (95 <= 성적[j][1] && 성적[j][0] <= 100) {
                    등급[i][1] = "A+";
                } else if (90 <= 성적[j][1] && 성적[j][1] < 95) {
                    등급[i][1] = "A";
                } else if (85 <= 성적[j][1] && 성적[j][1] < 90) {
                    등급[i][1] = "B+";
                } else if (80 <= 성적[j][1] && 성적[j][1] < 85) {
                    등급[i][1] = "B";
                } else if (75 <= 성적[j][1] && 성적[j][1] < 80) {
                    등급[i][1] = "C+";
                } else if (70 <= 성적[j][1] && 성적[j][1] < 75) {
                    등급[i][1] = "C";
                } else if (65 <= 성적[j][1] && 성적[j][1] < 70) {
                    등급[i][1] = "D+";
                } else if (60 <= 성적[j][1] && 성적[j][1] < 65) {
                    등급[i][1] = "D";
                } else {
                    등급[i][1] = "F";
                }
            }
        }
        // 수학등급
        for (int i = 0; i < 성적[2].length; i++) {
            for (int j = 0; j < 성적.length; j++) {
                if (90 <= 성적[j][2] && 성적[j][2] <= 100) {
                    등급[i][2] = "A";
                } else if (80 <= 성적[j][2] && 성적[j][2] < 90) {
                    등급[i][2] = "B";
                } else if (70 <= 성적[j][2] && 성적[j][2] < 80) {
                    등급[i][2] = "C";
                } else if (60 <= 성적[j][2] && 성적[j][2] < 70) {
                    등급[i][2] = "D";
                } else {
                    등급[i][2] = "F";
                }
            }
        }

        // 출력
        System.out.printf("***************************************************************************\n");
        System.out.printf("\t  학번\t   이름\t\t국어\t\t영어\t\t수학\t\t 총점\t\t평균\t\t석차\n");
        System.out.printf("***************************************************************************\n");
        for (int i = 0; i < 학번이름.length; i++) {
            System.out.printf("\t%7s\t%5s\t",학번이름[i][0], 학번이름[i][1]);
            for (int j = 0; j < 성적[i].length; j++) {
                System.out.printf("\t%3.0f(%s)\t",성적[i][j], 등급[j][i]);
            }
            for (int j = 0; j < 성적처리[i].length; j++) {
                System.out.printf("\t%3.1f\t", 성적처리[i][j]);
            }
            System.out.printf("%2.0f\n",등수[i]);
        }
        System.out.printf("***************************************************************************\n");
    }
}
