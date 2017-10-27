public class Reverse {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        In in = new In("tinyT.txt");

        while (!in.isEmpty()){
            stack.push(in.readInt());
        }

        for (int i : stack){
            System.out.println(i);
        }
    }

}
