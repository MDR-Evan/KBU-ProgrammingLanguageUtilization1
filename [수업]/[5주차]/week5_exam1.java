import java.util.Scanner;

public class Program5 { //평생 담배를 피우면 얼마의 시간이 수명 단축되는지 계산하는 Program
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int smoke,playtime, Dead, hour, minute, day, year;
        final int life = 7, min = 525600, YEAR = 365; // minuit

        System.out.print("담배를 하루에 몇 개피를 피웁니까 ?\n 입력 : ");
        smoke = keyboard.nextInt();
        System.out.print("담배를 시작한지 몇년 되었나요 ?\n 입력 : ");
        playtime = keyboard.nextInt();

        Dead = life * smoke * playtime * YEAR;
        hour = Dead / 60; // 시간
        minute = Dead % 60; // 분
        day = hour / 24; // 일
        hour = hour % 24; // 시간
        year = day / 365; // 년도
        day = day % 365; // 일

        System.out.printf("\n※ 1개피의 담배는 수명을 %d분 단축 시켜줍니다. ※\n",life);
        System.out.printf("\n하루에 %d 개피의 담배를 %d년 피웠다면, \n%,d분의 수명이 단축되었습니다.\n\n%,d분 = %d년 %d일 %d시간 %d분", smoke, playtime,Dead,Dead,year,day,hour,minute);
    }
}
