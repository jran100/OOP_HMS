package healthManagementSystem;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		int menuNum = 0;
		Scanner input = new Scanner(System.in);
		
		while(menuNum != 6) {
			System.out.print(
				"1. Add\n"
				+ "2. Delete\n"
				+ "3. Edit\n"
				+ "4. View\n"
				+ "5. Show menu\n"
				+ "6. Exit\n"
				+ ">> ");
			menuNum = input.nextInt();
		}
	}
}
