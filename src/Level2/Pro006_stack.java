package Level2;

import java.util.Stack;

public class Pro006_stack {
	public static void main(String[] args) {
		Pro006_stack pro = new Pro006_stack();
		System.out.println(pro.solution("(()("));
	}
    boolean solution(String s) {
        boolean answer = true;
        
        // 1차 시도 
        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(0) == ')') {
        	return false;
        }
        
        for(int i=0; i<s.length(); i++) {
        	if(!stack.empty() && s.charAt(i) == ')') {
        		stack.pop();
        	}else {
        		stack.push(s.charAt(i));
        	}
        }

        if(!stack.empty()) answer = false;

        return answer;
    }
}
