package keeyeong.codility.Arrays;

/*
 * https://codility.com/programmers/task/odd_occurrences_in_array/
 */

public class OddOccurrencesInArray {
	public int solution(int[] A) {
		/*
		 * When two same numbers XOR they become 0. Based on this principle, XOR
		 * all the numbers in the list and you end up with only the one that is
		 * single
		 * 
		 * Credit to codesays.com
		 */
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result = result ^ A[i];
			// System.out.printf("i = %d, A[%d] = %d, result = %d\n", i, i,
			// A[i], result);
		}
		return result;
	}
}
