public class Palindrom11 {
    //Reverse the String/Palindrome with out using Predefined Reverse methods
    public static void main(String[] args) {
        String str = "madam";
        String tmp = "";
        for (int i = str.length() - 1 ; i >= 0; i --) {
            tmp += str.charAt(i);
        }
        if (str.equals(tmp)) System.out.println("String is Palindrom");
    }
}
