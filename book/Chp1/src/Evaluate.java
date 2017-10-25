public class Evaluate {

    public static void main(String[] args) {
        //String input = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        String input = "( ( 1 + sqrt ( 5 ) ) / 2 )";
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        String[] temps = input.split(" ");
        for (String temp : temps) {

            if (temp.equals("("))    ;
            else if (temp.equals("+"))   ops.push(temp);
            else if (temp.equals("-"))   ops.push(temp);
            else if (temp.equals("*"))   ops.push(temp);
            else if (temp.equals("/"))   ops.push(temp);
            else if (temp.equals("sqrt"))   ops.push(temp);
            else if (temp.equals(")")){
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("*"))    v = vals.pop() * v;
                else if (op.equals("/"))    v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }else {
                vals.push(Double.parseDouble(temp));
            }
        }
        System.out.println(vals.pop());
    }

}
