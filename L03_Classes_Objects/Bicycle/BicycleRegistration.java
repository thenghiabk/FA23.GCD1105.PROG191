package L03_Classes_Objects.Bicycle;

public class BicycleRegistration {

    public static void main ( String[] args ) {
        Bicycle bike1, bike2;
        String owner;

        bike1 = new Bicycle();
        System.out.println(bike1.getOwnerName());
        System.out.println(bike1.getYear());

    }
}
