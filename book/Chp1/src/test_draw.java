import java.util.Arrays;

public class test_draw {

    public static void draw_values(){
        int N = 100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i <= N; i++) {
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i, i*Math.log(i));
        }
    }

    public static void draw_random_array(){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0*i/N;
            double y = a[i] / 2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }

    public static void draw_seq_array(){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }
        Arrays.sort(a);

        for (int i = 0; i < N; i++) {
            double x = 1.0*i/N;
            double y = a[i] / 2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }

    public static void main(String[] args) {
        //StdDraw.point(0.5,0.5);
        //StdDraw.line(0.2,0.2,0.8,0.8);
        //StdDraw.circle(0.5,0.5,0.3);
        //StdDraw.square(0.5,0.5,0.3);
        //draw_values();
        //draw_random_array();
        //draw_seq_array();

    }

}
