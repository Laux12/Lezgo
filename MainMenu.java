import java.util.*;
public class MainMenu{
	//instantiate StudentMenu in static kay naka static ang method nga choice process
	static SubjectMenu subMenu = new SubjectMenu();
	static StudentMenu sMenu = new StudentMenu();
	
	//declare as static nga access modifiers para macall ang method 
	//bisag wala nag buhat og instance sa class
	public static void mainMenu(){
		//declare ang variable para sa choice sa user
		int choice;
		//exception Handling try and catch (kung naay error nga sa na input sa user)

		try {
			//declare ang scanner
		Scanner input = new Scanner(System.in);
		//choice or ang UI
		System.out.println("============================Main Menu=========================");
		System.out.println("[1]Student Menu\n[2]Subject Menu\n[0]Exit");
		System.out.println("==============================================================");
		//prompt ang user kung unsa ilang choice
		System.out.println("Enter Your Choice: ");
		choice = input.nextInt();
		//twagon ang choiceProccess nga method nga naa sa ubos
		choiceProcess(choice);
		//close ang scanner
		input.close();
		//catch ang error nga Inputmismatch(example dili integer ang gi input 
		//sa user tas dili sya dawaton sa choice nga variable kay integer ra ang iyang dawaton
		//mag print daun og invalid input tas mubalik sa mainmenu
		}catch(InputMismatchException e) {
			System.out.println("Invalid Input, Please Try Again!");
			MainMenu.mainMenu();
		}
		
	}
	static void choiceProcess(int choice) {
		switch(choice) {
		case 1: 
			sMenu.studentMenu();
			
			break;
		case 2:
			subMenu.subjectMenu();
			
			break;
		case 0:
			return;
		
		default:
			System.out.println("Invalid Choice, Try Again");
			MainMenu.mainMenu();;
				
		}
	}
	
}
