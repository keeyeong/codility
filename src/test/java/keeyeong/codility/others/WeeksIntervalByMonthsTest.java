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
		// System.out.println(solution.solution(2016, "February", "May",
		// "Wednesday"));
		assertEquals("Example", 7, solution.solution(2014, "April", "May", "Wednesday"));
	}

	@Test
	public void startAtBoundary() {
		// February 2016 starts on Monday
		assertEquals("Start Mon", 17, solution.solution(2016, "February", "May", "Friday"));
	}

	@Test
	public void endAtBoundary() {
		// July 2016 ends on Sunday
		assertEquals("End Sun", 13, solution.solution(2016, "May", "July", "Friday"));
	}

	@Test
	public void bothBoundaries() {
		// February 2016 starts on Monday
		// July 2016 ends on Sunday
		assertEquals("Start Mon, End Sun", 26, solution.solution(2016, "February", "July", "Friday"));
	}

	@Test
	public void wholeYears() {
		assertEquals("Whole 2014", 51, solution.solution(2014, "January", "December", "Wednesday"));
		assertEquals("Whole 2015", 51, solution.solution(2015, "January", "December", "Thursday"));
		assertEquals("Whole 2016", 51, solution.solution(2016, "January", "December", "Friday"));
		// Last week of the year ends on Sunday
		assertEquals("Whole 2017", 52, solution.solution(2017, "January", "December", "Sunday"));
	}

	@Test
	public void oneMonth() {
		assertEquals("Only Jan 2014", 3, solution.solution(2014, "January", "January", "Wednesday"));
		assertEquals("Only Jan 2015", 3, solution.solution(2015, "January", "January", "Thursday"));
		assertEquals("Only Jan 2016", 4, solution.solution(2016, "January", "January", "Friday"));
	}

	@Test
	public void testReturnMonthNumber() {
		assertEquals("January", Calendar.JANUARY, solution.returnMonthNumber("January"));
		assertEquals("February", Calendar.FEBRUARY, solution.returnMonthNumber("February"));
		assertEquals("March", Calendar.MARCH, solution.returnMonthNumber("March"));
		assertEquals("April", Calendar.APRIL, solution.returnMonthNumber("April"));
		assertEquals("May", Calendar.MAY, solution.returnMonthNumber("May"));
		assertEquals("June", Calendar.JUNE, solution.returnMonthNumber("June"));
		assertEquals("July", Calendar.JULY, solution.returnMonthNumber("July"));
		assertEquals("August", Calendar.AUGUST, solution.returnMonthNumber("August"));
		assertEquals("September", Calendar.SEPTEMBER, solution.returnMonthNumber("September"));
		assertEquals("October", Calendar.OCTOBER, solution.returnMonthNumber("October"));
		assertEquals("November", Calendar.NOVEMBER, solution.returnMonthNumber("November"));
		assertEquals("December", Calendar.DECEMBER, solution.returnMonthNumber("December"));
	}

}
