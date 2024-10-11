import java.io.IOException;
import java.util.Scanner;

public class week13_exam6_input {
//    public void readdata(String s, int[] data) throws IOException {
//        Scanner keyboard = new Scanner(System.in);
//
//        while (true) {
//            System.out.printf("%s님의 국어 성적 입력 : ",s);
//            data[0] = keyboard.nextInt();
//            System.out.printf("%s님의 영어 성적 입력 : ",s);
//            data[1] = keyboard.nextInt();
//            System.out.printf("%s님의 수학 성적 입력 : ",s);
//            data[2] = keyboard.nextInt();
//            if (0 <= data[0] && data[0] <= 100 && 0 <= data[1] && data[1] <= 100 && 0 <= data[2] && data[2] <= 100) {
//                break;
//            } else {
//                System.err.println("입력 오류");
//                System.in.read();
//            }
//        }
//    }

//    public void readdata(String[][] s, int[][] data) throws IOException {
//        Scanner keyboard = new Scanner(System.in);
//
//        for (int i = 0; i < s.length; i++) {
//            while (true) {
//                System.out.printf("%s님의 국어 성적 입력 : ", s[i][1]);
//                data[i][0] = keyboard.nextInt();
//                System.out.printf("%s님의 영어 성적 입력 : ", s[i][1]);
//                data[i][1] = keyboard.nextInt();
//                System.out.printf("%s님의 수학 성적 입력 : ", s[i][1]);
//                data[i][2] = keyboard.nextInt();
//                if (0 <= data[i][0] && data[i][0] <= 100 && 0 <= data[i][1] && data[i][1] <= 100 && 0 <= data[i][2] && data[i][2] <= 100) {
//                    break;
//                } else {
//                    System.err.println("입력 오류");
//                    System.in.read();
//                }
//            }
//        }
//    }

    public static int readdata(String s, String title) throws IOException {
        Scanner keyboard = new Scanner(System.in);
            int data;
            while (true) {
                System.out.printf("%s님의 %s 성적 입력 : ", s, title);
                data = keyboard.nextInt();

                if (0 <= data && data <= 100) {
                    break;
                } else {
                    System.err.println("입력 오류");
                    System.in.read();
                }
            }

            return data;
    }
}
