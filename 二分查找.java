class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int start = 0;
		int end = nums.length - 1;
		int pos;

		while (start != end) {
			if (nums[(end + start) / 2] == target) {
				pos = (end + start) / 2;
				while (nums[pos] == target) {
					pos--;
					if (pos < 0)
						break;
				}
				return ++pos;
			} else if (nums[(end + start) / 2] > target) {
				end = (end + start) / 2 - 1;
			} else {
				start = (end + start) / 2 + 1;
			}
		}

		if (nums[end] != target)
			pos = -1;
		else {
			while (nums[end] == target) {
				end--;
				if (end < 0)
					break;
			}
			pos = ++end;
		}
		return pos;
    }
}
