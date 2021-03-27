public class Fibanocci8 {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
        //Print Fibanocci Series by swapping variables

        int a = 0;
        int b = 1;


        int i = 1;
        int sum = 0;

        while (i < 9) {
            sum = a + b;
            a = b;
            b = sum;

            i++;
            System.out.println(sum);
        }
    }
}
