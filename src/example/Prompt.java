package example;

import java.text.ParseException;
import java.util.*;

public class Prompt {
	
public void printMenu()	{
		
		System.out.println("= = = = = = = = = = = =");
		System.out.println(": 1. 일정 등록");
		System.out.println(": 2. 일정 검색");
		System.out.println(": 3. 달력 보기 ");
		System.out.println(": h. 도움말 q. 종료");
		System.out.println("= = = = = = = = = = = =");
		System.out.println("명령 (1, 2, 3, h, q)");
	}
	
	/**
	 * 
	 * @param week 요일명
	 * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
	 */
	public int parseDay(String week) {
		if (week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else
			return 0;		
	}

	public void runPrompt() throws ParseException {
		printMenu();
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while (true) {
			
			String cmd = scanner.next();
			
			if(cmd.equals("1")) {
				cmdRegister(scanner, cal);
			}
			else if(cmd.equals("2")) {
				cmdSearch(scanner, cal);
			}
			else if(cmd.equals("3")) {
				cmdCalendar(scanner, cal);
			}
			else if(cmd.equals("h")) {
				cmdMenu();
			}
			else if(cmd.equals("q")) {
				break;	
			}
			System.out.println("Bye~");
			scanner.close();
		}

		System.out.println("Thank you Bye~");
		scanner.close();
	}

	private void cmdMenu() {
		// TODO Auto-generated method stub
		
	}

	private void cmdCalendar(Scanner scanner, Calendar c) {
		
		int year = 2022;
		int month = 0;
		
		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		year = scanner.nextInt();
		
		System.out.println("달을 입력하세요.");
		System.out.print("MONTH> ");
		month = scanner.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}

		c.printCalendar(year, month);
	}


	private void cmdSearch(Scanner s, Calendar c) {
		System.out.println("일정 검색");
		System.out.println("날짜를 입력 하세요(yyyy-mm-dd)");
		String date = s.next();
		String plan = "";
		try {
			plan = c.searchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("일정 검색 중 오류 발생");
		}
		System.out.println(plan);
		
	}

	private void cmdRegister(Scanner s, Calendar c) throws ParseException {
        System.out.println("[새 일정 등록]");
        System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd).");
        String date = s.next();
        String text = "";
        s.nextLine(); //ignore one newline
        System.out.println("일정을 입력해 주세요.");
        text = s.nextLine();

        c.registerplan(date, text);
    }

	public static void main(String[] args) throws ParseException {
		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}