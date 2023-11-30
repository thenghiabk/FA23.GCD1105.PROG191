package L05_Inheritance.CommissionAppV0;

public class CommissionEmployeeTest {
    public static void main( String[] args ) {
        // instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee( "Sue", "Jones", "222-22-2222", 10000, .06 );

        // get commission employee data
        System.out.println( "Employee information obtained by get method: \n" );
        System.out.printf( "%s %s\n", "First name is", employee.getFirstName( ) );
        System.out.printf( "%s %s\n", "Last name is", employee.getLastName( ) );
        System.out.printf( "%s %s\n", "Social security number is", employee.getSocialSecurityNumber( ) );
        System.out.printf( "%s %s\n", "Gross sales is", employee.getGrossSales( ) );
        System.out.printf( "%s %s\n", "Commission rate is", employee.getCommissionRate( ) );

        System.out.println( employee );

        employee.setGrossSales( 500 );
        employee.setCommissionRate( .1 );

        System.out.printf( "\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee );

    } // end main
} // end class CommissionEmployeeTest
