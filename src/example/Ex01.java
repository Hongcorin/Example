package example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<String> schedule = new ArrayList<>(5);
		final int count = 5;
		
		Scanner scanner = new Scanner(System.in);
		String newSchedule;
		
		for(int i = 1; i < count; i++) {
			System.out.print("일정을 등록 하세요");
			newSchedule = scanner.nextLine();
			schedule.add(newSchedule);
		}
		
		
		System.out.println("==========");
		
		for(String s : schedule) {
			System.out.println(s);
		}
		System.out.println("==========");

		
	}
		
}

