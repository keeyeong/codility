package keeyeong.codility.others;

import static org.junit.Assert.*;

import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionIterTest {
	/**
	 * Example usage:
	 *
	 * for (Integer x : new SolutionIter(reader)) { System.out.println(x); }
	 */

	@Before
	public void setUp() throws Exception {
		try {
			FileReader f = new FileReader("SolutionInterTestInput.txt");
			SolutionIter solution = new SolutionIter(f);
			for (Integer x : solution) {
				System.out.println(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIterator() {
	}

}
