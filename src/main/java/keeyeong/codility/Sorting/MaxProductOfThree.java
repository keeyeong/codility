package keeyeong.codility.Sorting;

import java.util.Arrays;

import keeyeong.support.Support;

public class MaxProductOfThree {
	public int solution(int[] A) {
		Arrays.sort(A);
		// System.out.println(Arrays.toString(A));
		// System.out.println(A.length);
		return Math.max(A[0] * A[1] * A[A.length - 1], A[A.length - 1] * A[A.length - 2] * A[A.length - 3]);
	}

	public static void main(String[] args) {
		// TODO Move this to JUnit
		MaxProductOfThree solution = new MaxProductOfThree();
		// ktan.generate_random_array(1,10,100);
		System.out.println(solution.solution(new int[] { 10, 2, 5, 1, 8, 20 }));
		System.out.println(solution.solution(new int[] { 10, 50, 5, 1 }));
		System.out.println(solution.solution(new int[] { -3, 1, 2, -2, 5, 6 }));
		// System.out.println(solution.solution(new int[]
		// {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE}));
		System.out.println(solution.solution(new int[] { 1000, 1000, 1000 }));
		System.out.println(solution.solution(new int[] { -1000, -1000, -1000 }));
		// System.out.println(solution.solution(ktan.generate_random_array(Integer.MIN_VALUE,Integer.MAX_VALUE,100000)));
		// System.out.println(solution.solution(ktan.generate_random_array(-1000,
		// 1000, 100000)));
		System.out.println(solution.solution(Support.generateRandomIntArray(100000, -1000, 1000)));
		// System.out.println(solution.solution(ktan.generate_fixed_array(-1000,
		// 100000)));
		System.out.println(solution.solution(Support.generateIntArray(100000, -1000)));
		// System.out.println(solution.solution(ktan.generate_fixed_array(1000,
		// 100000)));
		System.out.println(solution.solution(Support.generateIntArray(100000, 1000)));
	}
}
