public class SortCompare {

    public static double time(String alg, Comparable[] a){
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion"))    Insertion.sort(a);
        else if (alg.equals("Bubble"))  Bubble.sort(a);
        else if (alg.equals("Selection"))   Selection.sort(a);
        else if (alg.equals("Shell"))   Shell.sort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < N; j++) {
                a[j] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {

        String alg1 = "Insertion";
        String alg2 = "Shell";
        String alg3 = "Selection";
        int N = 10000;
        int T = 200;
        System.out.printf("For %d random Doubles\n", T);
        double t1 = timeRandomInput(alg1, N, T);
        System.out.printf("%s use %.2f seconds\n", alg1, t1);
        double t2 = timeRandomInput(alg2, N, T);
        System.out.printf("%s use %.2f seconds\n", alg2, t2);
        double t3 = timeRandomInput(alg3, N, T);
        System.out.printf("%s use %.2f seconds\n", alg3, t3);
    }

}
