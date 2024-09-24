package phonecontact;

import java.time.LocalDate;
import java.util.Comparator;

public class PhoneContactDateComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate date1, LocalDate date2) {
        if (date1.getMonthValue() != date2.getMonthValue()) {
            return date1.getMonthValue() - date2.getMonthValue();
        } else {
            return date1.getDayOfMonth() - date2.getDayOfMonth();
        }
    }
}
