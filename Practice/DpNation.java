import java.util.* ;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in) ;
        int t = in.nextInt() ;
        while(t-- > 0){
            int n  = in.nextInt() ;
            int[] arr = new int[n] ;
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt()  ;
            }
            
            int[] dp = new int[n+1] ;
            for(int i=0;i<=n;i++){
                dp[i] = -1 ;
            }
            
            // System.out.println(rob(arr , n , 0 ,dp)) ;
            System.out.println(rob(arr , n , dp) ) ;
        }
    }
    
    private static int rob(int[] arr , int n  , int[] dp ){
        if(n<=0){
            return 0 ;
        }
        if(dp[n] != -1){
            return dp[n] ;
        }
       return dp[n] = Math.max((arr[n-1] +(rob(arr , n-2 , dp))) , rob(arr , n-1 , dp)) ; 
    }
    
   
}
