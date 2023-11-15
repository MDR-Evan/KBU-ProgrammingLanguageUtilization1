public class week12_exam9 { // method overload 중복정의 || method overright 재정의
    private static int abs(int data) {
        if (data < 0) {
            data = -data;
        }
        return data;
    }

    private static long abs(long data) {
        if (data < 0L) {
            data = -data;
        }
        return data;
    }

    private static float abs(float data) {
        if (data < 0.0f) {
            data = -data;
        }
        return data;
    }

    private static Double abs(Double data) {
        if (data < 0.0f) {
            data = -data;
        }
        return data;
    }

    public static void main(String[] args) {

    }
}
