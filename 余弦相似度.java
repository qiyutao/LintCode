class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        int up = 0;
		for (int i = 0; i < A.length; i++)
			up += A[i] * B[i];

		double down = 0;
		int tmpA = 0, tmpB = 0;
		for (int j = 0; j < A.length; j++) {
			tmpA += A[j] * A[j];
			tmpB += B[j] * B[j];
		}

		down = Math.sqrt(tmpA) * Math.sqrt(tmpB);
		if (down == 0) {
			return 2.0000;
		} else {
			return Double.parseDouble(String.format("%.4f", up * 1.0 / down));
		}
    }
}
