496. Next Greater Element I
   class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        Stack<Integer> s1=new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i=n2.length-1;i>=0;i--){
            int num=n2[i];
            while(!s1.isEmpty() && s1.peek()<=num){
               s1.pop(); 
            }
            if(s1.isEmpty()) map.put(num,-1);
            else map.put(num,s1.peek());
            
        s1.push(num);
        }
    
     for (int i = 0; i < n1.length; i++) {  
            n1[i] = map.containsKey(n1[i]) ? map.get(n1[i]) : -1;  
        }
        return n1;
    }
}

682. Baseball Game
   class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    int res = stack.get(stack.size() - 2) + stack.peek();
                    stack.add(res);
                    result += res;
                }
                case "D" -> {
                    int res = stack.peek() * 2;
                    stack.add(res);
                    result += res;
                }
                case "C" -> result -= stack.pop();
                default -> {
                    int res = Integer.parseInt(operation);
                    stack.add(res);
                    result+=res;
                }
            }
        }
        return result;
    }
}
