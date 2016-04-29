import static org.junit.Assert.*;

import org.junit.Test;

public class RentalTest {

	Movie m = new Movie("Film", 1);
    Rental r = new Rental(m, 20);

    @Test
    public void getDaysRented() throws Exception {
        assertEquals(r.getDaysRented(), 20);
    }

    @Test
    public void getMovie() throws Exception {
        assertEquals(r.getMovie(), m);
    }

}
