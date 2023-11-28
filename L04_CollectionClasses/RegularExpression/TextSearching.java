package L04_CollectionClasses.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearching {
    public static void main( String[] args ) {
        final String REGEX = "\\d{3}[-|\\/]\\d{3}[-|\\/]\\d{4}"; // 777-777-7777


        String inputString = "Alison J. Freeman 818-853-0543, Arthur K. Dukes 410-7951-6256, " +
                "Charlotte J. Tighe 210-529-3572, Shameka K. Reynolds 513-247-5870 Alison J. Freeman 818-853-0543, Arthur K. Dukes 410-751-6256";

        Pattern pattern = Pattern.compile( REGEX );
        Matcher matcher = pattern.matcher( inputString );

        while ( matcher.find( ) ) {
            System.out.println( inputString.substring( matcher.start( ), matcher.end( ) ) );
        }


    }
}
