package keeyeong.codility.StacksAndQueues;

import keeyeong.support.Support;

public class Nesting {
	public int solution(String S) {
		int open_counter = 0;
		for (char c : S.toCharArray()) {
			if (c == '(')
				open_counter++;
			else {
				if (open_counter <= 0)
					return 0;
				else
					open_counter--;
			}
		}
		if (open_counter == 0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Move this to JUnit
		Nesting solution = new Nesting();
		System.out.println(solution.solution("(()(())())"));
		System.out.println(solution.solution("())"));
		System.out.println(solution.solution("((()()()())()())"));
		System.out.println(solution.solution("()(()()(((()())(()()))"));
		System.out.println(solution.solution(""));
		// System.out.println(solution.solution(ktan.generate_random_string("()",
		// 10)));
		System.out.println(solution.solution(Support.generateRandomCharacterString("()", 10)));
		// System.out.println(solution.solution(ktan.generate_random_string("()",
		// 1000000)));
		System.out.println(solution.solution(Support.generateRandomCharacterString("()", 1000000)));
	}
}
