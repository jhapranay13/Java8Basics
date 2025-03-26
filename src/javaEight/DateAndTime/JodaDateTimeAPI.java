package javaEight.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaDateTimeAPI {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		int dm = ld.getDayOfMonth();
		//similarly can get Month and year value
		System.out.println( dm );
		System.out.println( ld );
		LocalTime lt = LocalTime.now();
		//similarly can get minute second nanao
		int hour = lt.getHour();
		System.out.println( hour );
		System.out.println( lt );

		LocalDateTime dtTim = LocalDateTime.now();
		System.out.println( dtTim );
		
		LocalDateTime bd = LocalDateTime.of(1981, 8, 13, 0, 0, 0);
		System.out.println( bd );
		System.out.println( bd.minusMonths(3) );
		
		Period p = Period.between(ld, bd.toLocalDate());
		System.out.println( p );
		
		Year y = Year.of( 1947 );
		System.out.println( y.isLeap() );
		
		ZoneId zId = ZoneId.systemDefault();
		System.out.println( zId );
		
		ZoneId czId = ZoneId.of("America/Los_Angeles");
		System.out.println( czId );
		ZonedDateTime zdt = ZonedDateTime.now( czId );
		System.out.println( zdt );
	}

}
