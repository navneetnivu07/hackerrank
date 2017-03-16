import java.util.Scanner;

// All Possible Subsequence in Order

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String number = in.next();
		Integer[] seq = new Integer[1000000000];
		char[] num = number.toCharArray();
		if (Integer.parseInt(number) <= 200000) {
			int count = 0;
			int index = 0;
			for (int i = 0; i < n; i++) {
				seq[index] = Integer.parseInt(num[i] + "");
				if (seq[index] % 8 == 0) {
					count++;
				}
				// System.out.println(seq[index]);
				index++;
				int size = index;
				for (int j = 0; j < size - 1; j++) {
					seq[index] = Integer.parseInt((seq[j] + "" + num[i]));
					// System.out.println(seq[index]);
					if (seq[index] % 8 == 0) {
						count++;
					}
					index++;

				}
			}
			System.out.println(count % (1000000000 + 7));
		}
	}
}
