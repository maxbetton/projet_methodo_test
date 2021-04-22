import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class LeapTestsV1 {
    private Main main = new Main();

    @org.junit.jupiter.api.Test
    public void test_leap_year_1() {
        Assertions.assertTrue(main.isLeapYearV1(4));
    }
    @org.junit.jupiter.api.Test
    public void test_leap_year_2() {
        Assertions.assertFalse(main.isLeapYearV1(7));
    }
}
