import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    @Test
    void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculatorFare(distance, time);
        Assertions.assertEquals(25, fare);
    }

    @Test
    void givenLessDistanceOrTime_ShouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculatorFare(distance, time);
        Assertions.assertEquals(5, fare);
    }


}
