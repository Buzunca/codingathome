import java.util.*;

class ValidParentheses {
    private HashMap<Character, Character> pairs;
    
    public ValidParentheses() {
        this.pairs = new HashMap<Character, Character>();
        this.pairs.put(')', '(');
        this.pairs.put('}', '{');
        this.pairs.put(']', '[');    
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();    
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (this.pairs.containsKey(c)) {
                char top = stack.empty() ? '#' : stack.pop();
                
                if (top != this.pairs.get(c)) {
                    return false;
                }
            }
                else {
                    stack.push(c);
                }
        }
        
        return stack.isEmpty();
    
    }
}