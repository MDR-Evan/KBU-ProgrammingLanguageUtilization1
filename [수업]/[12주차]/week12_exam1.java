public class week12_exam1 {
    public static void main(String[] args) {
        convert(-40.0);                      // 실 매개변수      caller(호출자)     call by value
        convert(30.0);                       // 실 매개변수
        convert(40.0);                       // 실 매개변수
    }

    private static void convert(double v) {     // 형식 매개변수    callee()
        System.out.printf("C = %.1.f --> ",v);
        print("F = ");                      // call by value
        double f = v * 9.0 / 5.0 + 32.0;
        printf("%f",f);
    }

    private static void print(String s) {
        System.out.print(s);
    }

    private static void printf(String s, double f) {
        System.out.printf(s);
    }
}
