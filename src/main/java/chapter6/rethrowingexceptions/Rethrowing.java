package chapter6.rethrowingexceptions;

import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class Rethrowing {
    public void rethrowing() throws IOException, SQLException, DateTimeParseException {
        try {
            Parser parser = new Parser();
            parser.parseData();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }
    }
}
