class Solution {
    public int integerBreak(int n) {
    int[][] dp=new int[58 + 1][57 + 1];
    for(int[] nums:dp){
        Arrays.fill(nums,-1);
    }
    return fn(n,n-1,dp);
    }
    
    public int fn(int index, int cur,int[][] dp)
    {    
        if (index== 0||cur == 0)
            return 1;
        if (dp[index][cur] != -1) return dp[index][cur];
        if (cur > index)
            return dp[index][cur] = fn(index- 0, cur - 1,dp);
        else
            return dp[index][cur] = Math.max(fn(index - 0, cur - 1,dp), cur * fn(index - cur, cur,dp));
    }
    
}