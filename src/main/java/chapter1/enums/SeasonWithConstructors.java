package chapter1.enums;

public enum SeasonWithConstructors {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private String expectedVisitors;
    private SeasonWithConstructors(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

    public String getExpectedVisitors() {
        return expectedVisitors;
    }
}
