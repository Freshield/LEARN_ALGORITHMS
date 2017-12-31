import java.util.Arrays;

public class ThreeSum {

    public static int rank(int key, int[] list){
        int lo = 0;
        int hi = list.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < list[mid])  hi = mid - 1;
            else if (key > list[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int count(int[] list){
        Arrays.sort(list);
        int cnt = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (rank((-list[i]-list[j]), list) > j){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String filename = "4Kints.txt";
        int[] a = In.readInts(filename);
        System.out.println(count(a));
    }

}
