import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

class UseCase13PalindromeCheckerApp {

    boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (!stack.isEmpty() && input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    boolean dequeMethod(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    boolean twoPointerMethod(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String wrd = "madam";

        UseCase13PalindromeCheckerApp uc13 =
                new UseCase13PalindromeCheckerApp();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        boolean stackResult = uc13.stackMethod(wrd);
        endTime = System.nanoTime();
        System.out.println("Stack Method: " + stackResult +
                " | Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean dequeResult = uc13.dequeMethod(wrd);
        endTime = System.nanoTime();
        System.out.println("Deque Method: " + dequeResult +
                " | Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean twoPointerResult = uc13.twoPointerMethod(wrd);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Method: " + twoPointerResult +
                " | Time: " + (endTime - startTime) + " ns");
    }
}