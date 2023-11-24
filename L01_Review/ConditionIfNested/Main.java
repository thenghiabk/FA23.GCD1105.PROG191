package L01_Review.ConditionIfNested;

public class Main {
    public static void main( String[] args ) {
        int testScore = 70;
        int studentAge = 9;

        if ( testScore >= 70 ) {
            if ( studentAge < 10 ){
                System.out.println("You did a great job" );
            } else { // test score >= 70 and age >= 10
                System.out.println("You did pass" );
            }

        } else { // test score < 70
            System.out.println("You did not pass" );

        }
    }
}
