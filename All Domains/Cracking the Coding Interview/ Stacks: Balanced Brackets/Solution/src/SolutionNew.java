import java.util.*;


public class SolutionNew {
    
    public static Boolean isBalanced(String expression) {
    	char[] strArray = expression.toCharArray();
    	boolean flag = true;
    	int padding = 1;
//    	for(int i = 0; i < strArray.length ; i++){
//    		if(strArray[i] == '}'){
//    			strArray[i] = '{';
//    		} else if(strArray[i] == ']'){
//    			strArray[i] = '[';
//    		} else if(strArray[i] == ')'){
//    			strArray[i] = '(';
//    		}
//    	}

    	for(int i = strArray.length/2 - 1; i >= 0 ; i--){
    		System.out.println("i = " + i + " char is " + strArray[i] + " i+padding = " + (i + padding) + " char is " + strArray[i+padding]);
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
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}