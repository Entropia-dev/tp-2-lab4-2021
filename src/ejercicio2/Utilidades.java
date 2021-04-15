package ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
public class Utilidades {
	
	public static String calendarToDefaultString(Calendar calendar)
	{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
		simpleDateFormat.format(calendar.getTime());
		return simpleDateFormat.format(calendar.getTime());
	}
	
	public static Calendar buildCalendar(int year, int month, int date)
	{
		 Calendar calendar = Calendar.getInstance();
		 calendar.set(year, month, date);
		 return calendar;
	}
}
