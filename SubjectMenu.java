import java.util.Scanner;

public class SubjectMenu extends SubjectControl{
	private String command;

	public void subjectMenu() {
		Scanner input = new Scanner(System.in);
		do {
		
		System.out.println("\n\n\n=========================Student Menu=========================");
		System.out.println("Add Subject (Format)->[add,IT123,Subject Name]"
				+ "\nUpdate Subject (Format)->[update,Subject Code,Subject Name]"
				+ "\nDelete Subject (Format)->[delete,Subject Code]"
				+ "\nSearch Subject (Format)->[search,Subject Code]"
				+ "\nGet All Subject (Format)->[all]"
				+ "\nExit (Format) -> [exit]");
		System.out.println("==============================================================");
		System.out.println("Enter your Command: ");
		command = input.nextLine();
		this.setCommand(command);
		command = command.toUpperCase();
		}while(!command.equals("EXIT"));
		
		input.close();
	
	}
	
}	
