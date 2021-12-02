package Task7;

public class Main {
    public static void main(final String[] args) {
        final User user1 = new User();
        final User user2 = new User();

        user1.setEmail("Oleh.Kalka.ITIS.2020@LPNU.UA");
        user2.setEmail("Oleh.Kalka.ITIS.2020@LPNU.UA");

        System.out.println(user1.equals(user2));
    }
}
