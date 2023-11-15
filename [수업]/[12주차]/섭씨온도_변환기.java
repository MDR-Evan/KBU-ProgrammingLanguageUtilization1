import java.util.Scanner;

public class 섭씨온도_변환기 {
    public 섭씨온도_변환기() {     // 생성자
    }

    public static void display(double temp, double convert) {
        System.out.printf("\n섭씨온도 %.1f = 화씨온도 %.1f", temp, convert);
    }

    protected static double readData() {
        Scanner keyboard = new Scanner(System.in);
        double temp;
        System.out.print("섭씨온도 입력 : ");
        temp = keyboard.nextDouble();
        return temp;
    }

    static double convert(double temp) {
        double result;
        result = temp * 9.0 / 5.0 + 32.0;
        return result;
    }
}
