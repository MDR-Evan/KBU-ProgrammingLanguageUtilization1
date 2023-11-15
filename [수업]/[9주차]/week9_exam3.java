import java.io.IOException;
import java.util.Scanner;

public class week9_exam3 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String[] name = {"홍길동", "김선민", "오정민", "김진용", "김익주"};
        char[] gender = {0, 1, 1, 1, 1};
        float[] weight = new float[name.length];
        float[] height = new float[name.length];
        float[] standard = new float[name.length];
        float[] ratio = new float[name.length];
        String[] result = new String[name.length];
        String[] message = new String[name.length];

        for (int i = 0; i < name.length; i++) {
            System.out.printf("%s님의 키 입력 : ",name[i]);
            height[i] = keyboard.nextFloat();
            System.out.printf("%s님의 체중 입력 : ",name[i]);
            weight[i] = keyboard.nextFloat();

//            if (height[1] < 50.0f || height[i] > 250.0f || weight[1] < 30.0f || weight[i] > 150.0f) {
//                System.err.println("입력오류");
//                System.in.read();
//                i--;
//            }

            if (gender[i] == 1) {
                standard[i] = ((height[i] - 100) * 0.9f);
            } else {
                standard[i] = (height[i] - 100) * 0.85f;
            }

            ratio[i] = (weight[i] - standard[i]) / standard[i] * 100;
            if (ratio[i] <= -10.0f) {
                result[i] = "저체중";
            } else if (ratio[i] < 20.0f) {
                result[i] = "정상";
            } else if (ratio[i] <= 29.0f) {
                result[i] = "경도 비만";
            } else if (ratio[i] <= 49.0f) {
                result[i] = "중등도 비만";
            } else {
                result[i] = "고도 비만";
            }

            if (result[i].equals("경도 비만") || result[i].equals("중등도 비만") || result[i].equals("고도 비만")) {
                message[i] = "필요 합니다.";
            } else {
                message[i] = "필요 없습니다.";
            }
        }

        System.out.println("***********************************************************************************************************************************************************");
        System.out.println(" 이름\t성별\t\t\t키\t\t  몸무게\t\t\t표준 체중\t\t\t\t\t\t\t\t\t\t\t BMI\t\t\t\t\t\t\t\t\t 다이어트여부");
        System.out.println("***********************************************************************************************************************************************************");
        for (int i = 0; i < name.length ; i++) {
            System.out.printf("%3s\t%c자\t\t%5.1fCm\t\t%5.1fKg\t\t표준체중은 %5.1f Kg\t당신은 %6s으로 표준체중보다 %5.1f%% (%5.1f Kg)\t%6s 입니다.\t\t 당신은 다이어트가 %7s\n",name[i],gender[i] == 1 ? '남' : '여',height[i],weight[i],standard[i], result[i], ratio[i], Math.abs(weight[i] - standard[i]), (standard[i] > weight[i]) ? "미달" : "초과",message[i]);
        }
        System.out.println("***********************************************************************************************************************************************************");
    }
}