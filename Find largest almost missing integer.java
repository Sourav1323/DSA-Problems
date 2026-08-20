class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> c = new HashMap<>();
         int minc=51, maxi=-1;
        for(int i=0; i<=nums.length-k;i++){
            HashSet<Integer> s = new HashSet<>();
              for(int j=i;j<i+k;j++){
                  s.add(nums[j]);
              }
              for (int p:s){
                c.put(p,c.getOrDefault(p,0)+1);
              }
        }
       for(Map.Entry<Integer,Integer> e:c.entrySet() ){
        if(e.getValue()==1)
        if(e.getValue()<=minc)
        if(e.getKey()>maxi){
        maxi=Math.max(maxi,e.getKey());
        minc=Math.min(minc,e.getValue());
        }
       }
       return maxi;

    }
}