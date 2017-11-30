public class testCounter {

    public static void increase(Counter test){
        test.increment();
    }

    public static void increased(int a){
        a++;
    }

    public static void main(String[] args) {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        heads.increment();
        //System.out.println(heads.tally() - tails.tally());
        System.out.println(heads);
        increase(heads);
        System.out.println(heads);
        int b = 1;
        System.out.println(b);
        increased(b);
        System.out.println(b);


    }

}
