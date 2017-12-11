public class array_test {

    public static int max_num(int[] input){
        int max = 0;
        for (int i = 0; i < input.length; i++){
            if (max < input[i]) max = input[i];
        }
        return max;
    }

    public static double average_num(int[] input){
        int N = input.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++){
            sum += input[i];
        }
        return sum / N;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(max_num(a));
        System.out.println(average_num(a));
    }

}
