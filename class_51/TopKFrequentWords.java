package class_51;
/*
 https://leetcode.com/problems/top-k-frequent-words/
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
	class Pair{
        String word;
        int freq;
        Pair(String word, int freq){
            this.word = word;
            this.freq = freq;
        }
    }
    
    class CustomComarator implements Comparator<Pair>{
        
        @Override
        public int compare(Pair p1, Pair p2){
            if(p1.freq < p2.freq)
                return -1;
            else if(p1.freq > p2.freq)
                return 1;
            else{
                return -1*(p1.word).compareToIgnoreCase(p2.word);
            }
        }
    }
    
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> hm = new HashMap<>();
        for(int i =0; i <words.length; i++){
            String word = words[i];
            if(hm.containsKey(word) == false )
                hm.put(word, 0);
            
            hm.put(word, hm.get(word)+1);
        }
    
        List<String> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(new CustomComarator());
        for(String key : hm.keySet()){
            pq.add(new Pair(key, hm.get(key)));
            if(pq.size()>k) pq.poll();
        }
        while(!pq.isEmpty())
            ans.add(0, pq.poll().word);
        
        
        return ans;
    }
}
