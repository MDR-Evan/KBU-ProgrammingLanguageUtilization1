import java.io.IOException;
import java.util.Scanner;

public class week13_Report2 {

    public static void main(String[] args) throws IOException {
        int[] correct = {1, 3, 4, 2, 3, 2, 4, 3, 1, 4, 3, 2, 1, 3, 4, 2, 4, 1, 3, 3, 3, 4, 1, 3, 2};
        int[] answer;
        char[] mark;
        int score;

        answer = read(correct.length); // 사용자의 답안을 읽는 메소드 호출
        mark = count(correct, answer); // 답안을 채점하는 메소드 호출
        score = write(correct, answer, mark); // 최종 점수를 계산하는 메소드 호출
        System.out.printf("*********************************************************\n");
        System.out.println(" 정답 : " + String(correct));
        System.out.println(" 답안 : " + String(answer));
        System.out.println(" 채점 : " + String(mark));
        System.out.println(" 점수 = " + score);
    }

    // 사용자의 답안을 읽는 메소드
    private static int[] read(int length) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int[] answers = new int[length];
        for (int i = 0; i < length; i++) {
            while (true) {
                System.out.printf("(%d/25)번쨰 답을 입력 : ", i+1);
                answers[i] = keyboard.nextInt();
                
                if (0 < answers[i] && answers[i] < 5) {
                    break;
                } else {
                    System.err.println("ERROR: 다시 입력하세요.");
                    System.in.read();
                }
            }
            
        }
        return answers;
    }

    // 답안을 채점하는 메소드
    private static char[] count(int[] correct, int[] answer) {
        char[] marks = new char[correct.length];
        for (int i = 0; i < correct.length; i++) {
            marks[i] = (correct[i] == answer[i]) ? 'O' : 'X';
        }
        return marks;
    }

    // 최종 점수를 계산하는 메소드
    private static int write(int[] correct, int[] answer, char[] mark) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (mark[i] == 'O') {
                score += 4;
            }
        }
        return score;
    }

    // 배열을 문자열로 변환하는 메소드
    private static String String(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // 배열을 문자열로 변환하는 메소드 (오버로딩)
    private static String String(char[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
