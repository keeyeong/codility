package keeyeong.codility.Leader;

import keeyeong.support.Support;

public class Dominator {
	public int solution(int[] A) {
		int stack_counter = 0;
		int top_value = 0;
		int size = A.length;
		// System.out.println(Arrays.toString(A));
		for (int i : A) {
			if (stack_counter == 0) {
				top_value = i;
				stack_counter++;
			} else {
				if (i != top_value)
					stack_counter--;
				else
					stack_counter++;
			}
		}
		System.out.println("Value = " + top_value + ", Counter = " + stack_counter + ", Size = " + size);
		int counter = 0;
		int index = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == top_value) {
				index = i;
				counter++;
			}
		}
		if (counter > size / 2)
			return index;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Move this to JUnit
		Dominator solution = new Dominator();
		// For integer arrays
		// ktan.generate_random_array(1,10,100);
		// System.out.println(solution.solution(new int[]
		// {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE}));
		// System.out.println(solution.solution(ktan.generate_random_array(Integer.MIN_VALUE,Integer.MAX_VALUE,100000)));
		// System.out.println(solution.solution(ktan.generate_fixed_array(-1000,100000)));
		// System.out.println(solution.solution(ktan.generate_fixed_array(1000,100000)));

		// For Strings
		// System.out.println(solution.solution(ktan.generate_random_string("()",1000000)));

		System.out.println(solution.solution(new int[] { 3, 4, 3, 2, 3, -1, 3, 3 }));
		System.out.println(solution.solution(new int[] {}));
		System.out.println(solution.solution(new int[] { 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 }));
		// System.out.println(solution.solution(ktan.generate_random_array(0,
		// 10, 10)));
		System.out.println(solution.solution(Support.generateRandomUnsignedIntArray(10, 10)));
		// System.out.println(solution.solution(ktan.generate_random_array(Integer.MIN_VALUE,
		// Integer.MAX_VALUE, 10)));
		System.out.println(solution.solution(Support.generateRandomSignedIntArray(10)));
		// System.out.println(solution.solution(ktan.generate_random_array(Integer.MIN_VALUE,
		// Integer.MAX_VALUE, 100000)));
		System.out.println(solution.solution(Support.generateRandomSignedIntArray(100000)));
		// System.out.println(solution.solution(ktan.generate_fixed_array(Integer.MIN_VALUE,
		// 100000)));
		System.out.println(solution.solution(Support.generateIntArray(100000, Integer.MIN_VALUE)));
		// System.out.println(solution.solution(ktan.generate_fixed_array(Integer.MAX_VALUE,
		// 100000)));
		System.out.println(solution.solution(Support.generateIntArray(100000, Integer.MAX_VALUE)));
	}
}
