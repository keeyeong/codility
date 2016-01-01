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

	// Generate array of int of size with random value between Integer.MIN_VALUE
	// and Integer.MAX_VALUE
	public static int[] generateRandomSignedIntArray(int size) {
		int[] result = new int[size];
		Random r = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = r.nextInt();
		}
		return result;
	}

	// Generate array of int of size with random value between 0 and
	// Integer.MAX_VALUE
	public static int[] generateRandomUnsignedIntArray(int size) {
		int[] result = new int[size];
		Random r = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = r.nextInt(Integer.MAX_VALUE);
		}
		return result;
	}

	// Generate array of int of size with random value between 0 and max
	public static int[] generateRandomUnsignedIntArray(int size, int max) {
		int[] result = new int[size];
		Random r = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = r.nextInt(max);
		}
		return result;
	}

	// Generate array of int of size with random value between min and max
	public static int[] generateRandomIntArray(int size, int min, int max) {
		int[] result = new int[size];
		Random r = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) ((r.nextDouble() * (double) ((double) max - (double) min)) + (double) min);
		}
		return result;
	}

	// Generate a string consisting randomly of characters
	public static String generateRandomCharacterString(String characters, int size) {
		StringBuffer result = new StringBuffer(size);
		Random r = new Random();
		int num_char = characters.length();
		for (int i = 0; i < size; i++) {
			int randchar = (int) (r.nextDouble() * (num_char));
			result.append(characters.charAt(randchar));
		}
		return result.toString();
	}

}
