import java.util.Scanner;
// 키보드로부터 주민등록번호를 입력 받아 주민등록번호가 올바른 번호인지 아닌지를 검사하는 프로그램을 배열을 사용하여 작성하여라.
// 주민등록번호를 배열에 저장하여라
public class week9_Report3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        String idcard;
        int sum = 0, devide = 0, value = 0, result = 0;
        int[] verification = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

        System.out.printf("주민등록번호를 입력하세오.\n예시 : 000101-1111111\n입력 : ");
        idcard = id.nextLine();

        char[] chars = idcard.replace("-", "").toCharArray();
        int[] IDcardnumber = new int[12];

        for (int i = 0; i < 12; i++) {
            IDcardnumber[i] = Character.getNumericValue(chars[i]) * verification[i];
        }

        for (int i = 0; i < 12; i++) {
            sum += IDcardnumber[i];
            devide = sum / 11;
            value = sum % 11;
        }

        if (value < 10) {
            result = 11 - value;
        } else {
            result = 11 - 10;
        }

        if (result == 1) {
            System.out.printf("");
        }
    }
}
//import java.io.Serializable;
//import java.util.Scanner;
//
//public class week9_Report3 {
//    public static void main(String[] args) {
//        Scanner key = new Scanner(System.in);
//        int[] jus1 = new int[13];
//        int fos = 2,don=1,res=0,log=0,lag=0;
//
//        for (int i=0;i<=12;i++){
//            System.out.printf("%d/13 주민등록번호를 입력하세요\n",don);
//            jus1[i]= key.nextInt();
//            don++;
//        }
//        for (int i=0;i<=12;i++){
//            if (fos==10){
//                fos=2;
//                System.out.print(""+jus1[i]);
//                jus1[i]=jus1[i]*fos;
//                System.out.print("*"+fos);
//                System.out.println("="+jus1[i]);
//                res+=jus1[i];
//                fos++;
//            }else if (i<12){
//                System.out.print(""+jus1[i]);
//                jus1[i]=jus1[i]*fos;
//                System.out.print("*"+fos);
//                fos++;
//                System.out.println("="+jus1[i]);
//                res+=jus1[i];
//            }else if (i==12){
//                break;
//            }
//        }
//        System.out.print("검증코드:"+jus1[12]);
//        log=res%11;
//        System.out.println("\n총합:"+res);
//        System.out.println("나머지값:"+log);
//        res=11;
//        if (log>10||log==0){
//            lag=(res-log)-10;
//        }else {
//            lag=res-log;
//        }
//        if (jus1[12]==lag){
//            System.out.print("올바른 주민번호입니다.");
//        }else {
//            System.out.print("올바른 주민번호가 아닙니다.");
//        }
//    }
//}