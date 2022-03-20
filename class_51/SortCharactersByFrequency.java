package class_51;
/*
https://leetcode.com/problems/sort-characters-by-frequency/
*/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
	public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        
        pq.addAll(map.keySet());
        
        StringBuilder output = new StringBuilder();
        
        while(!pq.isEmpty()){
            char curr = pq.poll();
            for(int i = 0; i < map.get(curr); i++){
                output.append(curr);
            }
        }
        return output.toString();
    }
	
}
