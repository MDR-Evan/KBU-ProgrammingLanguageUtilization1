public class week13_exam2 {
    public static void main(String[] args) {
        int[] data = {2, 5, 8, 9, 12};

        display("before",data);

//        multifule(data);        // 1차원 배열 매개변수 call by reference

        for (int i = 0; i < data.length; i++) {
            data[i] = multifule(data[i]);   //call by value
        }

        display("after",data);
    }

    private static void display(String title,int[] data) {
        System.out.printf("%s",title);
        for (int i = 0; i < data.length; i++) {

            System.out.printf("%3d",data[i]);
        }
        System.out.printf("\b\b\n");
    }
    private  static int multifule(int data) {
        data *= 2;
        return data;
    }
    private  static void multifule(int data[]) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }
}
