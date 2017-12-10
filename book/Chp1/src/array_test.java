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

    public static void seq_change(int[] input){
        int N = input.length;
        for (int i = 0; i < N/2; i++){
            int temp = input[i];
            input[i] = input[N-1-i];
            input[N-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(max_num(a));
        System.out.println(average_num(a));
        seq_change(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int[][] b = new int[3][3];
        int num = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = num;
                num ++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(b[i][j]);
            }
        }
    }

}
