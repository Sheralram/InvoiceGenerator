import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator = null;

    @BeforeEach
    void setUp() {
         invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        Ride[] rides = {new Ride(2.0, 5),
                        new Ride(0.1, 1)
        };
        double fare = invoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(30, fare, 0.0);
    }

}
