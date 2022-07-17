public class ProblemSetting {
    public static int maximum_problems(int n, int[] problems) {
        // code here
        int curr = 0, res = 0;
        for(int i = 1;i<problems.length;i++){
            if(problems[i] <= (2* problems[i-1])){
                curr++;
                res = Math.max(curr, res);
            }
            else{
                curr = 0;
            }
        }
        return res+1;
    }
}
