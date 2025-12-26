package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * this is a generic method to generate calendar date  
	 * @param bound
	 * @return
	 */
public String getCalenderDetails(String pattern) {
	Calendar cal = Calendar.getInstance();
	Date d = cal.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	String value = sdf.format(d);
	return value;}
/**
 * this is a generic method to generate Random number 
 * @param bound
 * @return
 */
public int generateRandomNumber(int bound) {
	Random r= new Random();
	int num=r.nextInt(bound);
	return num;
}

}
