package Exam;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		ExamConsole list = new ExamConsole();
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop) {
			menu = mainMenu();
			
			switch(menu) {
				case 1 :
					list.input();
					break;
				case 2 :
					list.Print();
					break;
				case 3 :
					end();
					keepLoop = false;
					break;
				default :
					System.out.println("!1~3");
			}			
		}
	}

	private static int mainMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("弛            main menu            弛");
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
		System.out.print("input(1)  Print(2)  Exit(3)");
		
		return sc.nextInt();
	}
	
	private static void end() {
		System.out.println(" 忙式式式式式式式式式式式式式式式式式式式式式戎");
		System.out.println(" 戌式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("     忙式式式式式式式式式式式式式式式式式式式式戎");
		System.out.println("     戌式式式式式式式式式式式式式式式式忖");
		System.out.println("         忙式式式式式式式式式式式式戎");
		System.out.println("         戌式式式式式式式式式忖");
		System.out.println("            忙式式式式式式戎");
		System.out.println("            戌式式式忖");
		System.out.println("             忙式式戎");
		System.out.println("             戌式 byebye~~");
	}
}
