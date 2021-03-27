import java.util.ArrayList;

public class EliminateDuplicates12 {
    //Eliminate duplicates and print Unique numbers in the Array
    public static void main(String[] args) {
        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        // 4 - 3, 5 - 3, 6 - 2 , 9 - 1
        //Empty ArrayList and pass each and every number

        ArrayList<Integer> noDublicates = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int k = 0;
            if (!noDublicates.contains(a[i])) {
                noDublicates.add(a[i]);
                k++;

                for (int j = i + 1; j < a.length - 1; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }
                System.out.println(a[i] + " is repeated " + k);
                if (k == 1) {
                    System.out.println(a[i] + " is unique number");
                }
            }
        }
    }
}
