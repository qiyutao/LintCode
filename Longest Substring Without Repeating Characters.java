
public class Test {
	public static void main(String[] argStrings) {
		String s = "pwwkew";
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			int end = 1;
			boolean flag = false;
			for (int j = i + end; j < s.length(); j++) {
				for (int k = i; k < i + end; k++) {
					if (s.charAt(j) == s.charAt(k)) {
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				} else {
					end++;
				}
			}
			if (max < end)
				max = end;

		}
		System.out.println(max);
	}
}
