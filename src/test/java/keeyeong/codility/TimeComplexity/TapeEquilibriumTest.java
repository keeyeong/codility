package keeyeong.codility.TimeComplexity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * https://codility.com/programmers/task/tape_equilibrium/
 */
public class TapeEquilibriumTest {

	TapeEquilibrium s;

	@Before
	public void setUp() throws Exception {
		this.s = new TapeEquilibrium();
	}

	@Test
	public void testSolution() {
		assertEquals("Example", 1, s.solution(new int[] { 3, 1, 2, 4, 3 }));
	}
}
