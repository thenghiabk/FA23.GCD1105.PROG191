package L09_Testing.GroceryList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GroceryListTest {
    @Test
    public void testAddSingleItem( ) {
        GroceryList list = new GroceryList( );
        GroceryItemOrder item = new GroceryItemOrder( "Milk", 2, 2.50 );
        list.add( item );
        Assertions.assertEquals( 1, list.getSize( ) );
        Assertions.assertEquals( 5.00, list.getTotalCost( ), 0.01 );
    }

    @Test
    public void testAddMultipleItems( ) {
        GroceryList list = new GroceryList( );
        GroceryItemOrder item1 = new GroceryItemOrder( "Milk", 2, 2.50 );
        GroceryItemOrder item2 = new GroceryItemOrder( "Bread", 1, 1.50 );
        list.add( item1 );
        list.add( item2 );
        Assertions.assertEquals( 2, list.getSize( ) );
        Assertions.assertEquals( 6.50, list.getTotalCost( ), 0.01 );
    }

    @Test
    public void testGetTotalCostNoItems( ) {
        GroceryList list = new GroceryList( );
        Assertions.assertEquals( 0.00, list.getTotalCost( ), 0.01 );
    }

    @Test
    public void testAddFullList( ) {
        GroceryList list = new GroceryList( );
        for ( int i = 0; i < 10; i++ ) {
            GroceryItemOrder item = new GroceryItemOrder( "Item " + i, 1, 1.00 );
            list.add( item );
        }
        GroceryItemOrder extraItem = new GroceryItemOrder( "Extra Item", 1, 1.00 );
        list.add( extraItem );
        Assertions.assertEquals( 10, list.getSize( ) );

        // delta - the maximum delta between expected and actual
        // for which both numbers are still considered equal.
        Assertions.assertEquals( 10.00, list.getTotalCost( ), 0.01 );
    }

    @Test
    public void testGetTotalCostNegativeCost( ) {
        GroceryList list = new GroceryList( );
        GroceryItemOrder item = new GroceryItemOrder( "Milk", 2, -2.50 );
        list.add( item );
        Assertions.assertEquals( 0.00, list.getTotalCost( ), 0.01 );
    }

    @Test
    public void testToString() {
        GroceryList list = new GroceryList( );
        GroceryItemOrder item1 = new GroceryItemOrder("Item 1", 2, 3.5);
        GroceryItemOrder item2 = new GroceryItemOrder("Item 2", 1, 2.0);

        list.add(item1);
        list.add(item2);

        String expected = "GroceryList{items=[GroceryItemOrder{name='Item 1', quantity=2, pricePerUnit=3.5, cost=7.0}, GroceryItemOrder{name='Item 2', quantity=1, pricePerUnit=2.0, cost=2.0}], size=2}";
        Assertions.assertEquals(expected, list.toString());
    }
}