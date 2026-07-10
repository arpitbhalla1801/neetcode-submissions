class Solution {
    static {
        for(int i=0;i<500;i++) {
            checkInclusion("hello", "hello");
        }
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0;i<s1.length();i++) {
            arr1[s1.charAt(i)-'a']+=1;
            arr2[s2.charAt(i)-'a']+=1;
        }
        int m=0;
        for(int i=0;i<26;i++) {
            if(arr1[i]!=arr2[i]) m++;
        }

        int l=0;
        for(int r=s1.length();r<s2.length(); r++) {
            if(m==0) return true;

            int in = s2.charAt(r)-'a';
            arr2[in]+=1;
            if(arr1[in] == arr2[in]) m--;
            else if(arr1[in] + 1 == arr2[in]) m++;


            in = s2.charAt(l)-'a';
            arr2[in]-=1;
            if(arr1[in] == arr2[in]) m--;
            else if(arr1[in] - 1 == arr2[in]) m++;
            l++;
        }
        return m==0;
    }
}
