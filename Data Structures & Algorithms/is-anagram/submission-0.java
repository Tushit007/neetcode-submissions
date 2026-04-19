class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        char arr2[]=t.toCharArray();
        Arrays.sort(arr2);
        for(int i=0;i<s.length();i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
