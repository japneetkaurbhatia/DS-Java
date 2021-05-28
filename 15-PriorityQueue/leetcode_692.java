class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
             if(map.get(a) == map.get(b)){
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
        });
        for(String str : map.keySet()){
            pq.add(str);
            
            if(pq.size() > k)
                pq.remove();
        }
        int idx = pq.size();
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < idx; i++)
            ans.add("");
        while(pq.size() != 0){
            ans.set(--idx,pq.remove());
        }
        
         

        return ans;
    }
}