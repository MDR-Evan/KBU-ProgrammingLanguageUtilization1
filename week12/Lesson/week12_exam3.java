public class week12_exam3 {
    public static void main(String[] args) {
        double temp, convert;
        week12_exam3_compute compute = new week12_exam3_compute();

        temp = week12_exam3_compute.readData();          // call by name
        convert = week12_exam3_compute.convert(temp);    // call by value
        week12_exam3_compute.display(temp, convert);     // call by value
    }
}
