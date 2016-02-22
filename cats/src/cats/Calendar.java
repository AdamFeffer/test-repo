package cats;
import java.util.*;
public class Calendar {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter year: (e.g., 2008): ");
		int year = input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print(DOW(month, year));	
	}
	public static String DOW(int month, int year){
		if (month == 1) {
			month = 13;
			year--;
		}
		else if (month == 2) {
			month = 14;
			year--;
		}
		
		int m = month;
		
		int j = year / 100;
		
		int k = year % 100;
		
		int h = (1 + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		String currentDay = "";
		
		switch (h) {
		case 0: 
			//SATURDAY
			currentDay = "Saturday";
			break;
		case 1:
			currentDay = "Sunday";
			break;
		case 2:
			currentDay = "Monday";
			break;
		case 3:
			currentDay = "Tuesday";
			break;
		case 4:
			currentDay = "Wendsday";
			break;
		case 5:
			currentDay = "Thursday";
			break;
		case 6: 
			currentDay = "Friday";
		
		}
		return currentDay; 
	}
	public static int dim(int month, int year){
		int hdim = 0;
		switch (month){		
		case 1:
			hdim = 31;
			break;
		case 2:
			hdim = 28;
			if (year % 400 == 0 && year % 100 != 0){
				hdim++;
			}
			break;
		case 3:
			hdim = 31;
			break;		
		case 4:
			hdim = 30;
			break;
		case 5:
			hdim = 31;
			break;
		case 6:
			hdim = 30;
			break;
		case 7:
			hdim = 31;
			break;
		case 8:
			hdim = 31;
			break;
		case 9:
			hdim = 30;
			break;
		case 10:
			hdim = 31;
			break;
		case 11:
			hdim = 30;
			break;
		case 12:
			hdim = 31;
			break;
	}
		return hdim;		
}
}
