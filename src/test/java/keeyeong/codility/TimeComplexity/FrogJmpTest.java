package keeyeong.codility.TimeComplexity;

import static org.junit.Assert.*;

/*
 * https://codility.com/programmers/task/frog_jmp/
 */

import org.junit.Before;
import org.junit.Test;

public class FrogJmpTest {

	FrogJmp s;

	@Before
	public void setUp() throws Exception {
		this.s = new FrogJmp();
	}

	@Test
	public void testSolution() {
		assertEquals("Example", 3, s.solution(10, 85, 30));
	}

}
