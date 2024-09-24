package phonecontact;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;


public class TestContact {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("123-456-7890");
        numbers.add("987-654-3210");
        Contact Vlad = new Contact("Влад", LocalDate.of(2004, 10, 6), numbers);
        Contact Stas = new Contact("Стас", LocalDate.of(1994, 9, 17), numbers);
        Contact Masha = new Contact("Маша", LocalDate.of(2004, 10, 6), numbers);
        Contact Maxim = new Contact("Максим", LocalDate.of(2001, 12, 26), numbers);
        Contact Angelina = new Contact("Ангелина", LocalDate.of(2001, 9, 26), numbers);
        PhoneContact phoneBook = new PhoneContact();

        phoneBook.addContact(Vlad);
        phoneBook.addContact(Stas);
        phoneBook.addContact(Masha);
        phoneBook.addContact(Maxim);
        phoneBook.addContact(Angelina);

//        System.out.println(phoneBook.searchByName("Стас"));
//        System.out.println(phoneBook.sortContact());
//        System.out.println(phoneBook.sortContactPerDate());
        System.out.println(phoneBook.firstBirthday());
        System.out.println(phoneBook.firstBirthdayV2());

    }

}
