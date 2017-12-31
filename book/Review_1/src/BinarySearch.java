import java.util.Arrays;

public class BinarySearch {

    private static int rank(int key, int[] list){
        int lo = 0;
        int hi = list.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < list[mid])    hi = mid - 1;
            else if (key > list[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] inputlist = In.readInts("tinyT.txt");
        int[] whitelist = In.readInts("tinyW.txt");
        Arrays.sort(whitelist);
        for (int i = 0; i < inputlist.length; i++) {
            int key = inputlist[i];
            if (rank(key,whitelist) < 0){
                System.out.println(key);
            }
        }
    }

}
