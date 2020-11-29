package differenceInDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class main {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1997, Month.AUGUST, 30); // age difference
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
//		System.out.println(p);
		System.out.printf("your age is %d years  %d Months  %d Days", p.getYears(), p.getMonths(), p.getDays());

		// timezone calculation
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		//timezone calculation of other timezone
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt= ZonedDateTime.now(la);
		System.out.println(zt.getHour());
		System.out.println(zt.getMinute());
	 
	}

}
