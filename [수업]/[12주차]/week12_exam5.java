import java.io.IOException;

public class week12_exam5 {
    public static void main(String[] args, String s) throws IOException {
        int col, row;
        exam5 method = new exam5();

        col = exam5.readData(s);
        row = exam5.readData(s);

        int area = exam5.area(col, row);

        exam5.display(col, row, area);
    }
}
