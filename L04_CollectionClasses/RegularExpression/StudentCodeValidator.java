package L04_CollectionClasses.RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentCodeValidator {
    public static void main( String[] args ) {

        final String REGEX = "^GCE[0235]\\d{5}$"; // rule

        // String studentCode = "GCE010621";

        Scanner scanner = new Scanner( System.in );
        String studentCode = scanner.next();

        // GCD -> IT
        // GBD -> Biz
        // GDD -> Design

        final Pattern pattern = Pattern.compile( REGEX );
        final Matcher matcher = pattern.matcher( studentCode );

        boolean found = matcher.matches( ); // -> true

        System.out.println( "found: " + found );

    }
}

