package LiveCode;

class Student{
    /**
     * Fields (Data Members)
     */
    private String name;
    private String id;
    private String address;
    private double height;

    // math
    private double mathScore;
    // english
    private double englishScore;
    // programming
    private double programmingScore;
    // physics
    private double physicsScore;
    // avg
    private double avgScore;

    /**
     * Methods (Functions)
     */
    // Constructor
    public Student(){
        this(null,null,null,0.0);
    }
    public Student(String name){
         this(name, null,null,0.0);
    }
    public Student(String name, String id){
        this(name, id, null, 0.0);
    }
    public Student(String name, String id, String address){
        this(name, id, address, 0.0);
    }
    public Student(String name, String id, String address, double height){
        this.name = name;
        this.id = id;
        this.address = address;
        this.height = height;
    }
    // getters , setters

    public String getName( ) {
        return name;
    }
    public void setName( String name ) {
        this.name = name;
    }
    public String getId( ) {
        return id;
    }
    public void setId( String id ) {
        this.id = id;
    }
    public String getAddress( ) {
        return address;
    }
    public void setAddress( String address ) {
        this.address = address;
    }
    public double getHeight( ) {
        return height;
    }
    public void setHeight( double height ) {
        this.height = height;
    }
    public double getMathScore( ) {
        return mathScore;
    }
    public void setMathScore( double mathScore ) {
        this.mathScore = mathScore;
    }
    public double getEnglishScore( ) {
        return englishScore;
    }
    public void setEnglishScore( double englishScore ) {
        this.englishScore = englishScore;
    }
    public double getProgrammingScore( ) {
        return programmingScore;
    }
    public void setProgrammingScore( double programmingScore ) {
        this.programmingScore = programmingScore;
    }
    public double getPhysicsScore( ) {
        return physicsScore;
    }
    public void setPhysicsScore( double physicsScore ) {
        this.physicsScore = physicsScore;
    }
    public double getAvgScore( ) {
        return avgScore;
    }
    public void setAvgScore( double avgScore ) {
        this.avgScore = avgScore;
    }
}

class StudentTest {

    public static void main( String[] args ) {

        /**
         * Example 1
         */
        Student student1 = new Student( "Lucy", "GCD123456", "658 NQ", 1.9 );
        student1.setMathScore( 8 );
        student1.setEnglishScore( 7 );
        student1.setProgrammingScore( 9 );
        student1.setPhysicsScore( 9 );

        System.out.println( student1.getAvgScore() ); // 0.0

        double avgScore;
        avgScore = calculateAvgScore( student1.getMathScore(), student1.getEnglishScore( ), student1.getProgrammingScore(), student1.getPhysicsScore());
        student1.setAvgScore( avgScore ); // 8.25 -> avgScore (Student)
        System.out.println( student1.getAvgScore() ); // 8.25

        /**
         * Example 2
         */
        Student student2 = new Student( "John", "GCD654321", "658 NQ", 2.3 );
        student2.setMathScore( 7 );
        student2.setEnglishScore( 6 );
        student2.setProgrammingScore( 4 );
        student2.setPhysicsScore( 9 );

        System.out.println( student2.getAvgScore() ); // 0.0

        calculateAvgScore( student2 );
        System.out.println( student2.getAvgScore() ); // 6.5

        student1.setProgrammingScore( 7 ); // 9 -> 7
        calculateAvgScore( student1 );
        System.out.println( student1.getAvgScore() ); // 8.25 -> 7.75

        /**
         * Example 3
         */
        Student student3;
        student3 = createNewStudent("Lucy", "GCD123456", "658 NQ", 1.9);

    }
    // call-by-value
    public static double calculateAvgScore(double mathScore, double englishScore, double progScore, double phyScore){
        double avgScore = (mathScore + englishScore + progScore + phyScore) / 4;
        return avgScore;
    }
    // call-by-reference
    public static void calculateAvgScore(Student student) {
        double avgScore;
        avgScore = (student.getMathScore() + student.getEnglishScore() + student.getProgrammingScore() + student.getPhysicsScore()) / 4;
        student.setAvgScore( avgScore );
    }

    public static Student createNewStudent(String name, String id, String address, double height){
        Student newStudent = new Student( name, id, address, height );
        return newStudent;
    }
}
