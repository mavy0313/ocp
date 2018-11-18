package chapter1.enums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SeasonTest {

    @Test
    public void compare() {
        Season season = Season.SUMMER;

        assertEquals("SUMMER", Season.SUMMER.toString());
        assertTrue(season == Season.SUMMER);
    }

    @Test
    public void values() {
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        assertEquals(4, Season.values().length);

        assertEquals("WINTER", Season.values()[0].name());
        assertEquals(0, Season.values()[0].ordinal());

        assertEquals("SPRING", Season.values()[1].name());
        assertEquals(1, Season.values()[1].ordinal());

        assertEquals("SUMMER", Season.values()[2].name());
        assertEquals(2, Season.values()[2].ordinal());

        assertEquals("FALL", Season.values()[3].name());
        assertEquals(3, Season.values()[3].ordinal());
    }

    @Test
    public void switchStatement() {
        Season summer = Season.SUMMER;
        String result;

        switch (summer) {
            case WINTER :
                result = "Get out the sled!";
                break;
            case SUMMER:
                result = "Time for the pool!";
                break;
            default:
                result = "Is it summer yet?";
        }

        assertEquals("Time for the pool!", result);
    }
}
