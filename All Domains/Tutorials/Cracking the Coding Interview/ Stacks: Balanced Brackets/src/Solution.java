import java.util.*;


public class Solution {
    
    public static Boolean isBalanced(String expression) {
    	char[] strArray = expression.toCharArray();
    	int fwd = 0, bck = 0;
    	boolean flag = false;
    	
    	for(int i = 0; i < strArray.length; i++){
    		if(findType(strArray[i]).toString() == "open"){
    			fwd++;
    		} else if(findType(strArray[i]).toString() == "closed"){
    			bck++;
    		}
    		if(fwd == bck && fwd != 0 && bck != 0){
    			StringBuilder sb = new StringBuilder();
//    			System.out.println("i " + i + " fwd " + fwd + " bck " + bck);
//    			System.out.println((i-(fwd+bck)+1));
    			for(int j = (i-(fwd+bck)+1); j <= i ; j++){
    				System.out.println(strArray[j]);
    				sb.append(strArray[j]);
    			}
//    			System.out.println("closed" + sb);
    			flag = loop(sb.toString());
    			fwd = 0;
    			bck = 0;
    		}
    	}
    	
    	return flag;
    }
    
    public static Boolean loop(String exp){
    	char[] strArray = exp.toCharArray();
    	boolean flag = true;
    	int padding = 1;

    	for(int i = strArray.length/2 - 1; i >= 0 ; i--){
//    		System.out.println("i = " + i + " char is " + strArray[i] + " i+padding = " + (i + padding) + " char is " + strArray[i+padding]);
    		if(strArray[i] == '{'){
    			if(strArray[i+padding] != '}'){
    				flag = false;
    			}
    		} else if(strArray[i] == '['){
    			if(strArray[i+padding] != ']'){
    				flag = false;
    			}
    		} else if(strArray[i] == '('){
    			if(strArray[i+padding] != ')'){
    				flag = false;
    			}
    		} else {
    			flag = false;
    		}
    		padding += 2;
    	}
    //	System.out.println(reverse);
    	return flag;
    }
    
    public static String findType(char a){
    //	System.out.println(a);
    	if(a == '{' || a == '[' || a == '('){
        return "open";
    	} else if(a == '}' || a == ']' || a == ')'){
    	return "closed";
    	} else {
    		return "error";
    	}
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
