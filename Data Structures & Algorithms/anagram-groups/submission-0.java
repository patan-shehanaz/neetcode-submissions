class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String,list<String>> map = new HashMap<>();

        // for(String s:strs){
        //     char []ch = s.toCharArray(strs);
        //     Arrays.sort(ch);
        //     String sk = new String(chars);

        //     map.putIfAbsent(sk,new ArrayList<>());
        //     map.get(sk).add(s);

        // }
        // return new ArrayList<>(map.values()); 













        Map<String,List<String>> map =  new HashMap<>();

        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sk = new String(ch);

            map.putIfAbsent(sk,new ArrayList<>());
            map.get(sk).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
