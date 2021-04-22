import org.junit.jupiter.api.Assertions;

public class LeapTestsV2 {
    private Main main = new Main();

    @org.junit.jupiter.api.Test
    public void test_leap_year_1() {
        Assertions.assertTrue(main.isLeapYearV2(4));
    }
    @org.junit.jupiter.api.Test
    public void test_leap_year_2() {
        Assertions.assertFalse(main.isLeapYearV2(7));
    }
    @org.junit.jupiter.api.Test
    public void test_leap_year_3() {
        Assertions.assertFalse(main.isLeapYearV2(100));
    }
}
