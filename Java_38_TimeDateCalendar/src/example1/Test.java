package example1;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		//CurrentTimeMillis:
		long t1 = System.currentTimeMillis();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Test!!!");
		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Truoc khi chay for: " +t1);
		System.out.println("Sau khi chay for: " +t2);
		System.out.println("Thoi gian: " +(t2-t1)+ " mls");
		System.out.println("Thoi gian: " +((t2-t1)/100)+ " s");
		
		//TimeUnit:
		System.out.println("3000 years = " +TimeUnit.DAYS.toSeconds(3000*365)+ " s");
		System.out.println("25 h = " +TimeUnit.HOURS.toSeconds(25)+ " s");
		
		//Date:
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate()+ "/" +(d.getMonth()+1) + "/" +(d.getYear()+1900));
		
		//Calendar:
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)+ "-" +(c.get(Calendar.MONTH)+1)+ "-" +c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 30);
		System.out.println(c.get(Calendar.DATE)+ "-" +(c.get(Calendar.MONTH)+1)+ "-" +c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 14);
		System.out.println(c.get(Calendar.DATE)+ "-" +(c.get(Calendar.MONTH)+1)+ "-" +c.get(Calendar.YEAR));
	
		//DateFormat:
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(d));
	}
}
