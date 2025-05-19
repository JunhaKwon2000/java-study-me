package pkg_homework;

import java.util.Arrays;

public class Homework07 {
	public static void main(String[] args) {
		
		String[] report = {"Introduction", "Research", "Conclusion"};
		String[] reportCopy = Arrays.copyOf(report, report.length);
		reportCopy[0] = "Team Feedback";
		
		System.out.print("원본 보고서: ");
		for (int i = 0; i < report.length; i++) {
			System.out.print(report[i]);
			if (i != report.length - 1) System.out.print(", ");
		}
		
		System.out.println();
		
		System.out.print("복사된 보고서: ");
		for (int i = 0; i < reportCopy.length; i++) {
			System.out.print(reportCopy[i]);
			if (i != reportCopy.length - 1) System.out.print(", ");
		}
		
		
		
	}
}
