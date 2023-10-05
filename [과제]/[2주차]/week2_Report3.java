import java.util.Scanner;

public class Scanarea {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double radius, boxArea, circleArea, Area;               //radius = 반지름, boxArea = 정사각형 면적, sircleArea = 원의 면적

        System.out.print("원의 반지름 : ");
        radius = keyboard.nextDouble();
                                                                //Math.pow = 제곱, Math.PI = π
        boxArea = Math.pow(radius * 2, 2);                      //2r^2
        circleArea = Math.PI * Math.pow(radius, 2);             //πr^2
        Area = boxArea - circleArea;                            // x = 정사각형 면적 - 원의 면적


        System.out.printf("\n정사각형 면적 : %.2fcm²",boxArea);
        System.out.printf("\n원의 면적 : %.2fcm²",circleArea);
        System.out.printf("\n구하는 면적 : %.2fcm²",Area);
    }
}

