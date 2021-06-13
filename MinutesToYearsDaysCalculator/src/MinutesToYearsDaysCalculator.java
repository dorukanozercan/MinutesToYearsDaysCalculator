
public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        // can take any minute value
        printYearsAndDays(56160054);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = (minutes / 60) / 24;
            long years = days / 365;
            if (days % 365 == 0) {
                days = 0;
            } else if (days > 365) {
                days -= 365 * years;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
  }

}
