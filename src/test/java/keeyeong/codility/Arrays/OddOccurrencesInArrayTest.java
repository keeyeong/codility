package keeyeong.codility.Arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import keeyeong.support.Support;

/*
 * https://codility.com/programmers/task/odd_occurrences_in_array/
 */

public class OddOccurrencesInArrayTest {

	OddOccurrencesInArray s;

	private final static int MAX_ARRAY_SIZE = 999999;
	private final static int MIN_ARRAY_SIZE = 1;
	private final static int MAX_ARRAY_VALUE = 1000000000;
	private final static int MIN_ARRAY_VALUE = 1;

	@Before
	public void setUp() throws Exception {
		this.s = new OddOccurrencesInArray();
	}

	@Test
	public void testSolution() {
		assertEquals("Example", 7, s.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}

	@Test
	public void testMinArrayRandomValue() {
		int[] i = this.generateWorstArray(MIN_ARRAY_SIZE, 5);
		assertEquals("Min Array Random Value", 5, s.solution(i));
	}

	@Test
	public void testMinArrayMinValue() {
		assertEquals("Min Array Min Value", MIN_ARRAY_VALUE, s.solution(new int[] { MIN_ARRAY_VALUE }));
	}

	@Test
	public void testMinArrayMaxValue() {
		assertEquals("Min Array Max Value", MAX_ARRAY_VALUE, s.solution(new int[] { MAX_ARRAY_VALUE }));
	}

	@Test
	public void testMaxArrayMaxValue() {
		assertEquals("Max Array Max Value", MAX_ARRAY_VALUE,
				s.solution(Support.generateIntArray(MAX_ARRAY_SIZE, MAX_ARRAY_VALUE)));
	}

	@Test
	public void testMaxArrayMinValue() {
		assertEquals("Max Array Min Value", MIN_ARRAY_VALUE,
				s.solution(Support.generateIntArray(MAX_ARRAY_SIZE, MIN_ARRAY_VALUE)));
	}

	@Test
	public void testMaxArrayRandomValue() {
		int randomValue = Support.randomUnsignedInt(MIN_ARRAY_VALUE, MAX_ARRAY_VALUE);
		assertEquals("Max Array Min Value", randomValue,
				s.solution(Support.generateIntArray(MAX_ARRAY_SIZE, randomValue)));
	}

	@Test
	public void test11WorstValues() {
		int[] i = this.generateWorstArray(11, 5);
		assertEquals("Array of 11 Worst Value", 5, s.solution(i));
	}

	@Test
	public void testMaxWorstValues() {
		int[] i = this.generateWorstArray(MAX_ARRAY_SIZE, MAX_ARRAY_VALUE);
		assertEquals("Array of Max Worst Value", MAX_ARRAY_VALUE, s.solution(i));
	}

	public int[] generateWorstArray(int size, int mid) {
		int[] result = new int[size];
		// Worst case scenario
		int i = 0;
		for (i = 0; i < size / 2; i++) {
			result[i] = result[size - 1 - i] = Support.randomUnsignedInt(MIN_ARRAY_VALUE, MAX_ARRAY_VALUE);
		}
		result[i] = mid;
		return result;
	}
}
