package L03_Classes_Objects.StudentClass;

public class Student {
    private String name;
    private double assignmentScore, midtermExamScore, finalExamScore;

    private double averageScore;

    public Student( String name, double assignmentScore, double midtermExamScore, double finalExamScore ) {
        this.name = name;
        this.assignmentScore = assignmentScore;
        this.midtermExamScore = midtermExamScore;
        this.finalExamScore = finalExamScore;
        setAverageScore( );
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public double getAssignmentScore( ) {
        return assignmentScore;
    }

    public void setAssignmentScore( double assignmentScore ) {
        this.assignmentScore = assignmentScore;
        setAverageScore( );
    }

    public double getMidtermExamScore( ) {
        return midtermExamScore;
    }

    public void setMidtermExamScore( double midtermExamScore ) {
        this.midtermExamScore = midtermExamScore;
        setAverageScore( );
    }

    public double getFinalExamScore( ) {
        return finalExamScore;
    }

    public void setFinalExamScore( double finalExamScore ) {
        this.finalExamScore = finalExamScore;
        setAverageScore( );
    }

    public double getAverageScore( ) {
        return averageScore;
    }

    private void setAverageScore( ) {
        double result = ( assignmentScore + midtermExamScore + finalExamScore ) / 3;
        averageScore = (double) Math.round( result * 100.0 ) / 100.0;
    }

    public void showInfo( ) {
        System.out.println( "Student: " + name + ", AvgScore: " + getAverageScore( ) + ", Ranking: " + showRanking() );
    }

    public String showRanking(){
        String ranking;
       if(averageScore >= 8.0){
           ranking = "Distinction";
       } else if ( (averageScore >= 5.0) && (averageScore < 8.0) ) {
           ranking = "Pass";
       } else {
           ranking = "Failed";
       }

       return ranking;
    }
}
