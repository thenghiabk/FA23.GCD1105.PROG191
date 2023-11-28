package L04_CollectionClasses.PersonArray;

public class Person {
    // attributes
    private String name;
    private int age;
    private char gender;

    // constructor
    public Person( ) {
        // nothing
    }

    public Person( String name, int age, char gender ) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // setters, getters
    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge( ) {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public char getGender( ) {
        return gender;
    }

    public void setGender( char gender ) {
        this.gender = gender;
    }

    public String toString(){
        return name + ", " + age + ", " + gender;
    }

}
