package L03_Classes_Objects.CallByReference;

public class LibraryCard {
    private Student owner;
    private int borrowCnt;

    public void setOwner( Student owner ) {
        this.owner = owner;
    }

    public void checkOut(){
        System.out.println("Bye " + owner.getName() );
    }
}
