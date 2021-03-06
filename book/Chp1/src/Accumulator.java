public class Accumulator {

    private double total;
    private int N;

    public void addDataValue(double val){
        N++;
        total += val;
    }

    public double mean(){
        return total / N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }

    public static void main(String[] args) {
        int T = 100000;
        Accumulator a = new Accumulator();
        for (int i = 0; i < T; i++) {
            a.addDataValue(StdRandom.random());
        }
        System.out.println(a);

    }

}
