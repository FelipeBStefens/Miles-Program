package exercise105;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProgramMiles {

	public static ArrayList<String> name = new ArrayList<String>();
	public static ArrayList<String> cpf = new ArrayList<String>();
	public static ArrayList<Integer> mile = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("Welcome to program miles:");
			System.out.println("1 - Register an user;\n2 - List all the miles;\n3 - Show the names with the biggest and smallest mile;"
					+ "\n4 - Show all the users;\n5 - Atualizate the register;\n6 - Leave the program");
			System.out.println("------------------------------------------------------------------------------------------");
			int menuValue = scanner.nextInt();
			
			if (menuValue == 1) {
				
				System.out.println("Type the name:");
				String nameValue = scanner.next();
				name.add(nameValue);
				
				System.out.println("Type the CPF:");
				String cpfValue = scanner.next();
				for (int i = 0; i < cpf.size(); i++) {
					while (cpfValue.equals(cpf.get(i))) {
						System.out.println("This cpf already exists, put another...");
						cpfValue = scanner.next();
					}	
				}
				cpf.add(cpfValue);
				
				System.out.println("Type the mile:");
				int mileValue = scanner.nextInt();
				mile.add(mileValue);
			}
			
			else if (menuValue == 2) {
				System.out.println("The miles are:");
				for (int i = 0; i < mile.size(); i++) {
					System.out.println(mile.get(i));
				}
			}
			
			else if (menuValue == 3) {
				int biggestIndex = mile.indexOf(Collections.max(mile));
				int smallestIndex = mile.indexOf(Collections.min(mile));
				System.out.printf("Biggest mile: %d; Name: %s%nSmallest value: %d; Name:%s%n", Collections.max(mile), name.get(biggestIndex),
						Collections.min(mile), name.get(smallestIndex));
			}
			
			else if (menuValue == 4) {
				System.out.println("The users are:");
				for (int i = 0; i < name.size(); i++) {
					System.out.println(name.get(i));
				}
			}
			
			else if (menuValue == 5) {
				
				System.out.println("What's the ordinal number of the contact you want to atualizate?");
				int indexValue = scanner.nextInt() - 1;
				while (indexValue < 0 || indexValue > name.size()) {
					System.out.println("Invalid value, try again...");
					indexValue = scanner.nextInt() - 1;
				}
				
				System.out.println("Type the name:");
				String nameValue = scanner.next();
				name.set(indexValue, nameValue); 
				
				System.out.println("Type the CPF:");
				String cpfValue = scanner.next();
				for (int i = 0; i < cpf.size(); i++) {
					while (cpfValue.equals(cpf.get(i))) {
						System.out.println("This cpf already exists, put another...");
						cpfValue = scanner.next();
					}	
				}
				cpf.set(indexValue, cpfValue);
				
				System.out.println("Type the mile:");
				int mileValue = scanner.nextInt();
				mile.set(indexValue, mileValue); 
				
			}
			
			else if (menuValue == 6) {
				break;
			}
			
			else {
				System.out.println("Invalid value...");
			}
		}
		
		scanner.close();
	}
}
