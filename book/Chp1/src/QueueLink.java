public class QueueLink<Item> {

    private Node first;
    private Node last;
    private int N;
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()){
            first = last;
        }else {
            oldlast.next = last;
        }
        N++;
    }

    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    public static void main(String[] args) {
        QueueLink<String> s;
        s = new QueueLink<String>();
        String input = "to be or not to - be - - that - - - is";
        String[] temps = input.split(" ");
        for (String temp : temps){
            if (!temp.equals("-")){
                s.enqueue(temp);
            } else if (!s.isEmpty()) {
                System.out.println(s.dequeue()+" ");
            }
        }

        System.out.println("(" + s.size() + " left on stack)");

    }

}
