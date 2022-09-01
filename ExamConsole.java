package Exam;
import java.util.Scanner;

public class ExamConsole {
	
	private ExamList list = new ExamList();
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("      │");
		System.out.println("      │   ┌──────────────┐");
		System.out.println("      └───┤   1. input   │");
		System.out.println("          └──────────────┘");

		int kor, eng, math;
		
		do {
			System.out.printf("국어성적 : ");
			kor = sc.nextInt();
			
			if(kor<0 || kor>100) {
				System.out.println("다시해!(0~100)");
			}			
		}while(kor<0 || kor>100);
		// 컨트롤 + 알트 + ↓
		do {
			System.out.printf("영어성적 : ");
			eng = sc.nextInt();
			
			if(eng<0 || eng>100) {
				System.out.println("다시해!(0~100)");
			}			
		}while(eng<0 || eng>100);
		
		do {
			System.out.printf("수학성적 : ");
			math = sc.nextInt();
			
			if(math<0 || math>100) {
				System.out.println("다시해!(0~100)");
			}			
		}while(math<0 || math>100);
		
		Exam e = new Exam(kor, eng, math);
		list.add(e);
		System.out.println("───────────────────────────────────────────────");
		System.out.println();
	}
	
	public void Print() {
		System.out.println("              │");
		System.out.println("      ┌───────┴────────┐");
		System.out.println("      │    2. print    │");
		System.out.println("      └────────────────┘");
		System.out.println("───────────────────────────────────────────────");
		int kor, eng, math;
		
		for(int i=0; i<list.size(); i++) {
			Exam e = list.get(i);
			kor = e.getKor();
			eng = e.getEng();
			math = e.getMath();
			
			int total = e.total();
			float avg = e.avg();
			
			System.out.printf("kor:%d  ", kor);
			System.out.printf("eng:%d  ", eng);
			System.out.printf("math:%d   ", math);
			System.out.printf("sum:%d", total);
			System.out.printf("   avg:%.2f \n", avg);
		}
		System.out.println("───────────────────────────────────────────────");
	}
	
	
	
}
