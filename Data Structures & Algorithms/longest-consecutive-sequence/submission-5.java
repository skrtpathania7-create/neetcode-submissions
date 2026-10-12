class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        
        Collections.sort(list);
        int count=1;
        int max=1;
        for(int i=0;i<n-1;i++){
            
            if(list.get(i+1).equals(list.get(i))){
                continue;
            }
            if(list.get(i+1)-list.get(i)==1){
                count++;
            }else{
                count=1;
            }
            max=Math.max(max,count);
        }        
        return max;
        
    }
}
