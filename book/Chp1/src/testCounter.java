public class testCounter {

    public static void main(String[] args) {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        heads.increment();
        System.out.println(heads.tally() - tails.tally());
    }

}
