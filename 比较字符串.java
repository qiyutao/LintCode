public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        byte[] a = A.getBytes();
		byte[] b = B.getBytes();

		boolean flag = false;

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					a[j] = 0;
					flag = true;
					break;
				}
			}
			if (!flag) {
				return false;
			}
			flag = false;
		}

		return true;
    }
}
