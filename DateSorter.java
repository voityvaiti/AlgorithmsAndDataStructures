package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DateSorter {

    /**
     * This method sort dates.
     * The output is in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */

    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        List<LocalDate> datesWithR = new ArrayList<>();
        List<LocalDate> datesWithoutR = new ArrayList<>();

        separateDatesByR(unsortedDates, datesWithR, datesWithoutR);

        sortAscending(datesWithR);
        sortDescending(datesWithoutR);

        datesWithR.addAll(datesWithoutR);
        return datesWithR;
    }

    private void separateDatesByR(List<LocalDate> unsortedDates, List<LocalDate> withR, List<LocalDate> withoutR) {

        for (LocalDate date : unsortedDates) {

            if (hasRInMonth(date)) {
                withR.add(date);
            } else {
                withoutR.add(date);
            }
        }
    }

    private void sortAscending(List<LocalDate> dates) {
        Collections.sort(dates);
    }

    private void sortDescending(List<LocalDate> dates) {
        Collections.sort(dates, Collections.reverseOrder());
    }


    private boolean hasRInMonth(LocalDate date) {
        String month = date.getMonth().toString().toLowerCase();
        return month.contains("r");
    }
}