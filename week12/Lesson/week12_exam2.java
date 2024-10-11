import java.util.Scanner;

public class week12_exam2 {
    public static void main(String[] args) {
        double temp, convert;

        temp = readData();          // call by name
        convert = convert(temp);    // call by value
        display(temp, convert);     // call by value
    }

    private static void display(double temp, double convert) {
        System.out.printf("\n섭씨온도 %.1f = 화씨온도 %.1f", temp, convert);
    }

    private static double readData() {
        Scanner keyboard = new Scanner(System.in);
        double temp;
        System.out.print("섭씨온도 입력 : ");
        temp = keyboard.nextDouble();
        return temp;
    }

    private static double convert(double temp) {
        double result;
        result = temp * 9.0 / 5.0 + 32.0;
        return result;
    }
}
