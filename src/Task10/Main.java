package Task10;

public class Main {
    public static void main(final String[] args) {
        final Day[] week = new Day[7];

        week[0] = new Day(28, "Sunny", 37, 5, 760, "Monday");
        week[1] = new Day(30, "Sunny", 39, 2, 762, "Tuesday");
        week[2] = new Day(24, "Cloudy", 50, 6, 759, "Wednesday");
        week[3] = new Day(21, "Windy/Cloudy", 58, 12, 755, "Thursday");
        week[4] = new Day(20, "Rain", 65, 6, 760, "Friday");
        week[5] = new Day(18, "Storm", 89, 16, 766, "Saturday");
        week[6] = new Day(20, "Rain/Windy", 80, 10, 758, "Sunday");

        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i]);
        }
    }
}
