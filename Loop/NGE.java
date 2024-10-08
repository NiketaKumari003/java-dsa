class Main{
    public static int[] nextLargestLeft(int [] arr){
        int n= arr.length;
        int []ans= new int[n];
        Stack<Integer>st= new Stack<>();
        st.push(-1);
        for(int i=0;i<arr.length;i++){
            while(st.peek()!=-1 && arr[st.peek()]<arr[i]){
                st.pop();
            }
            int daysBefore = i-st.top();
            ans[i]=daysBefore;

        }
        return ans;
    }
}