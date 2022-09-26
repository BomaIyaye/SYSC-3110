import java.util.ArrayList;
//BomaIyaye 101197140

public class AddressBook {
    public ArrayList<BuddyInfo> addBook;

    public AddressBook() {
        addBook = new ArrayList<>();
    }

    public void addBuddy(String name, String address, int phoneNum){
        addBook.add(new BuddyInfo(name,address,phoneNum));
    }


    public void removeBuddy(int index){
        addBook.remove(index);
    }


    public static void main(String[] args) {
        AddressBook book=new AddressBook();
        book.addBuddy("halland","manchester city england",818);
        book.removeBuddy(0);

    }


}
