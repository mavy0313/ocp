package chapter1.enums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeasonWithConstructorsTest {

    @Test
    public void expectedVisitors() {
        assertEquals("High", SeasonWithConstructors.SUMMER.getExpectedVisitors());
    }
}
