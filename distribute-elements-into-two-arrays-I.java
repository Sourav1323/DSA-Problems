class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> n1= new ArrayList<>();
      ArrayList<Integer> n2= new ArrayList<>();
       n1.add(nums[0]);
       n2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(n1.get(n1.size()-1)>n2.get(n2.size()-1)) n1.add(nums[i]);
            else n2.add(nums[i]);
        }
        for(int i=0;i<n1.size();i++){
            nums[i]=n1.get(i);
        }
        for(int i=n1.size(),k=0;k<n2.size();i++,k++){
            nums[i]=n2.get(k);
        }
       return nums;
    }
}