import org.w3c.dom.ls.LSOutput;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2012;
        int year2 = 1996;
        int year3 = 2000;
        int year4 = 1900;
        int year5 = 2001;
        int year6 = 1998;


        LeapYear.isLeapYear(year);
        LeapYear.isLeapYear(year2);
        LeapYear.isLeapYear(year3);
        LeapYear.isLeapYear(year4);
        LeapYear.isLeapYear(year5);
        LeapYear.isLeapYear(year6);
    }

    public static boolean isLeapYear(int yearInsideMethod) {
        if ((yearInsideMethod % 4 == 0 && yearInsideMethod % 100 != 0) || yearInsideMethod % 400 == 0) {
            System.out.println("Rok" + " " + yearInsideMethod + " " + "jest przestępny");
            return true;
        }
        System.out.println("Rok" + " " + yearInsideMethod + " " + "nie jest przestępny");
        return false;

    }
}

