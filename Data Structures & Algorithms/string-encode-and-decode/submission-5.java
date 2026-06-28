class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String x: strs) {
            res.append(x.length());
            res.append(",");
            res.append(x);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        char[] arr = str.toCharArray();
        String res="";
        int in=0;
        while(in < arr.length) {
            int commaPos = in;
            while (arr[commaPos] != ',') {
                commaPos++;
            }
            int len = Integer.parseInt(str.substring(in, commaPos));
            in = commaPos + 1;
            
            res = str.substring(in, in + len);
            in += len;
            
            list.add(res);
            res="";
        }
        return list;
    }
}