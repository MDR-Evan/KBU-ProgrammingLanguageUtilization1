import java.util.Scanner;

public class week2_exam1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width; //가로 길이
        int height; // 세로 길이


        System.out.print("사각형의 가로 길이 입력 : ");
        width = keyboard.nextInt();
        System.out.print("사각형의 세로 길이 입력 : ");
        height = keyboard.nextInt();

        int area; // 사각형 면적
        int perimeter; // 사각형 둘레

        System.out.printf("\n사각형의 가로 길이 : %d cm\n",width);
        System.out.printf("사각형의 세로 길이 : %d cm\n",height);

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.printf("사각형의 면적 : %d cm²\n",area);  // ㎠ \u33A0
        System.out.printf("사각형의 둘레 : %d cm\n",perimeter);
    }
}