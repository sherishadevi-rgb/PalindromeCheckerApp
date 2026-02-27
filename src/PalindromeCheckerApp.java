import java.util.*;
class UseCase8PalindromeCheckerApp{
    void uc8check(String input){
        LinkedList<Character> list=new LinkedList<>();
        for(char c:input.toCharArray()){
            list.add(c);
        }
        boolean isPalindrome=false;
        while(list.size()>1){
            if(list.getFirst()==list.getLast()){
                isPalindrome=true;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
public class PalindromeCheckerApp{
    public static void main(String[]args){
        String wrd="madam" ;
        UseCase8PalindromeCheckerApp uc8=new UseCase8PalindromeCheckerApp();
        uc8.uc8check(wrd);


    }
}

