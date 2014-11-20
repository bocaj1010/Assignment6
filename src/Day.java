

import java.util.Scanner;
public class Day {
	Scanner keyboard = new Scanner(System.in);
		
		private int day;
		private final String [] daysofweek = {"Sun", "mon", "tue", "wed", "thu", "fri", "sat"};
		
		
		public Day() {
			day = 0;
			
		System.out.println(daysofweek[day]);
		}
		
		public Day(int day) {
			this.day = day;
			System.out.println(daysofweek[day]);
		}
		
		
		
		 String calculateDayAdd() {
			if (day == 6)
				return daysofweek[0];
			return daysofweek[day + 1];
		}
	
		 
		 
		String calculateDaySub() {
			if (day == 0)
				return daysofweek[6];
			return daysofweek[day - 1];
			
		}


		String dayChange() {
			int change = 0;
			System.out.println("Enter number of days passed");
			change = keyboard.nextInt();


			if (change < 0 )
				change +=7;
			return daysofweek[(day + change) % 7];
		}


		
	    public void setDay (int day) {
	    	   this.day = day;
		   
	    	}	

		public String getDay() {
	    	   return (daysofweek[day]);
	    	


		
		
		}	
		
		
}
		
		
	
	


