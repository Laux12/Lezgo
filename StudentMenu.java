import java.util.Scanner;

public class StudentMenu extends StudentsControl{
	private String command;

	public void studentMenu() {
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("\n\n\n=========================Student Menu=========================");
		System.out.println("Add Student (Format)->[add,student ID,Name,Address,Age]"
				+ "\nUpdate Student (Format)->[update,student ID,Name,Address,Age]"
				+ "\nDelete Student (Format)->[delete,student ID]"
				+ "\nSearch Student (Format)->[search,student ID]"
				+ "\nGet All Student (Format)->[all]"
				+ "\nEnroll Student	(Format) -> [enroll,student ID,Subject Code]"
				+ "\nGrade A Student (Format) -> [grade,student ID,Enrolled Subject Code,Grade"
				+ "\nExit(Main Menu) (Format) -> [exit]");
		System.out.println("==============================================================");
		System.out.println("Enter your Command: ");
		command = input.nextLine();
		this.setCommand(command);
		command = command.toUpperCase();
		}while(!command.equals("EXIT"));
		
		input.close();
	
	}
	
	
	
}
