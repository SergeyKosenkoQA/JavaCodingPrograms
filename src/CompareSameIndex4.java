import java.util.ArrayList;

public class CompareSameIndex4 {
    // Compare same indexes of 2 different arrays and create new array for matching values
    public static void main(String[] args) {
        ArrayList<Integer> sameIndex = new ArrayList<>();
        int[] a = {1, 4, 5, 7};
        int[] b = {6, 4, 3, 7};
        // Output { 4, 7 }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                sameIndex.add(a[i]);
            }

        }
        // If you need to show it in array way
//        Object[] c = sameIndex.toArray();
//        for(Object num : c) {
//            System.out.println(num);
        System.out.println(sameIndex);
        }
    }

