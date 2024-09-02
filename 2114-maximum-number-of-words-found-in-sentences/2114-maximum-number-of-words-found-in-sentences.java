class Solution {
    public int mostWordsFound(String[] sentences) {
        int result =0;
        for(int i=0; i<sentences.length; i++){
            String[] words;
            words = sentences[i].split(" ");
            if(words.length >result) {result = words.length;}
        }
        return result;
    }
}