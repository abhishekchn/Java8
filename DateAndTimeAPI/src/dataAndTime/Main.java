package dataAndTime;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		date date = new date();
//		date.showDate();
//		date.showTime();
//		date.showSeparateDate();
//		date.showSeparateTime();
//		date.bothDateAndTime();
		LocalDateTime ldt = LocalDateTime.of(1995,Month.OCTOBER,02,02,05,10);
//		System.out.println(ldt);
//		System.out.println(ldt.getMonthValue());
//		System.out.println(ldt.getDayOfWeek());
//		System.out.println(ldt.getDayOfYear());
//		System.out.printf("After Six months: " + ldt.plusMonths(6));
		int i = ldt.getDayOfMonth();
        int j = i+55;
        System.out.println(j);
	}

}
