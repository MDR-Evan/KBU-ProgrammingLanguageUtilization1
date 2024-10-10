import java.util.Scanner;

public class week4_exam2 { // 사각형의 넓이 계산
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int x;
        int z;
        char type;
        int area;

        System.out.printf("사각형의 가로 길이(Cm) 입력 : ");
        x = keyboard.nextInt();
        System.out.printf("사각형의 세로 길이(Cm) 입력 : ");
        z = keyboard.nextInt();

        type = x == z ? '정' : '직';
        area = x * z;

        System.out.printf("\n**** %c사각형 넓이 *****\n", type);
        System.out.printf("\t가로 : %d Cm\n",x);
        System.out.printf("\t세로 : %d Cm\n",z);
        System.out.printf("\t면적 : %d Cm²\n",area);
        System.out.printf("**********************");
    }

}
