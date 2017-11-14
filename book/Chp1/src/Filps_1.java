public class Filps_1 {

    public static void main(String[] args) {
        int T = 100000;

        Counter_1 heads = new Counter_1("heads");
        Counter_1 tails = new Counter_1("tails");
        for (int i = 0; i < T; i++) {
            if (StdRandom.bernoulli(0.5)){
                heads.increment();
            }else {
                tails.increment();
            }
        }
        System.out.println(heads);
        System.out.println(tails);
        int d = heads.tally() - tails.tally();
        System.out.println("delta: " + Math.abs(d));
    }

}
