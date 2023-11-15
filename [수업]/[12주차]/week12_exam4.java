import java.util.Scanner;

public class week12_exam4 {
    public static void main(String[] args) {
        float radius, area;

        radius = readData();
        area = circleArea(radius);
        message(radius,area);
    }

    private static void message(float radius, float area) {
        System.out.printf("원의 반지름 : %.2f ㎝\n",radius);
        System.out.printf("원의 둘레 : %.2f ㎝\n",round(radius));
        System.out.printf("원의 면적 : %.2f ㎠\n",area);
    }

    private static Object round(float radius) {
        final float Pi;
        Pi = (float) (Math.PI * 2 * radius);

        return Pi;
    }

    private static float circleArea(float radius) {
        final float Pi;
        Pi = (float) (Math.PI * radius * radius);

        return Pi;
    }

    private static float readData() {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("원의 반지름 입력 : ");
        float radius = keyboard.nextFloat();

        return radius;
    }
}
