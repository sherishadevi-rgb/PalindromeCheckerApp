import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

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

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.add(input.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

class UseCase12PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    UseCase12PalindromeCheckerApp(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    boolean uc12check(String input) {
        return strategy.check(input);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String wrd = "madam";

        UseCase12PalindromeCheckerApp uc12 =
                new UseCase12PalindromeCheckerApp(new StackStrategy());

        System.out.println("Palindrome checker by UC12 (Stack): "
                + uc12.uc12check(wrd));

        uc12 = new UseCase12PalindromeCheckerApp(new DequeStrategy());

        System.out.println("Palindrome checker by UC12 (Deque): "
                + uc12.uc12check(wrd));
    }
}