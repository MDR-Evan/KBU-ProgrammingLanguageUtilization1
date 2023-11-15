public class week12_exam3 {
    public static void main(String[] args) {
        double temp, convert;
        섭씨온도_변환기 compute = new 섭씨온도_변환기();

        temp = 섭씨온도_변환기.readData();          // call by name
        convert = 섭씨온도_변환기.convert(temp);    // call by value
        섭씨온도_변환기.display(temp, convert);     // call by value
    }
}
