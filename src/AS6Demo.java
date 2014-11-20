



import java.util.Scanner;
public class AS6Demo {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		
		
		Day d = new Day();
		Day d2 = new Day(3);
		
		
		System.out.println(d.dayChange());
		
		System.out.println(d.calculateDaySub());
		System.out.println(d.calculateDayAdd());

		d.setDay(5);
		System.out.println(d.getDay());

		
		
		
		
	}

}
