import java.io.IOException;
import java.util.Formattable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String[][] student = {
                {"230001", "홍길동" }, {"230002", "김선민" }, {"230003", "김익주" },
                {"230004", "김진용" }, {"230005", "오정민" }, {"230006", "이순주" },
                {"230007", "김광호" }, {"230008", "양동훈" }, {"230009", "하피제" },
                {"230010", "지나" }};
        int[][] data = {
                {10, 80, 50, 0, 0}, {20, 30, 90, 0, 0}, {30, 80, 90, 0, 0},
                {40, 80, 40, 0, 0}, {50, 20, 90, 0, 0}, {60, 80, 90, 0, 0},
                {70, 80, 30, 0, 0}, {80, 10, 90, 0, 0}, {90, 80, 90, 0, 0},
                {100, 80, 20, 0, 0}};
        float[] avg = new float[student.length];
        char[][] grade = new char[student.length][4];   // (국어 : 수, 우, 미, 양, 가), (영어 : A, B, C, D, F), (수학 : A, B, C, D, F)

        int i = 0;
//        while (i < student.length) {
//            System.out.printf("%s님의 국어 성적 입력 : ", student[i][1]);
//            data[i][0] = input.nextInt();
//            System.out.printf("%s님의 영어 성적 입력 : ", student[i][1]);
//            data[i][1] = input.nextInt();
//            System.out.printf("%s님의 수학 성적 입력 : ", student[i][1]);
//            data[i][2] = input.nextInt();
//            if ((0 <= data[i][0]&& data [i][0] <= 100) && (0 <= data[i][1]&& data [i][1] <= 100) && (0 <= data[i][2]&& data [i][2] <= 100)) {
//                i++;
//            } else {
//                System.err.println("점수오류");
//                System.in.read();
//            }
//        }

        for (i = 0; i < student.length; i++) {
            data[i][3] = data[i][0] + data[i][1] + data[i][2] ;
        }

//        for (i = 0; i < student.length; i++) {
//            data[i][4] = 1;
//            for (int j = 0; j < student.length; j++) {
//                if (data[i][3] < data[j][3]) {
//                    data[i][4]++;
//                }
//            }
//        }

        for (i = 0; i < student.length; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (data[i][3] < data[j][3]) {
                    String[] temp_1 = student[i];
                    student[i] = student[j];
                    student[j] = temp_1;

                    int[] temp_2 = data[i];
                    data[i] = data[j];
                    data[j] = temp_2;
                }
            }
        }

        for (i = 0; i < student.length; i++){
            data[i][4] = i + 1;
        }

        for (i = 0; i < student.length - 1; i++) {
            if (data[i][3] == data[i + 1][3]) {
                data[i + 1][4] = data[i][4];
            }
        }

        for (i = 0; i < student.length; i++) {
            avg[i] = data[i][3] / 3.0f;
        }

        for (i = 0; i < student.length; i++) {
            if (90 <= data[i][0]) {
                grade[i][0] = '수';
            } else if (80 <= data[i][0]) {
                grade[i][0] = '우';
            } else if (70 <= data[i][0]) {
                grade[i][0] = '미';
            } else if (60 <= data[i][0]) {
                grade[i][0] = '양';
            } else {
                grade[i][0] = '가';
            }
        }

        for (i = 0; i < student.length; i++) {
            switch (data[i][1] / 10) {
                case 10 :
                case 9 :
                    grade[i][1] = 'A';
                    break;
                case 8 :
                    grade[i][1] = 'B';
                    break;
                case 7 :
                    grade[i][1] = 'C';
                    break;
                case 6 :
                    grade[i][1] = 'D';
                    break;
                default:
                    grade[i][1] = 'F';
            }
        }

        for (i = 0; i < student.length; i++) {
            switch (data[i][2] / 10) {
                case 10 :
                case 9 :
                    grade[i][2] = 'A';
                    break;
                case 8 :
                    grade[i][2] = 'B';
                    break;
                case 7 :
                    grade[i][2] = 'C';
                    break;
                case 6 :
                    grade[i][2] = 'D';
                    break;
                default:
                    grade[i][2] = 'F';
            }
        }

        for (i = 0; i < student.length; i++) {
            int temp = data[i][2] % 10;
            if (temp < 4) {
                grade[i][3] = '0';
            } else {
                grade[i][3] = '+';
            }
            if (grade[i][2] == 'F') {
                grade[i][3] = ' ';
            }
        }

        System.out.println("=========================================================");
        System.out.println(" 학번     이름      국어      영어      수학      총점      평균      등수");
        ;
        System.out.println("=========================================================");
        for (i = 0; i < student.length; i++) {
            if(i % 5 == 0 && i != 0){
                System.out.println();
            }
            System.out.printf("%7s %3s %3d(%c) %3d(%c) %3d(%c%c) %3d %5.1f %3d\n", student[i][0], student[i][1], data[i][0],grade[i][0], data[i][1], grade[i][1], data[i][2], grade[i][2],grade[i][3], data[i][3], avg[i], data[i][4]);
        }
    }
}
