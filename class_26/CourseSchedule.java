package class_26;
/*
 https://leetcode.com/problems/course-schedule/
*/

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i <numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0; i<prerequisites.length; i++){
            int x = prerequisites[i][0];
            int y = prerequisites[i][1];
            adj.get(x).add(y);
        }
        
        //Cycle check
        boolean visited[] = new boolean[numCourses];
        boolean helper[]  = new boolean[numCourses];
        
        for(int i =0; i <numCourses; i++){
            if(visited[i] == false){
                boolean isCycle = cycle(adj, visited, helper, i);
                if(isCycle == true) return false;
            }
            
        } 

        return true;
    }
    
    private static boolean cycle(List<List<Integer>> adj, boolean visited[], boolean helper[], int curr){
        visited[curr] = true;
        helper[curr] = true;
        List<Integer> neighbour = adj.get(curr);
        for(int i =0; i< neighbour.size(); i++){
            int x = neighbour.get(i);
            if(helper[x] == true) return true;
            if(visited[x] == false){
                boolean ans  = cycle(adj, visited, helper, x);
                if(ans == true) return true;
            }
        }
        
        helper[curr] = false;
        return false;
    }
}