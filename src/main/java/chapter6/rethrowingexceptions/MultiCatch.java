package chapter6.rethrowingexceptions;

import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class MultiCatch {
    public void multiCatch() throws IOException, SQLException, DateTimeParseException {
        try {
            Parser parser = new Parser();
            parser.parseData();
        } catch (IOException | DateTimeParseException e) {
            System.err.println(e);
            throw e;
        }
    }
}
