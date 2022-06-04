package example;

import java.util.*;

public class Prompt {
	
	
//	param week 요일명
//	return 0 ~ 6 (0 == Sunday, 6 == Saturday)
	
	public int parseDay(String week) {
		
		if(week.equals("su")) {
			return 0;
		}
		else if(week.equals("mo")) {
			return 1;
		}
		else if(week.equals("tu")) {
			return 2;
		}
		else if(week.equals("we")) {
			return 3;
		}
		else if(week.equals("th")) {
			return 4;
		}
		else if(week.equals("fr")) {
			return 5;
		}
		else if(week.equals("sa")) {
			return 6;
		}
		else {
			return 0;
		}
	}
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt()	{
		

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 2022;
		int weekday = 0;
		
		while (true) {
			System.out.println("년도를 입력하세요!");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요!");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요!");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
				
			}
			cal.printCalendar(year, month,weekday);
		}
		System.out.println("BYE!");
		scanner.close();
		
	}


	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();

	}

}
