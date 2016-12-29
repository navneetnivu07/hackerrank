import java.util.*;


public class Solution {
    
    public static Boolean isBalanced(String expression) {
    	String reverse = new StringBuffer(expression).reverse().toString();
    	System.out.println( expression.compareTo(reverse));
    	return true;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
