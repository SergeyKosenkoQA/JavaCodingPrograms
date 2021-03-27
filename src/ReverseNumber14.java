public class ReverseNumber14 {
//    543
//    345
//
//    543%10=3
//    543/10=54
//    54%10=4
//    54/10 =5
//    5%10 = 5
//
//    345
    public static void main(String[] args) {
        int a = 543;
        int reverse = 0;
        while(a != 0) {
            int digit = a%10;
            reverse = digit + reverse*10; //3
            a = a/10;
        }
        System.out.println(reverse);
    }
}
