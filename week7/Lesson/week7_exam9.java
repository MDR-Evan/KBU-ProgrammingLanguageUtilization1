/*
토끼와 거북이가 달리기를 하는데 토끼의 속도는 시속 60Km/h로 달리고, 거북이는 시속 35Km/h로 달린다 그리고 거북이는 토끼보다 450m 앞에서 출발한다 토끼가 거북이를 앞지르는 것은 출발 후 몇 초 후부터 인가 ?
 */
public class week7_exam9 {
    public static void main(String[] args) {
        final int 분 = 60, 초 = 60, Km = 1000;
        float 토끼 = 60.0f * Km / (분*초);
        float 거북이 = 35.0f * Km / (분*초);
        float 토끼_거리 = 0.0f, 거북이_거리 = 450.0f;

        int sec = 0;
        while (true) {
            토끼_거리 += 토끼;
            거북이_거리 += 거북이;
            sec++;

            if (토끼_거리 > 거북이_거리) {
                break;
            } else {
                System.out.printf("\n\n경과시간 : %d초\n거북이 : %.2f M\n토끼 : %.2f M\n\n",sec,거북이_거리,토끼_거리);
            }
        }

        System.out.printf("%d초면 토끼가 거북이를 %.2f M 만큼 앞지릅니다.",sec , 토끼_거리 - 거북이_거리);
    }
}