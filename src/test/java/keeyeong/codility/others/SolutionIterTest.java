package keeyeong.codility.others;

import static org.junit.Assert.*;

import java.io.File;
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

	@Test
	public void testIteratingThrough() {
		try {

			FileReader f = new FileReader("src" + File.separator + "test" + File.separator + "data" + File.separator
					+ "SolutionIter" + File.separator + "Example.txt");
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
