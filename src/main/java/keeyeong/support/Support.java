package keeyeong.support;

import java.util.Arrays;
import java.util.Random;

public class Support {
	// Generate a single random unsigned integer
	public static int randomUnsignedInt() {
		Random r = new Random();
		return r.nextInt(Integer.MAX_VALUE);
	}

	// Generate a single random unsigned integer between 0 and i
	public static int randomUnsignedInt(int max) {
		Random r = new Random();
		return r.nextInt(max);
	}

	// Generate a single random unsigned integer between i and j
	public static int randomUnsignedInt(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min) + min;
	}

	// Generate array of int of size all with value
	public static int[] generateIntArray(int size, int value) {
		int[] result = new int[size];
		Arrays.fill(result, value);
		return result;
	}
}
