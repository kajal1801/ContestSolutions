public class ArrayGame {
    public static int min_operations(int n, int[] arr, int[] brr) {
        // code here
        int ans = 0, i, key;
        while(n > 0){
            if(arr[0] == brr[0]){
                i = 0;
                while(i < n && (i+1) < n){
                    arr[i] = arr[i+1];
                    i++;
                }
                i = 0;
                while(i < brr.length && (i+1) < brr.length){
                    brr[i] = brr[i+1];
                    i++;
                }
                n--;
            }
            else{
                i = 0;
                key = arr[0];
                while(i < n - 1){
                    arr[i] = arr[i+1];
                    i++;
                }
                arr[i] = key;
            }
            ans++;
        }
        return ans;
    }
}

