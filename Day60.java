20. Valid Parentheses
  class Solution {
    public boolean isValid(String str) {
     Stack<Character> s = new Stack<>();
     for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == '(' || ch == '{' || ch == '['){
            s.push(ch);
        }else{
            if(s.isEmpty()){
                return false;
            }
            // check pairs 
            if(s.peek()=='(' && ch == ')' || (s.peek()=='{' && ch == '}') || (s.peek() == '[') && ch == ']'){
                s.pop();
            }else{
                return false;
            }
        }
     }
     if(s.isEmpty()){
        return true;
     }else{
        return false;
     }
    }
}



232. Implement Queue using Stacks
  import java.util.Stack;

class MyQueue {
    private Stack<Integer> in_stack;
    private Stack<Integer> out_stack;

    public MyQueue() {
        in_stack = new Stack<>();
        out_stack = new Stack<>();
    }

    private void transfer() {
        while (!in_stack.isEmpty()) {
            out_stack.push(in_stack.pop());
        }
    }

    public void push(int x) {
        in_stack.push(x);
    }

    public int pop() {
        if (out_stack.isEmpty()) {
            transfer();
        }
        return out_stack.pop();
    }

    public int peek() {
        if (out_stack.isEmpty()) {
            transfer();
        }
        return out_stack.peek();
    }

    public boolean empty() {
        return in_stack.isEmpty() && out_stack.isEmpty();
    }
}
