import org.junit.jupiter.api.Assertions;

public class LeapTestsV3 {

    private Main main = new Main();

    @org.junit.jupiter.api.Test
    public void test_leap_year_1(){
        Assertions.assertTrue(main.isLeapYearV3(4));
    }
    @org.junit.jupiter.api.Test
    public void test_leap_year_2(){
        Assertions.assertFalse(main.isLeapYearV3(7));
    }
    @org.junit.jupiter.api.Test
    public void test_leap_year_3(){
        Assertions.assertFalse(main.isLeapYearV3(100));
    }
    @org.junit.jupiter.api.Test
    public void test_leap_year_6(){
        Assertions.assertTrue(main.isLeapYearV3(2020));
    }
    @org.junit.jupiter.api.Test
    public void test_leap_year_7(){
        Assertions.assertFalse(main.isLeapYearV3(2021));
    }
}