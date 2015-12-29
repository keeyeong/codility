package keeyeong.codility.others;

import java.util.Calendar;

public class WeeksIntervalByMonths {
	public int solution(int Y, String A, String B, String W) {
		// write your code in Java SE 8
		Calendar cal = Calendar.getInstance();
		int count = 0;
		int offset = -1;
		int startWeek;
		int endWeek;
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		// Get start date
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, returnMonthNumber(A));
		cal.set(Calendar.YEAR, Y);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		startWeek = cal.get(Calendar.WEEK_OF_YEAR);
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
			offset++;
		}
		// Get end date
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, returnMonthNumber(B));
		cal.set(Calendar.YEAR, Y);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR_OF_DAY, cal.getActualMaximum(Calendar.HOUR_OF_DAY));
		cal.set(Calendar.MINUTE, cal.getActualMaximum(Calendar.MINUTE));
		cal.set(Calendar.SECOND, cal.getActualMaximum(Calendar.SECOND));
		cal.set(Calendar.MILLISECOND, cal.getActualMaximum(Calendar.MILLISECOND));
		endWeek = cal.get(Calendar.WEEK_OF_YEAR);
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			offset++;
		}
		return endWeek - startWeek + offset;

	}

	public int returnMonthNumber(String s) {
		switch (s) {
		case "January":
			return Calendar.JANUARY;
		case "February":
			return Calendar.FEBRUARY;
		case "March":
			return Calendar.MARCH;
		case "April":
			return Calendar.APRIL;
		case "May":
			return Calendar.MAY;
		case "June":
			return Calendar.JUNE;
		case "July":
			return Calendar.JULY;
		case "August":
			return Calendar.AUGUST;
		case "September":
			return Calendar.SEPTEMBER;
		case "October":
			return Calendar.OCTOBER;
		case "November":
			return Calendar.NOVEMBER;
		case "December":
			return Calendar.DECEMBER;
		default:
			return -1;
		}
	}
}
