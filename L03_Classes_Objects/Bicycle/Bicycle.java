package L03_Classes_Objects.Bicycle;

public class Bicycle {
    private String ownerName;
    public String year;
    private int price;

    // Assigns the name of this bicycle's owner
    public void setOwnerName ( String ownerName ) {
        this.ownerName = ownerName;
    }




    public Bicycle ( ) {
        ownerName = "Unknown";
        year = "2000";
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public Bicycle (String owner, int price ) {
        this.setOwnerName( owner );
        this.setPrice( price );
    }

    public void setPrice ( int price ) {
        this.price = price;
    }




    public String getOwnerName(){
        return ownerName;
    }


}
