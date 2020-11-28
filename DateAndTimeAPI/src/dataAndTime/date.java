package dataAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//for current date and time e.g system date and time
import java.time.Month;
public class date {

	public void showDate() {
		LocalDate date = LocalDate.now();
		System.out.println(date);
	}

	public void showTime() {
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
	
	public void showSeparateDate() {
		LocalDate date = LocalDate.now();
		int dayOfMonth = date.getDayOfMonth();
		 int month=date.getMonthValue();
		int year = date.getYear();
		System.out.printf("%d/%d/%d",dayOfMonth,month,year);
	}
	public void showSeparateTime() {
		LocalTime time = LocalTime.now();
		int hours = time.getHour();
		 int min=time.getMinute();
		int second = time.getSecond();
		System.out.printf("%d/%d/%d",hours,min,second);
	}
	
	public void bothDateAndTime() {
		LocalDateTime dt = LocalDateTime.now();
		int dayOfMonth = dt.getDayOfMonth();
		int monthValue = dt.getMonthValue();
		System.out.printf("%d,%d",dayOfMonth,monthValue);
	}
	
	

}
