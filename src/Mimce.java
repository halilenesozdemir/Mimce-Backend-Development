import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Mimce {
    public String gunuDondur(int yil, int ay, int gun) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(yil, ay, gun);

        SimpleDateFormat formatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        return formatter.format(calendar.getTime());

    }

    public long calculateDifferenceDay(int year1, int month1, int day1, int year2, int month2, int day2) {
        Calendar startDate = Calendar.getInstance();
        startDate.set(year1, month1, day1);

        Calendar endDate = Calendar.getInstance();
        endDate.set(year2, month2, day2);

        long differenceMilisecond = endDate.getTimeInMillis() - startDate.getTimeInMillis();
        return differenceMilisecond / (1000 * 60 * 60 * 24);

    }

    public String returnMonth(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        SimpleDateFormat formatter = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        return formatter.format(calendar.getTime());

    }

    
}
