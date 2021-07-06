package theOrigin.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {

	public static void main(String[] args) throws Exception {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd/HH/mm/ss");  
		LocalDateTime now = LocalDateTime.now();  
		String s = dtf.format(now);
		System.out.print(s);
	    
	    
	}

}
