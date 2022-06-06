package example;

import java.util.*;

public class SearchCalendar {
	
	static int date;
	ArrayList<String> schedule = new ArrayList<String>();
	
public void printMenu()	{
		
		System.out.println("= = = = = = = = = = = =");
		System.out.println(": 1. 일정 등록");
		System.out.println(": 2. 일정 검색");
		System.out.println(": 3. 달력 보기 ");
		System.out.println(": h. 도움말 q. 종료");
		System.out.println("= = = = = = = = = = = =");
		System.out.println("명령 (1, 2, 3, h, q)");
	}
	
public void runPrompt() {
	
	printMenu();
	
	Scanner scanner = new Scanner(System.in);
	Calendar cal = new Calendar();
	
	System.out.print("> ");

	while (true) {
		String cmd = scanner.next();
		
		if(cmd.equals("1")) {
			cmdRegister();
			System.out.println("명령 (1, 2, 3, h, q)");
		}
		else if(cmd.equals("2")) {
			cmdSearch();
		}
		else if(cmd.equals("3")) {
			cmdCalendar(scanner, cal);
		}
		else if(cmd.equals("h")) {
			cmdMenu();
		}
		else if(cmd.equals("q")) {
			System.out.println("Bye~");
			break;
			
		}
		
		scanner.close();
	}
}

	private static void cmdMenu() {
		
		System.out.println("= = = = = = = = = = = =");
		System.out.println(": 1. 일정 등록");
		System.out.println(": 2. 일정 검색");
		System.out.println(": 3. 달력 보기 ");
		System.out.println(": h. 도움말 q. 종료");
		System.out.println("= = = = = = = = = = = =");
	}

	private void cmdCalendar(Scanner s, Calendar c) {
		
		int month = 1;
		int year = 2022;
		System.out.println("년도를 입력하세요");
		System.out.print("YEAR> ");
		year = s.nextInt();
		
		System.out.println("달을 입력하세요");
		System.out.print("MONTH> ");
		month = s.nextInt();
		
		if(month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		c.printCalendar(year, month);
	
	}

	private void cmdSearch() {
		System.out.println("[일정 검색] 날짜를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		System.out.print("> ");
		int searchDate = scanner.nextInt();
	
		if(searchDate == date) {
			System.out.printf("%d개의 일정이 있습니다",schedule.size());
		}
	}

	private void cmdRegister() {
		
		System.out.println("[일정 등록] 날짜를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		System.out.print("> ");
		date = scanner.nextInt();

		System.out.print("일정을 입력하세요\n> ");
		String newSchedule = scanner.nextLine();
		
		schedule.add(scanner.nextLine());

		System.out.println("일정이 등록 되었습니다 :) \n");
		
		scanner.close();
	
	
	}	public static void main(String[] args) {
		// 셸 실행
		SearchCalendar sc = new SearchCalendar();
		sc.runPrompt();
	}

}
