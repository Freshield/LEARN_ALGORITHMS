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
        if (N == a.length)  resize(2*a.length);
        a[N] = item;
        N++;
    }

    public Item pop(){
        N--;
        Item item = a[N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
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
