package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

public class DateCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sfd = new SimpleDateFormat("d/M/yyyy");
		System.out.println(sfd.format(d));
		System.out.println(d.toString());
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.SECOND));

	}

}
