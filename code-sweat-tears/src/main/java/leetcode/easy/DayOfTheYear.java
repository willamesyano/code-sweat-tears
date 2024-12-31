package leetcode.easy;

public class DayOfTheYear {

	public static void main(String[] args) {
		DayOfTheYear dayOfTheYear = new DayOfTheYear();
//		System.out.println(dayOfTheYear.dayOfYear("2019-01-09"));
//		System.out.println(dayOfTheYear.dayOfYear("2019-02-10"));
		System.out.println(dayOfTheYear.dayOfYear("2016-02-09"));
	}
	
	public int dayOfYear(String date) {
		
		String[] dateArray = date.split("-");
		
		int day = Integer.parseInt(dateArray[2]);
		int month = Integer.parseInt(dateArray[1]);
		int year = Integer.parseInt(dateArray[0]);
		
		if(month == 1) {
			return day;
		}
		
		int counter = 0;
		for(int i = 1; i < month; i++) {
			if(i == 1 || i == 3 ||  i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				counter += 31;
			} else if(i == 2) {
				if((year%4==0) && ((year%100!=0) || (year%400==0))){ //leap year
					counter += 29;
		        }else {
		        	counter += 28;
		        }
			}else {
				counter += 30;
			}
		}
		
		return counter + day;
    }
}
