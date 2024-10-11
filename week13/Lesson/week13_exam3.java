public class week13_exam3 {
    public static void main(String[] args) {
        int[] data; //지역 변수

        data = multipule(); //call by name
        
        display(data);
    }

    private static void display(int[] sample) {
        for (int i = 0; i < sample.length; i++) {
            System.out.printf("%3d", sample[i]);
        }

        System.out.printf("\b\b");
    }

    private static int[] multipule() {
        int[] data = {2, 3, 4, 5, 6};   // 지역 변수
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
        return data;
    }
}
