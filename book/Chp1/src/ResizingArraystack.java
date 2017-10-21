import java.util.Iterator;

public class ResizingArraystack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item){
        if (N == a.length) resize(2*a.length);
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

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;

        public boolean hasNext(){
            return i > 0;
        }

        public Item next(){
            i--;
            return a[i];
        }

        public void remove(){

        }
    }


    public static void main(String[] args) {
        ResizingArraystack<String> s;
        s = new ResizingArraystack<String>();
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

        for (String t : s){
            System.out.println(t);
        }
    }

}
