public class CountStringOccurence13 {
    //Logic to Count no of occurence of characters in the String
    public static void main(String[] args) {
        int count = countOccurances("aaanjda",'a');
        System.out.println(count);
    }

    private static int countOccurances(String word, char character) {
        int count = 0;
        for(int i = 0 ; i < word.length() ; i++) {
            if(word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
