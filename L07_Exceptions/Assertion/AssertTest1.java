package L07_Exceptions.Assertion;

public class AssertTest1 {
    public static void main(String args[]) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 2;
        System.out.println("There are " + weekends.length + " weekends in a week");
    }
}
