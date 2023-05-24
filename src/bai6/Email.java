package bai6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email{
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public Email() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}


class EmailTest {
    private static Email email;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        email = new Email();
        for (String emailAdd : validEmail) {
            boolean isvalid = email.validate(emailAdd);
            System.out.println("Email is " + emailAdd +" is valid: "+ isvalid);
        }
        for (String emailAdd : invalidEmail) {
            boolean isvalid = email.validate(emailAdd);
            System.out.println("Email is " + emailAdd +" is valid: "+ isvalid);
        }
    }
}