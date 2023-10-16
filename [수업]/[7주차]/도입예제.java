/* 한 줄에 별표(*) 다섯 개를 다섯 줄에 출력하는 Program 작성하여라 */
public class 도입예제 {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.printf("%s\n",i);
        }

        int a = 0;
        while (a < 5){
            System.out.println("*****");
            a++;
        }
    }
}