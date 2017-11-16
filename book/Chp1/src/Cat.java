public class Cat {

    public static void main(String[] args) {
        String[] inputs = new String[3];
        inputs[0] = "in1.txt";
        inputs[1] = "in2.txt";
        inputs[2] = "out.txt";

        Out out = new Out(inputs[inputs.length - 1]);
        for (int i = 0; i < inputs.length - 1; i++) {
            In in = new In(inputs[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();

    }

}
