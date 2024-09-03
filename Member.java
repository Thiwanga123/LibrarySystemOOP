public class Member {
    String membreID;
    String address;
    String name;
    String phoneNumber;

    Member(String memberID,String name, String address, String phonenumber){
        this.membreID=memberID;
        this.name=name;
        this.address=address;
        this.phoneNumber=phonenumber;
    }


    @Override
   public String toString() {
   return "MemberID: " + memberID + ", Name: " + name + ", Address: " + address + ",
    Phone: " + phoneNumber;

}
