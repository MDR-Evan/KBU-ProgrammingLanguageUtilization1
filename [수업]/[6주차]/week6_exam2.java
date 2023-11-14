import java.util.Scanner;
/* 길이가 a, b, c인 막대기가 있다. 이 3개의 막대기 끝을 붙 여서 삼 각형을 만들 수 있는지 조사 하고, 삼 각형을 만들 수 있으면 그 삼 각형의 넓이를 구하시오. 길이 a, b, c는 입력 된다고 가정 한다. */
public class 삼각형계산프로그램 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c;
        String result;

        System.out.print("삼 각형의 세 변의 길이를 입력 하시오.\n");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            result = String.format("삼 각형의 면적 : %.2f Cm²\n",area);
        } else {
            result = "삼 각형을 만들 수 없습니다";
        }

        System.out.printf("%s",result);
    }
}
