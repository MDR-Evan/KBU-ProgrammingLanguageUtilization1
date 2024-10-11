import java.io.IOException;

public class week13_exam6 {
    static String[][] student = {{"2301111", "김진용"},{"2301104", "김광호"},{"2301125", "오정민"},{"2201904", "김선민"},{"2301109", "김익주"},
            {"2301129", "이순주"},{"2301102", "김가희"},{"2300000", "언노운"},{"1234567", "홍길동"},{"7654321", "동길홍"}};
    /***************** 국어 영어 수학 총점 등수 */
    static int[][] data = {{100, 100, 100, 0, 0}, {80, 70, 51, 0, 0}, {75, 45, 96, 0, 0}, {12, 32, 45, 0, 0}, {78, 51, 78, 0, 0},
            {94, 51, 23, 0, 0}, {45, 68, 57, 0, 0}, {34, 1, 54, 0, 0}, {78, 54, 12, 0, 0},{68, 78, 45, 0, 0}};

    public static void main(String[] args) throws IOException {

//        exam6_input exam6_input = new exam6_input();
//        exam6_input.readdata(student,data);

//        for (int i = 0; i < student.length; i++) {
//            exam6_input.readdata(student[i][1], data[i]);
//        }

        for (int i = 0; i < student.length; i++) {
            data[i][0] = week13_exam6_input.readdata(student[i][1],"국어");
            data[i][1] = week13_exam6_input.readdata(student[i][1],"영어");
            data[i][2] = week13_exam6_input.readdata(student[i][1],"수학");
        }

        week13_exam6_compute exam6_compute = new week13_exam6_compute();

        week13_exam6_output exam6_output = new week13_exam6_output();
        exam6_output.display(student,data);
    }
}
