package phonecontact;


import org.junit.jupiter.api.*;

import java.time.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


class PhoneContactTest {
//    @Test
//    public void addContactTest() {
//        // given
//        Contact contact = new Contact("Stas", LocalDate.of(1994, 10, 28), List.of("79175704071"));
//
//        // when
//        PhoneContact phoneContact = new PhoneContact();
//        phoneContact.addContact(contact);
//
//        // then
//        assertEquals(1, phoneContact.getContacts().size());
//        assertEquals(contact, phoneContact.searchByName("Stas"));
//    }
//
//    @Test
//    void changeContactName() {
//        // given
//        Contact contact = new Contact("Stas", LocalDate.of(1994, 10, 28), List.of("79175704071"));
//
//        // when
//        PhoneContact phoneContact = new PhoneContact();
//        phoneContact.addContact(contact);
//
//        String newName = "Stanislav";
//        phoneContact.changeContactInfo("Stas", newName, contact.getBirthdaydate());
//
//        // then
//        assertEquals(newName, phoneContact.searchByName("Stanislav").getName());
//        assertNotNull(phoneContact.searchByName("Stanislav"));
//        assertNull(phoneContact.searchByName("Stas"));
//    }
//
//    @Test
//    void changeContactBirthday() {
//        // given
//        Contact contact = new Contact("Stas", LocalDate.of(1994, 10, 28), List.of("79175704071"));
//
//        // when
//        PhoneContact phoneContact = new PhoneContact();
//        phoneContact.addContact(contact);
//
//        LocalDate newBirthday = LocalDate.of(1995, 10, 28);
//        phoneContact.changeContactInfo("Stas", contact.getName(), newBirthday);
//
//        // then
//        assertEquals(newBirthday, phoneContact.searchByName("Stas").getBirthdaydate());
//    }
//
//    @Test
//    void markFavourite() {
//        // given
//        Contact contact = new Contact("Stas", LocalDate.of(1994, 10, 28), List.of("79175704071"));
//
//        // when
//        PhoneContact phoneContact = new PhoneContact();
//        phoneContact.addContact(contact);
//
//        // then
//        assertFalse(phoneContact.searchByName("Stas").isFavourite());
//        phoneContact.makeFavourite("Stas");
//        assertTrue(phoneContact.searchByName("Stas").isFavourite());
//
//        phoneContact.deleteFavourite("Stas");
//        assertFalse(phoneContact.searchByName("Stas").isFavourite());
//    }

    @Test

    void mainContact() {
        //given
        Contact contact = new Contact("Stas", LocalDate.of(1994, 10, 28), List.of("79175704071"));
        //when
        PhoneContact phoneContact = new PhoneContact();
        phoneContact.addContact(contact);
        //then
        assertFalse(phoneContact.searchByName("Stas").isFavourite());
        phoneContact.MainContact("Stas");
        assertTrue(phoneContact.searchByName("Stas").isFavourite());

        phoneContact.deleteMainContact("Stas");
        assertFalse(phoneContact.searchByName("Stas").isFavourite());

    }

    @Test

    void firstbirthday() {
        Contact Vlad = new Contact("Влад", LocalDate.of(2004, 10, 6), List.of("79175704071"));
        Contact Masha = new Contact("Маша", LocalDate.of(2004, 11, 6), List.of("79175704071"));
        Contact Maxim = new Contact("Максим", LocalDate.of(2001, 12, 26), List.of("79175704071"));


        PhoneContact phoneBook = new PhoneContact();
        phoneBook.addContact(Vlad);
        phoneBook.addContact(Masha);
        phoneBook.addContact(Maxim);

        assertTrue(phoneBook.firstBirthdayV2().equals(Masha));
        assertFalse(phoneBook.firstBirthdayV2().equals(Vlad));
    }

    @Test

    void removecontact() {
        Contact Vlad = new Contact("Влад", LocalDate.of(2004, 10, 6), List.of("79175704071"));
        Contact Masha = new Contact("Маша", LocalDate.of(2004, 11, 6), List.of("79175704071"));
        Contact Maxim = new Contact("Максим", LocalDate.of(2001, 12, 26), List.of("79175704071"));

        PhoneContact phoneBook = new PhoneContact();
        phoneBook.addContact(Vlad);
        phoneBook.addContact(Masha);
        phoneBook.addContact(Maxim);
        phoneBook.removeContact(Vlad);

        assertNotEquals(Vlad, phoneBook.searchByName("Влад"));
    }


    @Test

    void sortContactPerDate() {
        Contact Vlad = new Contact("Влад", LocalDate.of(2004, 10, 6), List.of("79175704071"));
        Contact Masha = new Contact("Маша", LocalDate.of(2004, 11, 6), List.of("79175704071"));
        Contact Maxim = new Contact("Максим", LocalDate.of(2001, 12, 26), List.of("79175704071"));

        PhoneContact phoneBook = new PhoneContact();
        phoneBook.addContact(Vlad);
        phoneBook.addContact(Masha);
        phoneBook.addContact(Maxim);

        List<Contact> sortedContacts = (List<Contact>) phoneBook.sortContactPerDate();

        assertEquals(Maxim, sortedContacts.get(0));
        assertEquals(Vlad, sortedContacts.get(1));
        assertEquals(Masha, sortedContacts.get(2));



    }


}
