import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	Movie movie = new Movie("Film", 1);

    @Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 1);
    }

    @Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(2);
        assertEquals(movie.getPriceCode(), 2);
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(movie.getTitle(), "Film");
    }

}
