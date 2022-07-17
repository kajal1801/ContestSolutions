class MaximumNumber {
    public int maxNumber(int num) {
        // Your code here
        String s = Integer.toString(num);
        int len = s.length(), i = 0;
        String a = "";
        for(i = 0;i<len;i++){
            if(s.charAt(i) == '7')
            {
                a = a + '9';
                break;
            }
            a = a + s.charAt(i);
        }
        if(i+1 < len){
            a = a + s.substring(i+1);
        }
        int ans = Integer.parseInt(a);
        return ans;
    }
}