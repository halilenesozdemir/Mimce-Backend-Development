import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class MimceTest {
    @Test
    public void testMimce() {
        Mimce mimce = new Mimce();
        Assertions.assertEquals("Friday", mimce.gunuDondur(2024, Calendar.DECEMBER, 20));
    }

    @Test
    public void testDifferenceMilisecond() {

        Mimce mimce = new Mimce();
        long differenceDays = mimce.calculateDifferenceDay(2024, Calendar.JANUARY, 1, 2024, Calendar.JANUARY, 10);
        Assertions.assertEquals(20, differenceDays);
    }

    @Test
    public void testReturnMonth() {
        Mimce mimce = new Mimce();
        String returnedMonth = mimce.returnMonth(2024, Calendar.DECEMBER, 20);
        Assertions.assertEquals("December", returnedMonth);
    }

}
