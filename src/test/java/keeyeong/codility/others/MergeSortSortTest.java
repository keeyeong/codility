package keeyeong.codility.others;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MergeSortSortTest {

	MergeSortSort s;

	@Before
	public void setUp() throws Exception {
		this.s = new MergeSortSort();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSolution() {
		/*
		 * I forgot to save this one so I will have to create my own test case
		 * from Memory
		 */
		assertEquals("Example", 2040, s.solution(new int[] { 1000, 500, 10 }));
		assertEquals("Example", 1420, s.solution(new int[] { 1000, 200, 5 }));
		assertEquals("Example", 2200, s.solution(new int[] { 1000, 400, 100 }));
		assertEquals("Example", 1800, s.solution(new int[] { 1000, 200, 100 }));
	}

	@Test
	public void testSolutionBad() {
		/*
		 * This is the sample input I recreated from memory that gave me the
		 * correct result with my wrong solution!
		 */
		assertEquals("Example", 2400, s.solutionBad(new int[] { 1000, 400, 100 }));
	}
}
