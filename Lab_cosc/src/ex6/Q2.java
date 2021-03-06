package ex6;

public class Q2 {
	public static void main(String[] args) {
		
		int days = numberOfDaysInAYear(0);
		int year = 0;
		
		for(int i = 2000; i<2011; i++) {
		if (isLeapYear(i)) {
			days = numberOfDaysInAYear(i);
			year = i;
		} else {
			year++;
		}
		
			System.out.printf("%d has %d days\n",year,days);
		days = 365;
		
		}
	}
	
	public static boolean isLeapYear(int year) {
		
		boolean leapYear = false;
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
		leapYear = true;
		}
		
		return leapYear;
	}
	
	public static int numberOfDaysInAYear(int year) {
		
		int days = 365; //not leapYear
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			 days = 366;
			}
		
		return days;
	}
	

}
