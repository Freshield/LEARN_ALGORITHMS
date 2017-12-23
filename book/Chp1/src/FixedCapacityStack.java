public class FixedCapacityStack<Item> {


    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap){
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        a[N] = item;
        N++;
    }

    public Item pop(){
        N--;
        return a[N];
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String>(100);
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
