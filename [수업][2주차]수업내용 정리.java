import java.security.Key;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int money = 100000000;
        System.out.printf("\n용돈 : \\%,13d\\",money);

        System.out.printf("%d, %d, %d\n", 10, 20, 30);
        System.out.printf("%1$d, %3$d, %2$d\n", 10, 20, 30);

        System.out.printf("\n%f, %f, %f\n", 10.5, 20.5, 30.5);
        System.out.printf("\n%f, %<f, %<f\n", 10.5);

        /*int int_a;
        int test0wr;
        int 0test;
        int _test;
        int Test:
        int I_find_you;*/


    }
}
    /***************************2주차***************************

        문장;
        문장 ;
        문장  ;

        Keyword, Data, Operator,

     Data -> Processing -> Information
            -> 연산자
Data : 변수와 상수로 구분가능
     -> 상수는 구분을 위해 연산자로 구분함
     => Byte, Short, Int, Long, Float, Double, Char ···
     
     숫자
        -정수 (Int) 기본형 Int
            Byte < Short < Int < Long
        -실수 (Float) 기본형 Double
            Float < Double

     문자 (Char)

Processing
     int num = 1;
     -> 정수형 변수
     int : Keyword
     num : 대입 연산자 (변수)
     1   : Data (상수)

     double test = 3.5;
     -> 실수 더블형 상수

     float test = 3.5f;
     -> 실수형 상수

     long sample = 1;
     => int < long 이므로 상관 x

     int a = 3l ; 
     -> 정수 롱형 상수

     char hong = '홍';
     ->

     char hong = "홍";
     => " "는 문자열 string
     => 하나의 문자는 ' '로 묶어야함
     
     * boolean (추후 설명)

문장
     선언문 : 재료
     실행문 : 조리방법

토큰
     int num = 1; // int. num. =. 1. ;

Identifier
     클래스 : 명사나 형용사
     메소드 : 동사
     변수 : 명사 (소문자)
     -영문자로 시작해야함
     
Program의 일반
     IPO model
        입력(데이터) -> 처리 -> 출력(결과) [정보]
        출력
            public class Main{
                public static void main(String[] args) {

                System.out.print("김진용");
                }
            }

     입력 -> 출력
             import java.security.Key;
             import java.util.Scanner;

             public class Main {
                 public static void main(String[] args) {

                 Scanner keyboard = new Scanner(System.in);
                 String name;

                 System.out.print("당신의 이름은?");
                 name = keyboard.nextLine(); //.next : WhiteSpace가 있기 전 Data, .nextLine : Enter가 입력되기 전 Data

                 System.out.print(name);
                 }
             }

        입력 -> 처리 -> 출력

     print
     -> System.print
     -> System.println
     -> System.printf
        -> printf 사용법
            % □ □ □ □
                    └ 포맷의 종류 (형문자)
                  └── 정밀도 지정자 (.digit)
                └──── 폭 지정자 (digit) : 숫자인 경우 고정된 자릿수
              └────── 플래그 (flog) : (+ or 공란)인 경우 오른쪽 정렬, (-)인 경우 왼쪽 정렬
            └──────── 변환사양기호 (%)

                char    ─   %c
                byte    ┐
                short   │
                int     ├   %d, i, o , x
                long    ┘
                float   ┐
                double  ┴   %f
                String  ─   %s



     in -> keyboard
     -> System.in.read(); //문자하나만 읽기가능, 숫자x
     -> Scanner //
     '#' : 문자
     "###" : 문자열

     out  -> monitor
     err -> monitor




     System.out.print("김진용");

     Scanner keyboard = new Scanner(System.in);
     String name;

     System.out.print("\n 당신의 이름은?");
     name = keyboard.nextLine();

     System.out.print(name);

     String result = String.format("\n 이름 : %5s",name);
     System.out.printf(result);

     ***************************2주차***************************/

