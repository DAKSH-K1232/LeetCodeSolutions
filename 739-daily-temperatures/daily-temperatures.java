class Solution {
    public int[] dailyTemperatures(int[] temps) {
       Stack<Integer> stack=new Stack<>();
       int[] results =new int[temps.length];
       for(int i=0; i<temps.length;i++){
        while(!stack.isEmpty() && temps[stack.peek()]<temps[i]){
            results[stack.peek()]=i-stack.pop();
        }
        stack.push(i);
       }
       return results;
    }
}