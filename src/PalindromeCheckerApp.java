class UseCase9PalindromeCheckerApp{
    boolean uc9check(String input,int start,int end){
        boolean isPalindrome=false;
        while(start<end) {
            if (input.charAt(start) == input.charAt(end)) {
                isPalindrome = true;

                start = start + 1;
                end = end - 1;
                uc9check(input, start, end);

            }
        }
        return isPalindrome;
    }
}
public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String wrd = "madam";

        UseCase9PalindromeCheckerApp uc9 = new UseCase9PalindromeCheckerApp();
        System.out.println("Palindrome checker by UC9: " + uc9.uc9check(wrd, 0, wrd.length() - 1));
    }
}
