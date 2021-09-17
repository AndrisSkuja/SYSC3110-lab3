import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> mylist;


    public AddressBook(ArrayList<BuddyInfo> mylist) {
        this.mylist = mylist;
    }

    public void addBuddy(BuddyInfo newBuddy){
        mylist.add(newBuddy);
    }

    public BuddyInfo removeBuddy(int index){
        return mylist.remove(index);
    }

}

    public static void main(String[] args) {
        System.out.println("Address Book");
    }