class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = s.length();

        while (i < n) {
           
            int slashIndex = s.indexOf('#', i);
            
            
            int length = Integer.parseInt(s.substring(i, slashIndex));
            
            
            int wordStart = slashIndex + 1;
            int wordEnd = wordStart + length;
            
            
            result.add(s.substring(wordStart, wordEnd));
            
           
            i = wordEnd;
        }

        return result;
    }
}

