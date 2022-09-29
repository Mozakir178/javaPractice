

DpNation - Robbing Houses 1 Ended
Description

Robbery is pretty common in dp nation.

A robber is planning to rob houses along a street. Each house has a certain amount of gold stashed, the only constraint stopping you from robbing each of them is that adjacent houses have a very smart security system connected andit will automatically alert the police if two adjacent houses were robbed  on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money the roober can rob tonightwithoutgetting caught.


Input
1<=T<=10

1<=N<=1000

1<=Ai<=100


Output
output a single integer , which is the solution to the question.


Sample Input 1 

3
2
1 100
3
2 100 99
4
100 1 1 100
Sample Output 1

100
101
200


### Solution ###



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
