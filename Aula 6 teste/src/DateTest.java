
public class DateTest {
	public static void main(String[]args) {
		Date date1 = new Date(5,12,1999);
		Date date2 = new Date("May",12,1999);
		Date date3 = new Date(95,1999);
		
		
		date1.getDates();
		date2.getDates();
		date3.getDates();
	}

}
