package keeyeong.codility.Iterations;

public class BinaryGap {
	public int solution(int N) {
		int maxGap = 0;
		int counter = 0;
		boolean started = false;
		String s = Integer.toBinaryString(N);
		for (int i = 0; i < s.length(); i++) {
			if (started && s.charAt(i) == '1') {
				maxGap = Math.max(counter, maxGap);
				counter = 0;
			} else if (started) {
				counter++;
			} else if (!started && s.charAt(i) == '1') {
				started = true;
				counter = 0;
			}
		}
		return maxGap;
	}
}
