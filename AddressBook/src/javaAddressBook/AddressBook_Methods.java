package javaAddressBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook_Methods {

	List<AddressEntry> bookEntries = new ArrayList<>();
	
	/* Option 1 */
	
	public void addToBook(AddressEntry newEntry) {
		bookEntries.add(newEntry);
		System.out.println("New Entry was added!");
	}
	
	
	/* Option 2 */
	
	public void removeEntry(String email) {
		System.out.println("Please enter the email of the entry you'd like to remove:");
		for(int i = 0; i<bookEntries.size(); i++) {
			AddressEntry lookUp = bookEntries.get(i);
			if(lookUp.getEmail().equals(email)) {
				bookEntries.remove(i);
			}
		}
		return;
	}
	
	/* Option 3 */
	
	public AddressEntry searchByFirstName(String firstName) {
		for (int i = 0; i<bookEntries.size(); i++) {
			AddressEntry search1stName = bookEntries.get(i);
			if (search1stName.getFirstName().equals(firstName)) {
				System.out.println(search1stName);
			}
		}
		return null;
	}
	
	public AddressEntry searchByLastName(String lastName) {
		for (int i = 0; i<bookEntries.size(); i++) {
			AddressEntry searchLastName = bookEntries.get(i);
			if (searchLastName.getFirstName().equals(lastName)) {
				System.out.println(searchLastName);
			}
		}
		return null;
	}
	
	public AddressEntry searchByPhoneNumber(String phoneNumber) {
		for (int i = 0; i<bookEntries.size(); i++) {
			AddressEntry searchPhoneNumber = bookEntries.get(i);
			if (searchPhoneNumber.getFirstName().equals(phoneNumber)) {
				System.out.println(searchPhoneNumber);
			}
		}
		return null;
	}
	
	public AddressEntry searchByEmail(String email) {
		for (int i = 0; i<bookEntries.size(); i++) {
			AddressEntry searchByEmail = bookEntries.get(i);
			if (searchByEmail.getEmail().equals(email)) {
				System.out.println(searchByEmail);
			}
		}
		return null;
	}
	
	/* Option 4 */
	
	
		 public void printAddressBook() {
			for(AddressEntry i : bookEntries) {
				System.out.println(i);
			}
			
		}
		 
	/* Option 5 */
	
	public void deleteBook() {
		System.out.println("Address book deleted!");
	}
}
