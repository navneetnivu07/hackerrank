import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        boolean result = true;
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
            if(p[p_i] > (c*m)){
                result = false;
            }
        }
        if(result){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}