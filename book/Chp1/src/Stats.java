public class Stats {

    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();

        double[] temp = {100,99,101,120,98,107,109,81,101,90};

        for (double t: temp
             ) {
            numbers.add(t);
        }

        int N = numbers.size();

        double sum = 0.0;
        for (double x : numbers){
            sum += x;
        }
        double mean = sum / N;

        sum = 0.0;
        for (double x : numbers){
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);

        System.out.println("queue");
        System.out.println();

        In in = new In("tinyT.txt");
        Queue<Integer> q = new Queue<Integer>();

        while (!in.isEmpty()){
            q.enqueue(in.readInt());
        }

        N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = q.dequeue();
        }

        for (int x : a){
            System.out.println(x);
        }

    }

}
