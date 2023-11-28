package L04_CollectionClasses.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextReplacement {
    public static void main( String[] args ) {

        final String REGEX = "^(\\d+) divided by (\\d+)$"; // 10 divided by 2

        String inputText = "104 divided by 22";

        Pattern pattern = Pattern.compile( REGEX );
        Matcher matcher = pattern.matcher( inputText );

        if ( matcher.find( ) ) {
            String simplified = matcher.replaceFirst( "$1/$2" );
            double result = Double.valueOf( matcher.group( 1 ) ) / Double.valueOf( matcher.group( 2 ) );
            System.out.println(simplified + " = " + result );
        }

    }
}
