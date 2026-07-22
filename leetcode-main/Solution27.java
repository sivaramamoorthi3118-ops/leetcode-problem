//#1832.check if the sentence in pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
// Approach 1
       int a[]=new int[26];
       //frequency 
       for(char c:sentence.toCharArray()){
        int idx=c-'a';
        a[idx]++;
       }
       //traverse krke count ki value check krenge
       for(int i=0;i<26;i++)
       { if(a[i]==0)
        return false;}
       return true;
    }
}
//approach 2 
 /*Set<Character> res = new HashSet<>();
        
        for (char c : sentence.toCharArray()) {
            res.add(c);
        }
        
        return res.size() == 26;*/