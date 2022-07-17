public class CompleteStaircase {
        public int completeRows(int n) {
            //Your code here
            int k = 1, ans = 0;
            while(k <= n){
                n = n-k;
                k++;
                ans++;
            }
            return ans;
        }
}
