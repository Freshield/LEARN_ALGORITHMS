public class ShellSort {

    public static void sort(Comparable[] list){
        int m = 3;
        int h = 1;
        int N = list.length;
        while (h < N / m){
            h = h * m + 1;
        }

        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h ; j -= h) {
                    if (less(list[j],list[j-h])){
                        exch(list,j,j-h);
                    }
                }
            }
            h /= m;
        }

    }

    public static void exch(Comparable[] list, int a, int b){
            Comparable temp = list[a];
            list[a] = list[b];
            list[b] = temp;
    }

    public static boolean less(Comparable a, Comparable b){
            return a.compareTo(b) < 0;
    }

    public static boolean isSorted(Comparable[] list){
            for (int i = 0; i < list.length - 1; i++) {
                if (less(list[i + 1], list[i])){
                    return false;
                }
            }
            return true;
    }

    public static void show(Comparable[] list){
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
    }

    public static void main(String[] args) {
        String filename = "words3.txt";
        String[] a = In.readStrings(filename);
        String[] b = {"s","o","r","t","e","x","a","m","p","l","e"};
        sort(b);
        assert isSorted(b);
        show(b);
    }

}
