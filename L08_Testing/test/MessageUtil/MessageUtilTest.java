package L09_Testing.MessageUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MessageUtilTest {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil( message );

    @Test
    public void testPrintMessage( ) {
        Assertions.assertEquals( message, messageUtil.printMessage( ) );
    }
}