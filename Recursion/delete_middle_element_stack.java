// DELETE MIDDLE ELEMENT OF STACK USING RECURSION

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        helper(s, 0, sizeOfStack);
        
        return;
    } 
    
    public void helper(Stack<Integer> s, int count, int size){
        if(s.isEmpty() || count == size/2){
            s.pop();
            return;
        }
        
        int temp = s.pop();
        // System.out.println(temp);
        helper(s, count+1 ,size);
        s.push(temp);
        
        return;
    }
}
