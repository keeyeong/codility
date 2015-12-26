package keeyeong.codility.Arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OddOccurrencesInArrayTest {

	OddOccurrencesInArray s;

	@Before
	public void setUp() throws Exception {
		this.s = new OddOccurrencesInArray();
	}

	@Test
	public void testSolution() {
		assertEquals("Example", 7, s.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}

}
