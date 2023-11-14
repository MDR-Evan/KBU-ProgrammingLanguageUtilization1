import java.util.Scanner;

public class Program { //사다리꼴의 넓이를 구하는 Progra
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int line_1, line_2, height;
        float area;

        System.out.print("사다리 꼴의 윗변 입력(Cm) : ");
        line_1 = keyboard.nextInt();
        System.out.print("사다리 꼴의 아랫변 입력(Cm) : ");
        line_2 = keyboard.nextInt();
        System.out.print("사다리 꼴의 높이 입력(Cm) : ");
        height = keyboard.nextInt();

        area = (line_1 + line_2) * height / 2.0f;

        System.out.printf("\n>>>>>>>>>>> 사다리꼴 <<<<<<<<<<<\n");
        System.out.printf("\t\t윗변 : %dCm\n", line_1);
        System.out.printf("\t\t아랫변 : %dCm\n", line_2);
        System.out.printf("\t\t높이 : %dCm\n", height);
        System.out.printf("\t\t넓이 : %.2fCm²\n", area);
    }
}
