package phonecontact;

import java.time.LocalDate;
import java.util.*;

public class PhoneContact  {
    private List<Contact> contacts;
    private Map<String,Contact> contactByName;
    private Map<String,Contact> contactsort;
    private Map<LocalDate,Contact> contactsortdate;
    private TreeMap<LocalDate,Contact> contactfirstdate;
    private Map<Contact,LocalDate> contactfirstdateV2;



    public PhoneContact() {
        contacts = new ArrayList<>();
        contactByName = new HashMap<>();
        contactsort = new TreeMap<>();
        contactsortdate = new TreeMap<>();
        contactfirstdate = new TreeMap<>(new PhoneContactDateComparator());
        contactfirstdateV2 = new HashMap<>();

    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        contactByName.put(contact.getName(), contact);
        contactsort.put(contact.getName(),contact);
        contactsortdate.put(contact.getBirthdaydate(),contact);
        contactfirstdate.put(contact.getBirthdaydate(),contact);
        contactfirstdateV2.put(contact,contact.getBirthdaydate());
    }
    public void removeContact(Contact contact) {
        contacts.remove(contact);
        contactByName.remove(contact.getName(),contact);
        contactsort.remove(contact.getName(),contact);
        contactsortdate.remove(contact.getBirthdaydate(),contact);
        contactfirstdate.remove(contact.getBirthdaydate(),contact);
        contactfirstdateV2.remove(contact,contact.getBirthdaydate());
    }

    public void changeContactInf(String contactName ,String name , LocalDate birthdaydate) {
        if (contactByName.containsKey(contactName)) {
            contactByName.get(contactName).setName(name);
            contactByName.get(contactName).setBirthdaydate(birthdaydate);

        }
    }

    public void addPhoneToContact(String contactName, String phoneToAdd){
        if (contactByName.containsKey(contactName)) {
            contactByName.get(contactName).getPhones().add(phoneToAdd);

        }
    }
    public void deletePhoneToContact(String contactName, String phoneToDelete){
        if (contactByName.containsKey(contactName)) {
            contactByName.get(contactName).getPhones().remove(phoneToDelete);

        }
    }
    public Contact searchByName(String name) {
        return contactByName.get(name);
    }

    public Collection<Contact> sortContact() {
        return contactsort.values();
    }

    public Collection<Contact> sortContactPerDate() {
        return contactsortdate.values();
    }


    public List<Contact> firstBirthday() {
        LocalDate today = LocalDate.now();
        List<Contact> listContact = new ArrayList<>();


        for (Map.Entry<LocalDate, Contact> day : contactfirstdate.entrySet()) {
            if (day.getKey().getMonthValue() > today.getMonthValue() ||
                    (day.getKey().getMonthValue() == today.getMonthValue() && day.getKey().getDayOfMonth() >= today.getDayOfMonth())) {
                listContact.add(day.getValue());
            }
        }
        return null;


    }

    public List<Contact> firstBirthdayV2() {
        LocalDate today = LocalDate.now();
        List<Contact> listContact = new ArrayList<>();
        Map.Entry<LocalDate, Contact> entry = contactfirstdate.ceilingEntry(today);
        if (entry != null) {
            for (Map.Entry<Contact, LocalDate> day : contactfirstdateV2.entrySet()) {
                if (day.getValue().getMonthValue() == entry.getKey().getMonthValue() && day.getValue().getDayOfMonth() == entry.getKey().getDayOfMonth()) {
                    listContact.add(day.getKey());
                }
            }
        }
        return listContact;
    }

    public void MainContact(String nameContact) {
        if (contactByName.containsKey(nameContact)) {
            contactByName.get(nameContact).setFavourite(true);
        }
    }

    public void deleteMainContact(String nameContact) {
        if (contactByName.containsKey(nameContact)) {
            contactByName.get(nameContact).setFavourite(false);
        }
    }

    public List<Contact> favoriteContactsList() {
        List<Contact> contactlist = new ArrayList<>();
        for (Contact contact : contactsort.values()) {
            if(contact.isFavourite()) {
                contactlist.add(contact);
            }
        }
        return contactlist;
    }



}




