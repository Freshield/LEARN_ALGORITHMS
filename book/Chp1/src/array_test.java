public class array_test {

    public static int max_num(int[] input){
        int max = 0;
        for (int i = 0; i < input.length; i++){
            if (max < input[i]) max = input[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(max_num(a));
    }

}
