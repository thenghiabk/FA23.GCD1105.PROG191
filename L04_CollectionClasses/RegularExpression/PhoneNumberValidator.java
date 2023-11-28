package L04_CollectionClasses.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static void main( String[] args ) {
        final String REGEX = "^\\(?\\d{3}\\)?[-. ]?\\d{3}[-. ]?\\d{4}$";

        /**
         * (076) 271 2072
         * (076)271 2072
         * (076) 2712072
         * 0762712072
         */

        String phoneNumber = "0762712072";

        Pattern pattern = Pattern.compile( REGEX );
        Matcher matcher = pattern.matcher( phoneNumber );

        boolean found = matcher.matches( );

        System.out.println("found: " + found );
    }
}
