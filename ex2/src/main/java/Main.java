public class Main {

    public boolean isLeapYearV1(int _year) {
        return (_year % 4 == 0);
    }

    public boolean isLeapYearV2(int _year) {
        return (_year % 4 == 0) && _year % 100 != 0;
    }

    public boolean isLeapYearV3(int _year) {
        return (_year % 4 == 0 && _year % 100 != 0) || _year % 400 == 0;
    }
}
