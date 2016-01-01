package keeyeong.codility.Sorting;

import keeyeong.support.*;
import java.util.Arrays;

public class Triangle {
	public int solution(int[] A) {
		if (A == null || A.length < 3) {
			return 0;
		}
		Arrays.sort(A);
		// System.out.println(Arrays.toString(A));
		for (int i = 0; i < A.length - 2; i++) {
			// System.out.println(A[i] + " + " + A[i+1] + " + " + A[i+2]);
			/*
			 * This is not overflow proof, when Integer.MAX_VALUE is added to it
			 * will overflow
			 *
			 * if (A[i] + A[i + 1] > A[i + 2] && A[i] + A[i + 2] > A[i + 1] &&
			 * A[i + 1] + A[i + 2] > A[i]) { return 1; }
			 */
			// This will prevent overflow:
			// Because its sorted, so:
			// A[i]<=A[i+1]<=A[i+2]
			if (A[i] >= 0 && A[i] > A[i + 2] - A[i + 1]) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Move this to JUnit
		Triangle solution = new Triangle();
		// ktan.generate_random_array(1,10,100);
		System.out.println(solution.solution(new int[] { 10, 2, 5, 1, 8, 20 }));
		System.out.println(solution.solution(new int[] { 10, 50, 5, 1 }));
		// System.out.println(solution.solution(new int[] { Integer.MAX_VALUE,
		// Integer.MAX_VALUE, Integer.MAX_VALUE }));
		System.out.println(solution.solution(Support.generateIntArray(3, Integer.MAX_VALUE)));
		// System.out.println(solution.solution(ktan.generate_random_array(Integer.MIN_VALUE,
		// Integer.MAX_VALUE, 100000)));
		System.out.println(solution.solution(Support.generateRandomSignedIntArray(100000)));
		// System.out.println(solution.solution(ktan.generate_random_array(0,
		// 100, 100000)));
		System.out.println(solution.solution(Support.generateRandomUnsignedIntArray(100000, 100)));
	}
}
