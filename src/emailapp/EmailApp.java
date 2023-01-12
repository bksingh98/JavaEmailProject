package emailapp;

public class EmailApp {

    public static void main(String[] args) {

        Email email = new Email("Bishal", "Singh");

        email.setAlternativeEmail("a.b@d.xyz.com");

        System.out.println(email.showInfo());

        email.setChangePassword("XYz@123");

        System.out.println(email.showInfo());


    }

}
