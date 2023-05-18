package healthManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentManager studentM = new StudentManager(input);
		int menuNum = 0;
		
		while(menuNum != 5) {
			System.out.print(
				"---\n"
				+"1. Add\n"
				+ "2. Delete\n"
				+ "3. Edit\n"
				+ "4. View\n"
				+ "5. Exit\n"
				+ ">> ");
			menuNum = input.nextInt();
			
			if(menuNum==1) {
				studentM.addStudent();
			}
			else if(menuNum==2) {
				studentM.deleteStudent();
			}
			else if(menuNum==3) {
				studentM.editStudent();
			}
			else if(menuNum==4) {
				studentM.viewStudent();
			}
			else {
				continue;
			}
		}
	}

}
