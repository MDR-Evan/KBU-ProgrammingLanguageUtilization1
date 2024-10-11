public class week13_exam6_output {
    public void display(String[][] student, int[][] data) {
        line();
        System.out.println("학번 이름 국어 영어 수학");;
        line();
        for (int i = 0; i < student.length; i++) {
            System.out.printf("%8s %3s %3d %3d %3d\n", student[i][0], student[i][1], data[i][0], data[i][1], data[i][2]);
        }
    }

    private void line() {
        System.out.println("************************************");
    }
}
