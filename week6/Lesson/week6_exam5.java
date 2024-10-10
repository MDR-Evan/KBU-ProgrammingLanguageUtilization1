import java.util.Scanner;
/* 100m 기록이 10초 미만이면 육상선수 후보, 11초 미만이 면 축구선수 후보, 12초 미만이면 하키선수 후보, 그 외는 부적합을 출력하는 프로그램을 작성하자 (입력은 소수점 두 자리 까지) */
public class week6_exam5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float record;
        String result;

        System.out.print("100m 달리기 기록 입력 하시오. (소수점 두 자리까지 입력)\n");
        record = keyboard.nextFloat();
        
        // if문
        if (record < 10.0f) {
            result = "육상선수 후보";
        } else if (record < 11.0f) {
            result = "축구선수 후보";
        } else if (record < 12.0f) {
            result = "하키선수 후보";
        } else {
            result = "부적합";
        }

        // switch문
        /*switch  ((int) record) {
            case 8 :
            case 9 :
                result = "육상선수 후보";
                break;
            case 10 :
                result = "축구선수 후보";
                break;
            case 11 :
                result = "하키선수 후보";
                break;
            default :
                result = "부적합";
        }*/

        System.out.printf("100m 기록 : %.2f\n%s 입니다.",record,result);
    }
}
