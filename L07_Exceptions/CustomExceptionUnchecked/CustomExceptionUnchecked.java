package L07_Exceptions.CustomExceptionUnchecked;
import java.util.ArrayList;
import java.util.Arrays;

// create a unchecked exception class
class CustomException extends RuntimeException {
    public CustomException(String message) {
        // call the constructor of RuntimeException
        super(message);
    }
}
public class CustomExceptionUnchecked {
    static ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

    // check the exception condition
    public static void checkLanguage(String language) {

        // throw exception if language already present in ArrayList
        if(languages.contains(language)) {
            throw new CustomException(language + " already exists");
        }
        else {
            // insert language to ArrayList
            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }

    public static void main(String[] args) {

        // check if language already present
        checkLanguage("Swift");
        checkLanguage("Java");
    }
}
