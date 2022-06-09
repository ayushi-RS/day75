class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")  )
        {
            return "0";
        }
        int j=0;
       int []ans=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            int carry=0;
            for( j=num2.length()-1;j>=0;j--)
            {
                int value=(carry+ans[i+j+1]+((num1.charAt(i)-'0')*(num2.charAt(j)-'0')));
                ans[i+j+1]=value%10;
                carry=value/10;
            }
            if(carry!=0)
            {
                ans[i+j+1]=carry;
            }
        }
        StringBuilder sb=new StringBuilder();
        if(ans[0]!=0)
        {
            sb.append(ans[0]);
        }
        for(int i=1;i<ans.length;i++)
        {
           sb.append(ans[i]);
        }
        return sb.toString();
        
    }
}