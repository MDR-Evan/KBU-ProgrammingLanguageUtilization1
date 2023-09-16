public class EarthToMoon {
    public static void main(String[] args) {
        final float ETM;
        double LOS;
        double distance;

        ETM = 384403f;
        LOS = 300000;
        distance = ETM / LOS;

        System.out.printf("달까지 거리 : %.0f Km\n",ETM);
        System.out.printf("빛의 속도 : %.0f Km/S\n",LOS);
        System.out.printf("달까지 빛의 속도로 가면 %.2f 초면 도착합니다.\n",distance);


    }
}
