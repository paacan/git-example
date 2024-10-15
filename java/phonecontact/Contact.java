package phonecontact;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Contact {

    private String name;
        private LocalDate birthdaydate;
        private List<String> phones;
        private boolean favourite;

        public Contact(String name, LocalDate birthdaydate, List phones) {
            this.name = name;
            this.birthdaydate = birthdaydate;
            this.phones = phones;

        }
        public String getName() {
            return name;

        }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public List<String> getPhones() {
            return phones;
        }

        public LocalDate getBirthdaydate() {

            return birthdaydate;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(birthdaydate, contact.birthdaydate) && Objects.equals(phones, contact.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdaydate, phones);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdaydate(LocalDate birthdaydate) {
        this.birthdaydate = birthdaydate;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", birthdaydate=" + birthdaydate +
                ", phonecontacts=" + phones +
                '}';
    }

}
