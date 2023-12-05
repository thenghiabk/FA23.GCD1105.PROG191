package LiveCode.AbstractClassDemo;


abstract class Shape {
    int a;
    int b;
    int c;
    int d;

    abstract void getPerimeter( );
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

    @Override
    void getPerimeter( ) {
        System.out.println( "getArea() = a + b + c + d" );
    }
}

class ShapeAbstractDemo {
    public static void main( String[] args ) {
        Square square = new Square( );
        square.getPerimeter( ); // called from B

        Rectangle rectangle = new Rectangle( );
        rectangle.getPerimeter( ); // called from C

        // AbstractShape shape = new AbstractShape( ); // error
        // shape.getPerimeter( );

        Rhombus rhombus = new Rhombus( );
        rhombus.getPerimeter( ); // A

        Shape newShape = new Square( );
        newShape.getPerimeter( ); // B <-- true polymorphism

        newShape = new Rectangle( );
        newShape.getPerimeter( ); // C   <-- true polymorphism

        // Square newSquare = new Rectangle(); // error
    }
}