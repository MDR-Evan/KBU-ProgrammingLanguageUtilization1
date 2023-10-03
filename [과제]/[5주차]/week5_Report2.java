public class week5_Report2 {//365.2421일이 며칠 몇 시간 몇 분 몇 초인지 환산하는 프로그램을 작성하세요
    public static void main(String[] args) {

        float day, hour, min, sec, odd;
        final float Days = 365.2421F;

        day = Days / 1;
        odd = Days % 1;
        hour = odd * 24;
        odd = hour % 1;
        min = odd * 60;
        odd = min % 1;
        sec = odd * 60;

        int Day = (int) day;
        int Hour = (int) hour;
        int Min = (int) min;
        int Sec = (int) sec;

        System.out.printf("365.2421일 = %d : %d : %d : %d",Day,Hour,Min,Sec);
    }
}