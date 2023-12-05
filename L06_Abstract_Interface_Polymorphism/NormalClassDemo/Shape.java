package LiveCode.NormalClassDemo;


public class Shape {
    int a;
    int b;
    int c;
    int d;

    void getPerimeter( ) { // A
        System.out.println( "getArea() = a + b + c + d" );
    }
}

class Square extends Shape {

    @Override
    void getPerimeter( ) { // B
        System.out.println( "getArea() = a * 4" );
    }
}

class Rectangle extends Shape {

    @Override
    void getPerimeter( ) { // C
        System.out.println( "getArea() = ( a + b ) * 2" );
    }
}

class Rhombus extends Shape {

}

class ShapeTest {
    public static void main( String[] args ) {
        Square square = new Square( );
        square.getPerimeter( ); // called from B

        Rectangle rectangle = new Rectangle( );
        rectangle.getPerimeter( ); // called from C

        Shape shape = new Shape( );
        shape.getPerimeter( ); // called from A

        Rhombus rhombus = new Rhombus( );
        rhombus.getPerimeter( ); // called from A

        Shape newShape = new Square( );
        newShape.getPerimeter( ); // called from B <-- true polymorphism

        newShape = new Rectangle( );
        newShape.getPerimeter( ); // called from C   <-- true polymorphism

        // Square newSquare = new Rectangle(); // error
    }
}