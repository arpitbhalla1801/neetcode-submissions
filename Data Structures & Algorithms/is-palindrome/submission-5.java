class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<2) return true;
        String x = s.toLowerCase();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<x.length();i++) {
            if(Character.isLetterOrDigit(x.charAt(i))) {
                list.add(x.charAt(i));
            } else continue;
        }
        if(list.size()<2) return true;
        boolean check=false;
        for(int j=0;j<list.size()/2;j++) {
            System.out.println(list.get(j));
            System.out.println(list.get(list.size()-j-1));
            if(list.get(j) == list.get(list.size()-j-1)) check=true;
            else check=false;
        }
        return check;
    }
}
