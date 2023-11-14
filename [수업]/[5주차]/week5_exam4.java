public class Program4 { // 지구(Earth)의 표면적에서 대한민국이 얼마를 차지하고 있는지 구하는 Program
    public static void main(String[] args) {

        final int Earth_R= 6378137, KOREA = 99720000;
        Double Earth, Percent;

        Earth = 4 * Math.PI * Math.pow(Earth_R, 2);
        Percent = KOREA / Earth * 100;

        System.out.printf("지구의 표면적 = %.2f M²\n",Earth);
        System.out.printf("대한민국의 면적은 = %,d M²\n", KOREA);
        System.out.printf("대한민국의 면적비 = %,.8f %%\n",Percent);
    }
}