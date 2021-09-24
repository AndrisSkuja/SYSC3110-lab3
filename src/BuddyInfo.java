public class BuddyInfo {


    private String address;
    private int number;
    private String name;


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public BuddyInfo(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public BuddyInfo() {
        this("name","address",0);
    }


//test change

    public static void main(String[] args) {
        BuddyInfo test = new BuddyInfo("Homer","idk",6);
        String name = test.getName();
        System.out.println("Hello " + name);
    }
}
