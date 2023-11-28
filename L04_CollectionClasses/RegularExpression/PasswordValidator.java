// @ https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/

package L04_CollectionClasses.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main( String[] args ) {
        /**
         * Secure Password requirements
         *
         *      Password must contain at least one digit [0-9].
         *      Password must contain at least one lowercase Latin character [a-z].
         *      Password must contain at least one uppercase Latin character [A-Z].
         *      Password must contain at least one special character like ! @ # & ( ).
         *      Password must contain a length of at least 8 characters and a maximum of 20 characters.
         */

        /**
         * Regex password explanation
         * ^                                   # start of line
         *   (?=.*[0-9])                       # positive lookahead, digit [0-9]
         *   (?=.*[a-z])                       # positive lookahead, one lowercase character [a-z]
         *   (?=.*[A-Z])                       # positive lookahead, one uppercase character [A-Z]
         *   (?=.*[!@#&()–[{}]:;',?/*~$^+=<>]) # positive lookahead, one of the special character in this [..]
         *   .                                 # matches anything
         *   {8,20}                            # length at least 8 characters and maximum of 20 characters
         * $
         */

        final String REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

        String inputPassword = "P@ssw0rd";

        // create a pattern
        Pattern pattern = Pattern.compile( REGEX );

        // get a matcher object
        Matcher matcher = pattern.matcher( inputPassword );

        boolean found = matcher.matches( );

        System.out.println("found: " + found );

    }
}


