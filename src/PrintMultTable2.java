public class PrintMultTable2 {
    //Print Multiplication table without using Multiply operator
    public static void main(String[] args) {
        int multi = multiply(5, 10); //50

        System.out.println(multi);
    }

    private static int multiply(int a, int b) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += b;
        }

        return sum;
    }
}

