import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BinarySearch {

    public static void show_list(int[] input){
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    public static int rank(int key, int[] list){
        //!!!the list should be sorted
        int lo = 0;
        int hi = list.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < list[mid]) hi = mid - 1;
            else if (key > list[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        /*
        while (!StdIn.isEmpty()){
            System.out.println(StdIn.readInt());
        }
        */
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
