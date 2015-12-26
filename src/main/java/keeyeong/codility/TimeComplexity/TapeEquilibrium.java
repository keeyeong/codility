package keeyeong.codility.TimeComplexity;

public class TapeEquilibrium {
	public int solution(int[] A) {
		int left = A[0];
		int right = 0;
		int diff;
		for (int i = 1; i < A.length; i++) {
			right += A[i];
		}
		int min = Math.abs(left - right);
		for (int i = 1; i < A.length - 1; i++) {
			left += A[i];
			right -= A[i];
			diff = Math.abs(left - right);
			if (diff < min) {
				min = diff;
			}
		}
		return min;
	}
}
