public class week13_exam1 {
    String name = "이순신";    // 전역 변수 (Data 영역)

    public static void main(String[] args) {
        week13_exam1 lee = new week13_exam1();  // 객체 (Object)
        String name = "홍길동";    // 지역 변수 (Stack)

        System.out.printf("이름 : %s",name);
        System.out.printf("이름 : %s",lee.name);
    }
}
