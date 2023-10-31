//다음의 배열에 담긴 모든 값의 합을 출력하시오.
//다음 배열에서 홀수 번째 요소에 대한 값의 합을 출력하시오.
//다음 배열에서 짝수 번째 요소에 대한 값의 합을 출력하시오.
//int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
public class week8_Report1 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int total_result = 0, odd_result = 0, even_result = 0;

        for (int i = 0; i < data.length; i++) {
            total_result += data[i];

            if (i % 2 == 1) {
                odd_result += data[i];
            } else {
                even_result += data[i];
            }
        }

        System.out.printf("모든 값의 합 : %d\n",total_result);
        System.out.printf("홀수 번째 요소 : %d\n",odd_result);
        System.out.printf("짝수 번째 요소 : %d\n",even_result);
    }
}