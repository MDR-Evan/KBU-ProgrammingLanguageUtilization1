public class week12_exam3 {
    public static void main(String[] args) {
        double temp, convert;
        exam3_compute compute = new exam3_compute();

        temp = exam3_compute.readData();          // call by name
        convert = exam3_compute.convert(temp);    // call by value
        exam3_compute.display(temp, convert);     // call by value
    }
}
