public class BubbleSort {


    public static void sort(Comparable[] list){
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = list.length - 1; j > i; j--) {
                if (less(list[j],list[j-1])){
                    exch(j,j-1,list);
                }
            }
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
        String filename = "words3.txt";
        String[] a = In.readStrings(filename);
        String[] b = {"s","o","r","t","e","x","a","m","p","l","e"};
        sort(a);
        assert isSorted(a);
        show(a);
    }


}
