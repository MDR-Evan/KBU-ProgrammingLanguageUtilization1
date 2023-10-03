public class week5_Report3 {
    public static void main(String[] args) {
        int vote;
        final int ballot = 38, man = 3;

        System.out.print("38명이 있는 학급에서 임원 3명을 뽑을 때, 3위 안에 들기 위해서는 최소 몇 표를 득표해야 하는가?\n");

        vote = (ballot / (man + 1)) + 1;

        System.out.printf("\n최소 득표수는 %d표 입니다.", vote);
    }
}