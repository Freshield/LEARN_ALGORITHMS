public class SelectionSort {

    public static void sort(Comparable[] list){
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (less(list[j], list[min])) min = j;
            }
            exch(i,min,list);
        }
    }

    public static void exch(int a, int b, Comparable[] list){
        Comparable temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    public static boolean isSorted(Comparable[] list){
        for (int i = 0; i < list.length - 1; i++) {
            if (less(list[i+1], list[i]))   return false;
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
        //String filename = "words3.txt";
        //String[] a = In.readStrings(filename);
        String[] b = {"s","o","r","t","e","x","a","m","p","l","e"};
        sort(b);
        assert isSorted(b);
        show(b);
    }

}
