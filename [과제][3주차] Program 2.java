public class PrintTest_2 {
    public static void main(String[] args) {

        final String school;
        final String name;
        final int age;
        final char gender;
        final float height;
        final float weight;

        school = "경복대학교";
        name = "김 진용";
        age = 20;
        gender = '남';
        height = 168.1f;
        weight = 95.7f;

        System.out.println("*********************");
        System.out.printf("학교 : %s\n", school);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("신장 : %.1f Cm\n", height);
        System.out.printf("체중 : %.1f Kg\n", weight);
        System.out.println("*********************");



    }
}