public class SortArray5 {
    public static void main(String[] args) {
        int[] a = {2, 6, 1, 4, 9};
        int temp = 0;
        // 1,6,2,4,9
        // 1

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0 ; i < a.length; i ++) {
            System.out.println(a[i]);
        }
    }
}
