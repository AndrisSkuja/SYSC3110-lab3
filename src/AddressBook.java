import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> mylist;


    public AddressBook(ArrayList<BuddyInfo> mylist) {
        this.mylist = mylist;
    }

    public AddressBook() {
        this(new ArrayList<BuddyInfo>());
    }

    public void addBuddy(BuddyInfo newBuddy) {
        mylist.add(newBuddy);
    }

    public BuddyInfo removeBuddy(BuddyInfo oldBuddy) {
        for(int i = 0; i < mylist.size(); i++){
            if (mylist.get(i).equals(oldBuddy)){
                return mylist.remove(i);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println("Address Book");
        AddressBook mybook = new AddressBook();
        BuddyInfo myBuddy = new BuddyInfo("Tom", "dunno", 6);
        mybook.addBuddy(myBuddy);
        mybook.removeBuddy(myBuddy);
    }
}