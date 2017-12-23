import java.util.Iterator;

public class StackLink<Item> implements Iterable<Item>{

    private Node first;
    private int N;
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }


    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public void remove(){

        }
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        StackLink<String> s;
        s = new StackLink<String>();
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

        for (String n : s){
            System.out.println(n);
        }

    }



}
