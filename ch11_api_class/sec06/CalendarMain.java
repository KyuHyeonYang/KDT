package ch11_api_class.sec06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week=now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek=null;
		
		switch(week){
		case Calendar.MONDAY:strWeek="월"; break;
		case Calendar.TUESDAY:strWeek="화"; break;
		case Calendar.WEDNESDAY:strWeek="수"; break;
		case Calendar.THURSDAY:strWeek="목"; break;
		case Calendar.FRIDAY:strWeek="금"; break;
		default:strWeek="일";
		
		}
		int amPm=now.get(Calendar.AM_PM);
		String strAmPm=null;
		if(amPm==Calendar.AM) {
			strAmPm="오전";
			
		}else {
			strAmPm="오후";
		}
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		
		System.out.print(year+"년");
		System.out.print(month+"월");
		System.out.print(day+"일");
		System.out.println(strWeek+"요일");
		System.out.print(strAmPm+"");
		System.out.print(hour+"시");
		System.out.print(minute+"분");
		System.out.print(second+"초");
		System.out.println("\n-------------------");
		LocalDateTime n=LocalDateTime.now();
		System.out.println(n.getYear()+"년"+n.getMonth()+"월"+n.getDayOfMonth()+"일");
		
	}

}
