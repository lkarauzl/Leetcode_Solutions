package leetcode;

import java.util.Stack;

public class valid_paranthesis {

	public static void main(String[] args) {
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
		System.out.println(isValid("(){}[]"));
		System.out.println(isValid("([{)"));
		System.out.println(isValid("["));

	}


		public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } else {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((c == ')' && top != '(') || 
	                    (c == '}' && top != '{') || 
	                    (c == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }
	        if (!stack.isEmpty()) {return false;}
	       return true; 
	}

}
