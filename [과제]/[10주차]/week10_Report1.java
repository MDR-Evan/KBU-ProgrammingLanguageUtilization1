import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

/*학생 10명의 학번(hakbun), 이름(name), 3과목(국어(kor), 영어(eng), 수학(math)) 성적을 입력 받아 학생 각각의 총점(sum), 평균(avg)과 등수(rank)를 구하는 Program을 작성하여라*/
public class week10_Report1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String[][] 학번이름 = new String[10][2];           //학번, 이름
        int[][] 성적 = new int[10][3];                    //국어, 영어, 수학
        float[][] 성적처리 = new float[성적.length][2];    //총점, 평균
        float[] 등수 = new float[성적.length];
        String[] 수학 = new String[10];
        String[] 국어 = new String[10];
        String[] 영어 = new String[10];

        // 성적 입력란
        for (int i = 0; i < 학번이름.length; i++) {
            System.out.printf("\n학생 %d번의 성적을 입력하시오.\n", i + 1);

            boolean 학번확인 = false;
            System.out.printf("학번 : ");


            while (!학번확인) {
                String 학번성적 = input.next();

                if (학번성적.length() == 7) {
                    학번확인 = true;
                    학번이름[i][0] = 학번성적;
                } else {
                    System.err.print("학번은 7자여야 합니다. 다시 입력하시오 :");
                    input.nextLine();
                }
            }

            System.out.printf("이름 : ");
            학번이름[i][1] = input.next();


            boolean 국어확인 = false;
            System.out.printf("국어 성적 : ");

            while (!국어확인) {
                int 국어성적 = input.nextInt();

                if (0 <= 국어성적 && 국어성적 <= 100) {
                    국어확인 = true;
                    성적[i][0] = 국어성적;
                } else {
                    System.err.print("점수는 0점에서 100점 사이여야 합니다. 다시 입력하시오 : ");
                    input.nextLine();
                }
            }

            boolean 영어확인 = false;
            System.out.printf("영어 성적 : ");

            while (!영어확인) {
                int 영어성적 = input.nextInt();

                if (0 <= 영어성적 && 영어성적 <= 100) {
                    영어확인 = true;
                    성적[i][1] = 영어성적;
                } else {
                    System.err.print("점수는 0점에서 100점 사이여야 합니다. 다시 입력하시오 : ");
                    input.nextLine();
                }
            }

            boolean 수학확인 = false;
            System.out.printf("수학 성적 : ");

            while (!수학확인) {
                int 수학성적 = input.nextInt();

                if (0 <= 수학성적 && 수학성적 <= 100) {
                    수학확인 = true;
                    성적[i][2] = 수학성적;
                } else {
                    System.err.print("점수는 0점에서 100점 사이여야 합니다. 다시 입력하시오 : ");
                    input.nextLine();
                }
            }
        }

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
                    String[] temp_1 = 학번이름[i];
                    학번이름[i] = 학번이름[j];
                    학번이름[j] = temp_1;

                    int[] data_1 = 성적[i];
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
        // 등급분류
        for (int i =0; i< 성적.length; i++){
            // 국어
            if (성적[i][0]>=90 && 100>=성적[i][0]){
                국어[i]="수";
            }else if (성적[i][0]>=80 && 89>=성적[i][0]){
                국어[i]="우";
            }else if (성적[i][0]>=70 && 79>=성적[i][0]){
                국어[i]="미";
            }else if (성적[i][0]>=60 && 69>=성적[i][0]){
                국어[i]="양";
            }else if (성적[i][0]>=0 && 59>=성적[i][0]){
                국어[i]="가";
            }
            // 영어
            if (성적[i][1]>=95 && 100>=성적[i][1]){
                영어[i]="A+";
            }else if (성적[i][1]>=90 && 94>=성적[i][1]){
                영어[i]="A";
            }else if (성적[i][1]>=85 && 89>=성적[i][1]){
                영어[i]="B+";
            }else if (성적[i][1]>=80 && 84>=성적[i][1]){
                영어[i]="B";
            }else if (성적[i][1]>=75 && 79>=성적[i][1]){
                영어[i]="C+";
            }else if (성적[i][1]>=70 && 74>=성적[i][1]){
                영어[i]="C";
            }else if (성적[i][1]>=65 && 69>=성적[i][1]){
                영어[i]="D+";
            }else if (성적[i][1]>=60 && 64>=성적[i][1]){
                영어[i]="D";
            }else if (성적[i][1]>=0 && 59>=성적[i][1]){
                영어[i]="F";
            }
            // 수학
            if (성적[i][2]>=90 && 100>=성적[i][2]){
                수학[i]="A";
            }else if (성적[i][2]>=80 && 90>성적[i][2]){
                수학[i]="B";
            }else if (성적[i][2]>=70 && 80>성적[i][2]){
                수학[i]="C";
            }else if (성적[i][2]>=60 && 70>성적[i][2]){
                수학[i]="D";
            }else if (성적[i][2]>=0 && 60>성적[i][2]){
                수학[i]="E";
            }
            
        }

        // 출력
        System.out.printf("****************************************************************************************************\n");
        System.out.printf("\t  학번\t   이름\t\t  국어\t\t\t  영어\t\t\t  수학\t\t 총점\t\t평균\t석차\n");
        System.out.printf("****************************************************************************************************\n");
        for (int i = 0; i < 학번이름.length; i++) {
            System.out.printf("\t%7s\t%5s\t",학번이름[i][0], 학번이름[i][1]);
            for (int j = 0; j < 성적[i].length; j++) {
                if (j == 0) {
                    System.out.printf("\t%3d (%s)\t", 성적[i][0], 국어[i]);
                } else if (j == 1) {
                    System.out.printf("\t%3d (%2s)\t", 성적[i][1], 영어[i]);
                } else if (j == 2) {
                    System.out.printf("\t%3d (%s)\t", 성적[i][2], 수학[i]);
                }
            }
            for (int j = 0; j < 성적처리[i].length; j++) {
                System.out.printf("\t%3.1f\t", 성적처리[i][j]);
            }
            System.out.printf("%2.0f\n",등수[i]);
        }
        System.out.printf("****************************************************************************************************\n");
    }
}