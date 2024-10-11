import java.util.Scanner;
//높이 X m인 곳에서 공이 떨어지면 그의 2/3되는 곳까지 다시 튀어 오른다.
//10번째 만에 멈추었다면 공이 움직인 총 거리를 계산하는 프로그램을 작성하여라.
public  class Report3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double height = 0;
        int bounces = 10;
        double total = 0;

        System.out.print("공을 몇 m에서 낙하합니까 ? ");
        height = keyboard.nextInt();

        total += height;

        for (int i = 0; i < bounces; i++) {
            height *= 2.0 / 3.0;
            total += height * 2;
        }

        System.out.printf("공이 움직인 거리 = %,.2f m",total);
    }
}