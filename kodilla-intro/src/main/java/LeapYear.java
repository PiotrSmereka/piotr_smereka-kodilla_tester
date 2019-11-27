public class LeapYear{
    int year = 2004;


    public static void main(String[] args) {


    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return false;
        }

        if (!(year % 4 == 0 || year % 400 == 0)) {
            return false;
        }

        return true;
    }
}