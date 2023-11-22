import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddressBook {
    private Map<String, String> contacts;
    public AddressBook(){
        contacts = new HashMap<>();
    }
    public void addContact(String name, String phoneNumber){
        contacts.put(name,phoneNumber);
    }
    public void removeContact(String name){
        contacts.remove(name);
    }
    public void searchContacts(String name){
        if(contacts.containsKey(name)){
            System.out.println("Phonenumber : " + contacts.get(name));
        }
        else{
            System.out.println("Contact not Found.");
        }
    }
    public void displayContacts(){
        if (contacts.isEmpty()){
            System.out.println("Address book is empty.");
        }
        else{
            System.out.println("Contacts :");
                for(String name : contacts.keySet()){
                    System.out.println(name + ":" + contacts.get(name));
                }
            }
        }
        public static void main(String args[]){
            AddressBook addressBook = new AddressBook();
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("\nAddress Book Menu:");
                System.out.println("1.Add Contact");
                System.out.println("2.Remove Contact");
                System.out.println("3.Search Contact");
                System.out.println("4.Display contact");
                System.out.println("5.Exit");
                System.out.println("Enter your choice:");
                int choice = scanner.nextInt();
                scanner.nextLine();//consume newLine character
                switch(choice){
                    case 1 : System.out.print("Enter name:");
                             String name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                             String phoneNumber = scanner.nextLine();
                             addressBook.addContact(name,phoneNumber);
                             break;
                    case 2 : System.out.println("Enter name:");
                             String removeName = scanner.nextLine();
                             addressBook.removeContact(removeName);
                             break;
                    case 3 : System.out.println("Enter name:");
                             String searchName = scanner.nextLine();
                             addressBook.searchContacts(searchName);
                             break;
                    case 4 : 
                             addressBook.displayContacts();
                             break;
                    case 5 : System.out.println("Existing....");
                             System.exit(0);
                             default:
                             System.out.println("Invalid choice.Please try again.");
                }
            }
        }
}               