public class Counter {

    String id;
    int number;

    public Counter(String id){
        this.id = id;
        number = 0;
    }

    public void increment(){
        number++;
    }

    public int tally(){
        return number;
    }

    @Override
    public String toString() {
        return id;
    }
}
