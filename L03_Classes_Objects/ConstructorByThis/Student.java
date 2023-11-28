package L03_Classes_Objects.ConstructorByThis;

public class Student {
    private String name;
    private int age;
    private String email;

    public Student( ) {
        this( "UnknownName", 99, "unknown_email@gw.com" );
    }

    public Student( String name ) {
        this( name, 99, "unknown_email@gw.com" );
    }

    public Student( String name, int age ) {
        this( name, age, "unknown_email@gw.com" );
    }

    public Student( String name, int age, String email ) {
        setName( name );
        setAge( age );
        setEmail( email );
    }

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

    public String getEmail( ) {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String toString(){
        return "Name: " + getName( ) + "\nAge: " + getAge( ) + "\nEmail: " + getEmail( );
    }
}
