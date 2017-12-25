import java.util.Arrays;

public class ThreeSumFast {

    public static void showList(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int rank(int key, int[] list){
        int lo = 0;
        int hi = list.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < list[mid])    hi = mid - 1;
            else if (key > list[mid])   lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int count(int[] a){
        int N = a.length;
        int cnt = 0;
        Arrays.sort(a);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (rank((-a[i]-a[j]), a) > j){
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
