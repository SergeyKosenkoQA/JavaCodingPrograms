public class Prime9 {
    public static void main(String[] args) {
        // Java logic to Check if given number is Prime
        //11%2 = 1 // When it is = 0 - It is not prime number
        // If you don't have remainder as 0 - it is prime

        //11%i=0
        // Don't start with 1, we should start with 2
        int val = 11;
        primeValidator(val);
    }
    private static void primeValidator(int val) {
        boolean flag = false;
            // We can check half of the scenarios (/2)
            for(int i = 2; i <= 11/2; i++) {
                if(val%i==0) {
                    flag = true;
                    break;
                }
            }
            String validator = (!flag) ? "Is prime" : "Not prime";
            System.out.println(validator);
//            if(!flag) {
//                System.out.println("Is prime");
//            } else {
//                System.out.println("Not prime");
//            }
        }
        }
