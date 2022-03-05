import java.util.Scanner;

/**
 * Homework3(Challenge): AccountGenerator
 *
 * A password generator based on given user information.
 *
 * @author Advit Bhullar , L24
 * @version September 11 , 2021
 */
public class AccountGenerator {
    static final String FIRST_NAME_QUESTION = "What's your first name?" ;
    static final String LAST_NAME_QUESTION = "What's your last name?" ;
    static final String AGE_QUESTION = "How old are you?" ;
    static final String BIRTHDAY_QUESTION = "What is your birthday? Enter the month, " +
            "the day and then the year (MM DD YYYY)." ;
    static final String FINAL_USERNAME_SENTENCE = "The generated username is: " ;
    static final String FINAL_PASSWORD_SENTENCE = "The generated password is: " ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(FIRST_NAME_QUESTION) ;
        String firstName = scanner.nextLine() ;
        System.out.println(LAST_NAME_QUESTION) ;
        String lastName = scanner.nextLine() ;
        System.out.println(AGE_QUESTION) ;
        double age = scanner.nextDouble() ;
        scanner.nextLine() ;
        System.out.println(BIRTHDAY_QUESTION) ;
        String birthday = scanner.nextLine() ;
        char usernamePart1 = firstName.charAt( 0 ) ; // usernamePart1 comes from firstName
        String usernamePart2 = birthday.substring( 6 , 10 ) ; // usernamePart2 comes from birthday
        String generatedUsername = usernamePart1 + lastName + usernamePart2 ;
        int passwordPart1EndPoint = ((firstName.length()) / 2) ;
        String passwordPart1 = firstName.substring(0 , passwordPart1EndPoint) ;
        int passwordPart2StartPoint = lastName.length() / 2 ;
        String passwordPart2 = lastName.substring(passwordPart2StartPoint , lastName.length()) ;
        char passwordPart3 = (char)(((int)(age % 26)) + 65) ;
        double passwordPart41 = Double.parseDouble(birthday.substring( 0 , 2 )) ;
        double passwordPart42 = Double.parseDouble(birthday.substring( 3 , 5 )) ;
        double passwordpart43 = Double.parseDouble(birthday.substring( 6 , 10 )) ;
        int sum = (int) (passwordPart41 + passwordPart42 + passwordpart43) ;
        int passwordPart4 = sum % 12 ;
        String generatedPassword = passwordPart1 + passwordPart2 + passwordPart3 + passwordPart4 ;
        System.out.println(FINAL_USERNAME_SENTENCE + generatedUsername + "\n") ;
        System.out.println(FINAL_PASSWORD_SENTENCE + generatedPassword + "\n") ;
    }

}
