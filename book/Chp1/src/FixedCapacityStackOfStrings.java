public class FixedCapacityStackOfStrings {

    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(String item){
        a[N] = item;
        N++;
    }

    public String pop(){
        N--;
        return a[N];
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        String input = "to be or not to - be - - that - - - is";
        String[] temps = input.split(" ");
        for (String temp : temps){
            if (!temp.equals("-")){
                s.push(temp);
            } else if (!s.isEmpty()) {
                System.out.println(s.pop()+" ");
            }
        }

        System.out.println("(" + s.size() + " left on stack)");
    }

}
