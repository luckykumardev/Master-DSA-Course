package class_12;

/*
        Patterns
       
        16, 11, 6, 1, -4, 1, 6, 11, 16        
     
        10, 5, 0, 5, 10
        
*/

public class PrintPattern {
	static void printPattern(int n, int m, boolean flag)    {
     
        System.out.print(m + " ");
        if (flag == false && n == m)
            return;
 
        if (flag) {
 
            if (m - 5 > 0)
                printPattern(n, m - 5, true);
 
            else // recur with false flag
                printPattern(n, m - 5, false);
        }
 
        else
            printPattern(n, m + 5, false);
    }
 
    public static void main(String[] args)
    {
        int n = 16;
        printPattern(n, n, true);
    }
}
