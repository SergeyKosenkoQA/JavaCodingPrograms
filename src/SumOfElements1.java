public class SumOfElements1 {

    // Create a method which accepts Array and returns sum of all the elements in array
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        // 15
        int sum = sumArray(a);
        System.out.println(sum);
    }
    private static int sumArray(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }

}
