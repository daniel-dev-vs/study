package hackerrank;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

    }

    public static String balancedBrackets(String s){
        Stack<Character> stackOfChars  = new Stack<>();
        Character openBrace = '{', closeBrace = '}',
                openSquareBracket = '[', closeSquareBracket = ']',
                openParen = '(', closeParen=')';

        final String NO = "NO";
        final String YES = "YES";

        if(s== null || s.length() == 0){
           return NO;
        }

        for (Character character : s.toCharArray()) {
            boolean isBrace = character.equals(openBrace);
            boolean isSqureBracket = character.equals(openSquareBracket);
            boolean isParentheses = character.equals(openParen);

            if(isBrace || isParentheses || isSqureBracket){
                stackOfChars.push(character);
            } else if(stackOfChars.isEmpty()){
                return NO;
            } else if(character.equals(closeBrace)){
                if(stackOfChars.peek().equals(openBrace)){
                    stackOfChars.pop();
                }else{return NO;}
            } else if(character.equals(closeSquareBracket)){
                if(stackOfChars.peek().equals(openSquareBracket)){
                    stackOfChars.pop();
                }else{return NO;}
            } else if(character.equals(closeParen)){
                if(stackOfChars.peek().equals(openParen)){
                    stackOfChars.pop();
                }else{ return NO;}
            }
        }

        if (stackOfChars.isEmpty())
            return YES;

        return NO;
    }

    public static String balancedBRackrsWithoutStack(String s){
        int n = -1;
        while (s.length() != n) {
            n = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("", "");
        }
        if (s.length() == 0)
            return "YES";
        else
            return "NO";
    }


}
