public class test_merge {

    public static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo;
        int j = mid + 1;

        Comparable[] aux = new Comparable[hi + 1 - lo];
        //copy the matrix
        for (int k = lo; k < hi + 1; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k < hi + 1; k++) {
            if (i > mid)    a[k] = aux[j++];
            else if (j > hi)    a[k] = aux[i++];
            else if (less(aux[j], aux[i]))  a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String a = "e e g m o r r s a e e l m p t x";
        String[] test = a.split(" ");
        show(test);
        int lo = 0;
        int hi = test.length - 1;
        int mid = hi / 2;
        merge(test, lo, mid, hi);
        show(test);
    }



}
