public class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        LinkedHashMap<String,ArrayList<String>> hm=new LinkedHashMap<>();
        for(String i:arr){
            ArrayList<Character> temp=new ArrayList<>();
            for(char c:i.toCharArray())temp.add(c);
            Collections.sort(temp);
            String s="";
            for(char p:temp)s+=p;
            if(hm.containsKey(s)){
                hm.get(s).add(i);
            }
            else{
                hm.put(s,new ArrayList<>());
                hm.get(s).add(i);
            }
        }
       ArrayList<ArrayList<String>> res=new ArrayList<>();
       for(String s:hm.keySet()){
           res.add(hm.get(s));
       }
        return res;
        
}