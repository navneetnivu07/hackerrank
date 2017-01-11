import java.util.Scanner;

public class ContiguousSubsequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String number = in.next();
		// List<Integer> seq = new ArrayList<Integer>();
		// char[] num = number.toCharArray();
		int count = 0;
		int rec = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				// seq.add(Integer.parseInt((String) number.subSequence(j, j +
				// rec)));
				// System.out.println(number.subSequence(j, j + rec));
				int temp = Integer.parseInt((String) number.subSequence(j, j + rec));
				if (temp % 8 != 0) {
					count++;
				}
			}
			rec--;
		}
		System.out.println(count % (1000000000 + 7));
	}
}
