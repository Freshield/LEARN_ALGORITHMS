public class DoublingRatio {


    public static double timeTrial(int N){
        int MAX = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSumFast.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        int N = 250;
        double prev = timeTrial(125);
        for (int i = 0; i < 10; i++) {
            double time = timeTrial(N);
            StdOut.printf("%6d %7.1f ", N, time);
            StdOut.printf("%5.1f\n", time/prev);
            prev = time;
            N += N;

        }
    }


}
