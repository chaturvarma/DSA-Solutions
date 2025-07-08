import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        char[] char_array = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < char_array.length; i++) {
            if(char_array[i] == '(' || char_array[i] == '[' || char_array[i] == '{') {
                stack.push(char_array[i]);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();

                if((char_array[i] == ')' && top != '(') ||
                   (char_array[i] == ']' && top != '[') ||
                   (char_array[i] == '}' && top != '{')) {
                    return false;
                   }
            }
        }

        return stack.isEmpty();
    }
}
