package keeyeong.codility.others;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class WeeksIntervalByMonthsTest {

	WeeksIntervalByMonths solution;

	@Before
	public void setUp() throws Exception {
		solution = new WeeksIntervalByMonths();
	}

	@Test
	public void testSolution() {
		// START HERE:
		// System.out.println(solution.solution(2014,"January","December","Monday"));
		// System.out.println(solution.solution(2014, "April", "May",
		// "Wednesday"));
		// System.out.println(solution.solution(2016, "February", "July",
		// "Wednesday"));
		// System.out.println(solution.solution(2016, "February", "May",
		// "Wednesday"));
		// System.out.println(solution.solution(2016,"January","January","Monday"));
		// System.out.println(solution.solution(2016,"January","December","Monday"));
		assertEquals("Example", 7, solution.solution(2014, "April", "May", "Wednesday"));

	}

	@Test
	public void testReturnMonthNumber() {
		assertEquals("January", Calendar.JANUARY, solution.returnMonthNumber("January"));
	}

}
