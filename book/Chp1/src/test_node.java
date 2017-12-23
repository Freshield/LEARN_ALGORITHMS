public class test_node {

    String item;
    test_node next;

    public test_node(String a){
        item = a;
    }

    public static void main(String[] args) {
        test_node first = new test_node("to");
        test_node second = new test_node("be");
        test_node third = new test_node("or");

        first.next = second;
        second.next = third;

        System.out.println(first.next.item);
    }

}
