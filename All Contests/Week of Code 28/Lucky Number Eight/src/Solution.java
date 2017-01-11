import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// All Possible Subsequence in Order

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String number = in.next();
		List<String> seq = new ArrayList<String>();
		char[] num = number.toCharArray();
		if (n == num.length && Integer.parseInt(number) <= 200000) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				seq.add(num[i] + "");
				if (num[i] % 8 == 0) {
					count++;
				}
				// System.out.println("**" + num[i]);
				// System.out.println("Size " + seq.size());
				int size = seq.size();
				for (int j = 0; j < size - 1; j++) {
					seq.add(seq.get(j) + num[i]);
					// System.out.println(seq.get(j) + num[i] + "");
					int temp = Integer.parseInt((String) (seq.get(j) + num[i]));
					if (temp % 8 == 0) {
						count++;
					}
				}
				// System.out.println("Count : " + count);

			}
			System.out.println(count % (1000000000 + 7));
		} else {

		}
	}
}
