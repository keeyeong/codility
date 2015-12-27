package keeyeong.codility.Iterations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {

	BinaryGap s;

	@Before
	public void setUp() throws Exception {
		this.s = new BinaryGap();
	}

	@Test
	public void testExamples() {
		assertEquals("Example: input 9", 2, s.solution(9));
		assertEquals("Example: input 529", 4, s.solution(529));
		assertEquals("Example: input 20", 1, s.solution(20));
		assertEquals("Example: input 15", 0, s.solution(15));
		assertEquals("Example: input 1041", 5, s.solution(1041));
	}

	@Test
	public void testMinMax() {
		assertEquals("Min: input 1", 0, s.solution(1));
		assertEquals("Max: input " + Integer.MAX_VALUE, 0, s.solution(Integer.MAX_VALUE));
	}
}
