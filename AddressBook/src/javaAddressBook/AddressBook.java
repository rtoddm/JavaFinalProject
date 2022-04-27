package javaAddressBook;

import java.util.Scanner;

public class AddressBook {

	
/* Main Method */
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		AddressBook_Methods myNewBook = new AddressBook_Methods();
		String choice;
		do {
		
			System.out.println("1. Add an entry\n2. Remove an entry\n3. Search\n"
					+ "4. Print Address Book\n5. Delete\n6. Quit Program");
			System.out.println("Please, choose what you'd like to do.");
			
			choice = input.nextLine();
			
			
			if(choice.equals("1")) {
				AddressEntry entry = AddressEntry.addressFromInput(input);
				myNewBook.addToBook(entry);
			
			}else if (choice.equals("2")) {
				System.out.println("What email would you like to remove?");
				String remove = input.nextLine();
				myNewBook.removeEntry(remove);
			
			}else if (choice.equals("3")) { 
				System.out.println("1) First Name\n 2)Last Name\n 3)Phone Number\n 4) Email");
				System.out.println("Please Choose what to search (1-4):");
				String nestedChoice = input.nextLine();
				if(nestedChoice.equals("1")) {
					System.out.println("Please enter a first name");
					String firstName = input.nextLine();
					myNewBook.searchByFirstName(firstName);
				}else if(nestedChoice.equals ("2")) {
					System.out.println("Please enter a last name");
					String lastName = input.nextLine();
					myNewBook.searchByLastName(lastName);
				}else if(nestedChoice.equals ("3")) {
					System.out.println("Please enter a phone number");
					String phoneNumber = input.nextLine();
					myNewBook.searchByLastName(phoneNumber);
				}else if(nestedChoice.equals ("4")) {
					System.out.println("Please enter an email");
					String email = input.nextLine();
					myNewBook.searchByLastName(email);
				}else {
					System.out.println("Please pick a valid option (1-4)");
				}
			}else if (choice.equals("4")) {
				myNewBook.printAddressBook();
			
			}else if (choice.equals("5")) {
				myNewBook.deleteBook();
			}
		}	
		while (!choice.equals("6")); 
		
	}
}

	

