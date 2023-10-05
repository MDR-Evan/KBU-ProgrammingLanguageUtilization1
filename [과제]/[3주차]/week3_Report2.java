import java.util.Arrays;
import java.util.Scanner;

public class introduction {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        float weight;
        String gender;
        String Gender;
        String blood;

        System.out.print("이름을 입력하시오 : ");
        name = keyboard.nextLine();
        System.out.print("나이를 입력하시오 : ");
        age = keyboard.nextInt();
        System.out.print("몸무게를 입력하시오 : ");
        weight = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.print("성별을 한글로 입력하시오 (남/여) : ");
        gender = keyboard.nextLine();
        System.out.print("성별을 영어로 입력하시오 (M/W) : ");
        Gender = keyboard.nextLine();
        System.out.print("혈액형을 입력하시오 : ");
        blood = keyboard.nextLine();

        System.out.printf("\n%s은(는) %d살이고, %.2f Kg 입니다.\n",name, age, weight);
        System.out.printf("%s은(는) %s자(%s)입니다.\n",name, gender, Gender);
        System.out.printf("혈액형은 %s 형 입니다.\n",blood);
    }
}
