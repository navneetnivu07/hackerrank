import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            int count = 0;
            for(int i = 1; i <= x; i++){
                if((i ^ x) > x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}