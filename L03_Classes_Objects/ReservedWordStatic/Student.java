package L03_Classes_Objects.ReservedWordStatic;

public class Student {
    // data members

    // name
    private String name; // global

    private static String secretKey = "topSecret51";

    public static String getSecretKey() {
        return secretKey;
    }

    public static void setSecretKey(String secretKey) {
        Student.secretKey = secretKey;
    }

    public static int noOfIns = 0;

    // constructor

    public Student(String name){
        this.name = name;
        noOfIns++;
    }

    // methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
