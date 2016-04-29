import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	final String name = "Hans Peter";
	Customer customer = new Customer(name);
    Movie m = new Movie("Testfilm", 123);
    Rental r = new Rental(m, 30);

    @Test
    public void addRental() throws Exception {
        customer.addRental(r);
        assertEquals(customer.statement(), "Rental Record for " + this.customer.getName() + "\n\tTitle\t\tDays\tAmount\n\t" + this.m.getTitle() + "\t\t30\t0.0\nAmount owed is 0.0\nYou earned 1 frequent renter points");
    }

    @Test
    public void getName() throws Exception {
        assertEquals(customer.getName(), name);
    }

    @Test
    public void statement() throws Exception {
        customer.addRental(r);
        assertEquals(customer.statement(), "Rental Record for " + this.customer.getName() + "\n\tTitle\t\tDays\tAmount\n\t" + m.getTitle() + "\t\t30\t0.0\nAmount owed is 0.0\nYou earned 1 frequent renter points");
    }

}
