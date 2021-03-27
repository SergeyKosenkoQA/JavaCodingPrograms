public class SwapVariablesTemp6 {
    //Swap the variables with and with out using Temp variable
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        //    int temp = 0;

//        temp = a;
//        a = b;
//        b = temp;

        a = a * b; // 20
        b = a / b ; // 4
        a = a / b ; // 5

        System.out.println("a=" + a + " b=" + b);

    }
}
