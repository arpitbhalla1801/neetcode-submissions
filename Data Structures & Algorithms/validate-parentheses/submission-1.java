class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> check = new HashMap<>();
        check.put(')', '(');
        check.put('}', '{');
        check.put(']', '[');

        for(int i=0;i<s.length();i++) {
            if(check.containsKey(s.charAt(i))) {
                if(!stack.isEmpty() && stack.peek()==check.get(s.charAt(i))) stack.pop();
                else return false;
            } else stack.push(s.charAt(i));
        }


        return stack.isEmpty();
    }
}
