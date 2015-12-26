package keeyeong.codility.lessons01;

public class FrogJmp {

	public int solution(int X, int Y, int D) {
		double jumps = (Y - X) / (double) D;
		return (int) Math.ceil(jumps);
	}

}
