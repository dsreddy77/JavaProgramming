package core.java.iostreams;

//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalender {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		//SimpleDateFormat s = new SimpleDateFormat();
		//System.out.println(s.getTimeZone());
		
		Calendar calendar = Calendar.getInstance();
		int hr = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int secs = calendar.get(Calendar.SECOND);
		
		System.out.println(hr+":"+min+":"+secs);
	}

}
