public class Counter_1 {

    private final String name;
    private int count;

    public Counter_1(String id){
        name = id;
    }

    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }

    public static void main(String[] args) {
        Counter_1 heads = new Counter_1("heads");
        Counter_1 tails = new Counter_1("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        System.out.println(heads + " " + tails);
        System.out.println(heads.tally() + tails.tally());
    }
}
