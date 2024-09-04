class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
                int start = 0;
        int end =0;
        for(int i=0; i<word.length(); i++){
        if(word.charAt(i)==ch){
end = i;
 break;
        }
    }
    if(end == 0){return word;} else {
    sb.append(word.substring(start,end+1));
    sb.reverse();
    sb.append(word.substring(end+1));
    return sb.toString();
    }
    }
}