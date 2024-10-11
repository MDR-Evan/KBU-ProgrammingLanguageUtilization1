/* 닭과 개의 합은 37마리이고, 다리의 합은 102개다. 닭과 개는 각각 몇 마리인지를 알아내는 프로그램을 for문, while문, do-while문으로 작성하시오. */
public class week7_Report1_2 {
    public static void main(String[] args) {
        /** x + y = 37 : 2x + 4y = 102 **/
        final int totalanimal = 37, totalanimal_reg = 102;
        int chicken = 0, dog = 1;

        while (chicken <= totalanimal) {
            if (chicken + dog == totalanimal && (chicken * 2) + (dog * 4) == totalanimal_reg) {
                System.out.printf("닭 : %d마리\n개 : %d마리\n", chicken, dog);
                break;
            }
            chicken++;
            dog = totalanimal - chicken;
        }
    }
}
