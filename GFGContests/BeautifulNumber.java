public class BeautifulNumber {
    public boolean bNumber(int n) {
        // Your code here
        int m = n;
        int sq = 0;
        while(m >= 10){
            while(m!=0){
                int a = m%10;
                sq += (int)(Math.pow(a,2));
                m/=10;
            }
            if(sq == 1){
                return true;
            }
            m = sq;
            sq = 0;
        }
        
        return false;
    }
}
