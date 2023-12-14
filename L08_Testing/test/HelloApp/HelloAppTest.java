package L09_Testing.HelloApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloAppTest {

    HelloApp helloApp = new HelloApp("John");

    @Test
    public void helloAppTest1() {
        assertEquals("Hello John", helloApp.hello());
    }

    @Test
    public void helloAppTest2() {
        assertEquals("Hello David", helloApp.hello("David"));

    }

    @Test
    public void helloAppTest3() {
        assertNotEquals("Hello David", helloApp.hello("David"));
    }
}