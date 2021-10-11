package class_09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {
    class Pairs{
        int start;
        int end;
        Pairs(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    int s=Integer.MAX_VALUE;
    int e=Integer.MIN_VALUE;
    public int[][] merge(int[][] arr) {
        Stack<Pairs> stack=new Stack<>();
        
        Arrays.sort(arr,new Comparator<int[]>(){
           public int compare(int x[],int y[]){
               return x[0]-y[0];
           } 
        });
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty())
                stack.push(new Pairs(arr[i][0],arr[i][1]));
            if( inRange(stack.peek(),arr[i][0],arr[i][1])){
                
                Pairs p=stack.pop();
                s=Math.min(p.start,arr[i][0]);
                e=Math.max(p.end,arr[i][1]);
                stack.push(new Pairs(s,e));

            }
            else
            stack.push(new Pairs(arr[i][0],arr[i][1]));
        }
        int res[][]=new int[stack.size()][2];
        int row=0;
        while(!stack.isEmpty()){
            Pairs p=stack.pop();
            res[row][0]=p.start;
            res[row][1]=p.end;
            row++;
        }
        return res;
    }
    boolean inRange(Pairs p,int start,int end){
        int first=p.start;
        int sec=p.end;
        
        if(start>sec)
            return false;
        s=Math.min(first,start);
        e=Math.max(sec,end);
        return true;
    }
}