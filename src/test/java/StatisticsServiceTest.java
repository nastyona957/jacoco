import org.example.StatisticsService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {
    @Test
    public void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMax_whenAllElementsAreSame() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 5, 5, 5, 5};
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMax_IfFirstNotMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {3, 7, 9, 4, 5, 1, 9, 6, 15, 2, 1};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMax_whenMaxIsLastElement() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {2, 8, 4, 5, 10};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
