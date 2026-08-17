class Solution {
    public int maximumLengthSubstring(String s) {
     
      int max=0, newmax=0;
      for( int i=0; i<s.length();i++){
        boolean t=true;
        for ( int j=i;j<s.length();j++){
            String ns = s.substring(i,j+1);
            HashMap<Character,Integer> uc = new HashMap<>();
            for(int k=0;k<ns.length();k++){
                uc.put(ns.charAt(k),uc.getOrDefault(ns.charAt(k),0)+1);
                if(uc.get(ns.charAt(k))>2){
                  t=false;
                  break;
                }
            }
            if(t!=false){
                newmax=ns.length();
                
            }
            else break;
        }
        max = Math.max(max,newmax);
      }
      return max;
    }
}