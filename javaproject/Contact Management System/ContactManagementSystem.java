package javaproject;
import java.util.*;

public class ContactManagementSystem {
    private ArrayList<contact> contactList = new ArrayList<>();
    private Scanner s = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = s.nextLine();
        System.out.print("Enter email: ");
        String email = s.nextLine();

        contact newContact = new contact(name, phoneNumber, email);
        contactList.add(newContact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contact List:");
            for (contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }

    public void updateContact() {
        System.out.print("Enter the name of the contact to update: ");
        String name = s.nextLine();
        contact contactToUpdate = findContactByName(name);

        if (contactToUpdate != null) {
            System.out.print("Enter new phone number: ");
            String phoneNumber = s.nextLine();
            System.out.print("Enter new email: ");
            String email = s.nextLine();

            contactToUpdate.setPhoneNumber(phoneNumber);
            contactToUpdate.setEmail(email);
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact() {
        System.out.print("Enter the name of the contact to delete: ");
        String name = s.nextLine();
        contact contactToDelete = findContactByName(name);

        if (contactToDelete != null) {
            contactList.remove(contactToDelete);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private contact findContactByName(String name) {
        for (contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void menu() {
        while (true) {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(s.nextLine());
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ContactManagementSystem manager = new ContactManagementSystem();
        manager.menu();
    }
}
