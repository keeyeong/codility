package keeyeong.codility.TimeComplexity;

/*
 * https://codility.com/programmers/task/frog_jmp/
 */

public class FrogJmp {
	public int solution(int X, int Y, int D) {
		double jumps = (Y - X) / (double) D;
		return (int) Math.ceil(jumps);
	}

}
