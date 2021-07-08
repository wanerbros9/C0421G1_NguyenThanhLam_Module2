package case_study.libs;

import case_study.models.Booking;

import java.io.Serializable;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking>, Serializable {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (!o1.getStartDate().equals(o2.getStartDate())) {
            return o1.getStartDate().compareTo(o2.getStartDate());
        } else {
            return o1.getEndDate().compareTo(o2.getEndDate());
        }
    }
}
