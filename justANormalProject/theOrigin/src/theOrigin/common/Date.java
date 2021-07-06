package theOrigin.common;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Date {

	private int day;
	private int month;
	private int year;
	
	private int hour;
	private int minute;
	private int second;
	
	public Date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd/HH/mm/ss");  
		LocalDateTime now = LocalDateTime.now();  
		String[] s = dtf.format(now).split("/");  
		this.year = Integer.parseInt(s[0]);
		this.month = Integer.parseInt(s[1]);
		this.day = Integer.parseInt(s[2]);
		this.hour = Integer.parseInt(s[3]);
		this.minute = Integer.parseInt(s[4]);
		this.second = Integer.parseInt(s[5]);
	}
	
	@Override
	public String toString() {
		return (this.day + "/" + this.month + "/" + this.year + " " + this.hour + ":" + this.minute + ":" + this.second);
	}

}
