public class Shell {

    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while (h < N / 3)   h = h * 3 + 1;

        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a,j,j-h);
                }
            }
            h /= 3;
            show(a);
        }

    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String filename = "words3.txt";
        String[] a = In.readStrings(filename);
        String temp = "s h e l l s o r t e x a m p l e";
        String[] b = temp.split(" ");
        Integer[] c = {3,4,2,7,1,9,10,23,43,0,5,11};

        show(b);
        sort(b);
        assert isSorted(b);
        show(b);
    }

}
