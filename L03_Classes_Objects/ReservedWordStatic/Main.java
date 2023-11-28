package L03_Classes_Objects.ReservedWordStatic;

public class Main {
    public static void main( String[] args ) {
        Student studentA = createNewStudentObject("John");
        Student studentB = createNewStudentObject("Ben");

        studentB.setSecretKey("ladyFirstInGW"); // attribute secretKey shared between objects studentA and student B

        System.out.println(studentA.getSecretKey()); // > ladyFirstInGW
    }
    public static Student createNewStudentObject(String name){
        Student student = new Student(name);
        return student;
    }
}
