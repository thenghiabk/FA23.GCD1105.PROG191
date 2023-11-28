package L04_CollectionClasses.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardNumberMasking {
    public static void main( String[] args ) {
        final String REGEX = "^\\d{4}-\\d{4}-\\d{4}-";

        /**
         * masked string: XXXX-XXXX-XXXX-4444
         */

        String cardNumber = "1111-2222-3333-1234";

        Pattern pattern = Pattern.compile( REGEX );
        Matcher matcher = pattern.matcher( cardNumber );

        String maskedCard = matcher.replaceAll( "YYYY-XXXX-ZZZZ-" );
        System.out.println( maskedCard );
    }
}
