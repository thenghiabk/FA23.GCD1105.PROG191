package LiveCode;

import java.util.Scanner;

public class ArrayManipulation_NotDoneYet {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter the size of the array: " );

        int size = scanner.nextInt();
        int[] arrayInt = new int[size];

        int choice;
        do {
            printMenu( );
            choice = scanner.nextInt( );

            switch ( choice ) {
                case 1:
                    System.out.println( "Case 1 selected" );
                    fillArray( arrayInt, scanner );
                    break;
                case 2:
                    System.out.println( "Case 2 selected" );
                    displayArray(arrayInt);
                    break;
                case 3:
                    System.out.println( "Case 3 selected" );
                    break;
                case 4:
                    System.out.println( "Case 4 selected" );
                    break;
                case 5:
                    System.out.println( "Case 5 selected" );
                    break;
                case 6:
                    System.out.println( "Case 6 selected" );
                    break;
                case 7:
                    System.out.println( "Case 7 selected" );
                    break;
                default:
                    System.out.println( "Wrong selection" );
                    break;

            }
        } while ( choice != 7 );


    }

    static void printMenu(){
        System.out.println("\n===== Array Manipulation Menu =====");
        System.out.println("1. Fill Array");
        System.out.println("2. Display Array");
        System.out.println("3. Find Maximum");
        System.out.println("4. Find Minimum");
        System.out.println("5. Calculate Average");
        System.out.println("6. Multiply by Scalar");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

     static void fillArray(int[] arrayInt, Scanner scanner){
         System.out.println("Enter the values for the array elements:" );
        for(int i = 0; i<arrayInt.length; i++ ){
            System.out.printf("Element %d : ", (i+1));
            arrayInt[i] = scanner.nextInt( );
        }
     }

     static void displayArray(int[] arrayInt){
         for ( int x: arrayInt) {
             System.out.println( x );
         }
     }
}
