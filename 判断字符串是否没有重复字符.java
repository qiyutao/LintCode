public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        Set<Byte> set = new HashSet<>();
		byte[] bs = str.getBytes();

		for (int i = 0; i < bs.length; i++) {
			if (set.contains(bs[i])) {
				return false;
			}
			set.add(bs[i]);
		}

		return true;
    }
}
