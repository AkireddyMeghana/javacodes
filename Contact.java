import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    public static <contacts> void main(String[] args) {
        double phNum;
        String name;
        ArrayList<PhoneBook> contacts = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook(7890, "rani");
        contacts.add(phoneBook);
        for (PhoneBook p : contacts) {
            System.out.println(p.getPhn() + "    " + p.getContactnames());

        }
        System.out.println("" +
                "" +
                "" +
                "");
        System.out.println(" after adding");
        contacts.add(new PhoneBook(1234, "meghana"));
        contacts.add(new PhoneBook(9866, "suppu"));
        contacts.add(new PhoneBook(4309, "srija"));
        contacts.add(new PhoneBook(1675, "prashu"));
        contacts.add(new PhoneBook(4575, "lucky"));
        for (PhoneBook p : contacts) {
            System.out.println(p.getPhn() + "    " + p.getContactnames());


        }
        System.out.println("enter the contact to remove");
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();

        for (PhoneBook p1 : contacts) {
            if (p1.getPhn() == l) {



            } else {
                System.out.println(p1);

            }
        }
        System.out.println("enter contact to view");

        long l1 = scanner.nextLong();

        for (PhoneBook p1 : contacts) {
            if (p1.getPhn() == l1) {
                System.out.println("have contact");
                System.out.println(l1);




            }
        }


        }

    }





