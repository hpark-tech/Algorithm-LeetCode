class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
     int count=0;
HashSet<Character> hs = new HashSet<>();
     for(int i =0; i<allowed.length(); i++)   
     {hs.add(allowed.charAt(i));}

          for(int i =0; i<words.length; i++)   
     {     for(int j =0; j<words[i].length(); j++)   
     {if(!hs.contains(words[i].charAt(j))){count++; break;}}
    }
    return words.length-count;
    }
    }