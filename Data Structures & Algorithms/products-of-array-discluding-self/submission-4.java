class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int prod=1;
        int pos=-1;
        int zeroCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                pos=i;
                zeroCount++;
            }
            else{
                prod*=nums[i];
            }
        }
        if(zeroCount>1){
            return res;
        }
        if(zeroCount==1){
            res[pos]=prod;
            return res;
        }
        for(int i=0;i<n;i++){
            res[i]=prod/nums[i];
        }
        return res;
    }
}  
