package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private String password;
    int mailboxCapacity = 100;
    private String alternativeEmail;
    private String companyName = "xyztech";

    //Constructor to receive first and last name of the person.
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = setRandomPassword(this.defaultPasswordLength);
        this.email = createEmail();

    }

    //Method to set department of the person
    private String setDepartment() {
        System.out.println("Please select the department number \n1 for sale\n2 for account\n3 for dev");
        Scanner in = new Scanner(System.in);
        int deptChoic = in.nextInt();
        if (deptChoic == 1) return "sale";
        else if (deptChoic == 2) return "account";
        else if (deptChoic == 3) return "dev";
        else return " ";

    }

    //creating a random password
    private String setRandomPassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomNumber = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomNumber);
        }
        return new String(password);

    }

    private String createEmail() {
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.companyName.toLowerCase() + ".com";
        return this.email;
    }

    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternativeEmail(String altEmail) {
        this.alternativeEmail = altEmail;
    }

    // change the password
    public void setChangePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public String getChangePassword() {
        return password;
    }

    public String showInfo() {
        return "\nDisplay Name : " + firstName + " " + lastName + "\nCompany Email : " + email + "\nMailBoxCapacity : " + mailboxCapacity + "\nCurrent Password: " + this.password;
    }

}

