//space complexity O(n) , n= # of elements
//Time complexity is O(1) for all the operations push,pop,top &  getMin
//This code ran successfully on leetcode
//No issues faced; Used the logic dicussed in class. 



class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        mainStack= new Stack<>();
        minStack= new Stack<>();
        min= Integer.MAX_VALUE;
        minStack.push(min);
        
    }
    
    public void push(int val) {
        min = Math.min(val,min);
        mainStack.push(val);
        minStack.push(min);
        
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
        min=minStack.peek();
        
    }
    
    public int top() {
        return mainStack.peek();
        
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
