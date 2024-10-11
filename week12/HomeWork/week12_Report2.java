import java.util.Scanner;

public class week12_Report2 { // 홀수
    private static double input_data() {
        Scanner keyboard = new Scanner(System.in);

        int year;

        System.out.print("년도 : ");
        year = keyboard.nextInt();

        return year;
    }

    private static int leapYear(double data) {
        int result;

        if (data % 4 == 0) {
            if (data % 100 == 0) {
                if (data % 400 == 0) {
                    result = 1;
                } else {
                    result = 0;
                }
            } else {
                result = 1;
            }
        } else {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        double year = input_data();
        int leapyear_result = leapYear(year);
        char Result = 0;

        Result = leapyear_result == 1 ? '윤' : '평';
        System.out.printf("%.0f년은 %c년 입니다.", year, Result);
    }
}
