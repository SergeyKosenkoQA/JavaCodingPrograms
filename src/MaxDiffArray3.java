public class MaxDiffArray3 {
    public static void main(String[] args) {
        // Max difference between any adjacent index in array
        int[] a = {1,4,8,15,17}; // 3,4,7,2
        int max = 0;

        for(int i = 0; i < a.length - 1; i++) {
            if(a[i + 1] - a[i] > max) {
                max = a[i + 1] - a[i];
            }
        }
        System.out.println(max);
    }
}
