package LiveCode.InterfaceDemo;


interface Shape {

    public void getPerimeter( );
}

class Square implements Shape {

    @Override
    public void getPerimeter( ) { // B
        System.out.println( "getArea() = a * 4" );
    }
}

class Rectangle implements Shape {

    @Override
    public void getPerimeter( ) { // C
        System.out.println( "getArea() = ( a + b ) * 2" );
    }
}

class Rhombus implements Shape {

    @Override
    public void getPerimeter( ) {
        System.out.println( "getArea() = a + b + c + d" );
    }
}

class ShapeInterfaceDemo {
    public static void main( String[] args ) {
        Square square = new Square( );
        square.getPerimeter( ); // B

        Rectangle rectangle = new Rectangle( );
        rectangle.getPerimeter( ); // C

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