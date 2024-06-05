class Solution {
    public int findPermutationDifference(String s, String t) {
       Map<Character, Integer> map = new HashMap<>();
       int result=0;
       for(int i=0; i<s.length(); i++){char cs = s.charAt(i); map.put(cs,i);}
       for(int i=0; i<s.length(); i++){char ct= t.charAt(i); result += Math.abs(map.get(ct)-i);
    }
    return result;
}
}