class Solution {
    public boolean isAnagram(String s, String t) {
         int[] charCountS = new int[26];
         int[] charCountS2 = new int[26];


        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            int index = (int)letter - 97;
            charCountS[index]++;
        }
        for(int i = 0; i < t.length(); i++){
            char letter = t.charAt(i);
            int index = (int)letter - 97;
            charCountS2[index]++;
        }
          boolean Ok = true;
                for(int i = 0 ; i<26 ; i++){
            if(charCountS[i] != charCountS2[i]){
                Ok = false;
             }
        }
        if(Ok){
            return true;
        }
        return false;

    

    }
}