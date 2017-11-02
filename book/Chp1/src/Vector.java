public class Vector {

    private final double[] coords;

    public Vector(double[] a){
        double[] copy = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }
        coords = copy;
    }

    public double[] getCoords(){
        return coords;
    }

    public static void main(String[] args) {
        double[] a = {3.0, 4.0};
        Vector vector = new Vector(a);
        a[0] = 0.0;
        System.out.println(vector.getCoords()[0]);
    }

}
