package javaEight.newFeatures;

public class SwitchCaseEnhanced {

    public static void main(String args[]) {
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        System.out.println(getDaysSwitchCase("February"));
    }

    private static String getDaysSwitchCase(String month) {
        return switch (month) {
            case "January", "March", "May", "July", "August", "October", "December" -> "31 days";
            case "April", "June", "September", "November" -> "30 days";
            case "February" -> {
                System.out.println("Leap year has 29 days");
                yield "28 days";
            }
            default -> "Invalid month";
        };
    }
}
