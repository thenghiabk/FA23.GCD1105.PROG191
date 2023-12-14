package L09_Testing.HelloApp;

public class HelloApp {
    private String name;
    public HelloApp(String name) {
        this.name = name;
    }
    public String hello() {
        return "Hello " + name;
    }
    public String hello(String other) {
        return "Hello " + other;
    }
}
