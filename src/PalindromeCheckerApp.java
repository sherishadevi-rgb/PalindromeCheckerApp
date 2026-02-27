import java.util.Stack;

class UseCase11PalindromeCheckerApp {

    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        UseCase11PalindromeCheckerApp uc11 = new UseCase11PalindromeCheckerApp();

        System.out.println("Palindrome checker by UC11: "
                + uc11.checkPalindrome(word));
    }
}