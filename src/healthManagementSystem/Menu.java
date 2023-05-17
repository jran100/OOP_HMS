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
			
			if(menuNum==1) {
				addStudent();
			}
			else if(menuNum==2) {
				deleteStudent();
			}
			else if(menuNum==3) {
				editStudent();
			}
			else if(menuNum==4) {
				viewStudent();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID: ");
		int studentId=input.nextInt();
		
		System.out.print("Student Name: ");
		String studentName=input.next();
		
		System.out.print("Student Email: ");
		String studentEmail=input.next();
		
		System.out.print("Student PhoneNumber: ");
		int studentPhone=input.nextInt();
	}
	
	public static void deleteStudent() {}
	public static void editStudent() {}
	public static void viewStudent() {}
}
