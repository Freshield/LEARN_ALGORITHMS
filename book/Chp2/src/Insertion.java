public class Insertion {

    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j-1])){
                    exch(a, j, j-1);
                }else {
                    break;
                }
            }
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
        String[] b = {"s","o","r","t","e","x","a","m","p","l","e"};
        Integer[] c = {3,4,2,7,1,9,10,23,43,0,5,11};
        sort(c);
        assert isSorted(c);
        show(c);
    }

}
