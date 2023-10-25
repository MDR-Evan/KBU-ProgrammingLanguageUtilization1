import java.io.IOException;
import java.util.Scanner;
// 크기가 10인 정수형 배열을 생성하고 여기에 10부터 100까지의 값으로 배열을 채우는 프로그램을 작성해 보자
public class 일차원배열예제1 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int[] data = new int[10];
//        int[] data = {10, 20, 30, 40, 70, 80, 90, 50, 100, 60};
        for (int i = 0; i < data.length; i++) {
            data[1] = 0;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.printf("(%d/%d) 번째 Data 입력 : ", i+1, data.length);
            data[i] = keyboard.nextInt();
        }

        System.out.println("\n\t\t입력된 Data");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d, ", data[i]);
//            System.out.println("\b\b");
        }


        System.out.println("\n\t\t입력된 역순 Data");
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.printf("%d, ", data[i]);
//            System.out.println("\b\b");
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]);
                int temp = data[j - 1];
                data[j - 1] = data[j];
                data[j] = temp;
            }
        }

        System.out.println("\n\t\t정렬된 Data");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d, ", data[i]);
//            System.out.println("\b\b");
        }

        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        float avg = (float) sum / data.length;

        System.out.printf("\n합계 = %d, 평균 = %.2f\n",sum, avg);
    }
}
