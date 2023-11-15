public class week12_exam10 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++){
                System.out.printf("args[%d] = %s\n", i, args[i]);
            }
        } else {
            System.err.print("입력오류");
            System.exit(-1);
        }
    }
}
