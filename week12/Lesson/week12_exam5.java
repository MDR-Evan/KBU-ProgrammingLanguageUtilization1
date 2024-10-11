import java.io.IOException;

public class week12_exam5 {
    public static void main(String[] args, String s) throws IOException {
        int col, row;
        week12_exam5_compute method = new week12_exam5_compute();

        col = week12_exam5_compute.readData(s);
        row = week12_exam5_compute.readData(s);

        int area = week12_exam5_compute.area(col, row);

        week12_exam5_compute.display(col, row, area);
    }
}
