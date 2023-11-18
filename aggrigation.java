package JAVA;

class Address {
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}
 class Emp {
     int id;
     String name;
     Address address;

     public Emp(int id, String name, Address address) {
         this.id = id;
         this.name = name;
         this.address = address;
     }

     void display() {
         System.out.println(id + " " + name + " " + address.city + " " + address.state + " " + address.country);
     }
 }

    public class aggrigation {
        public static void main(String[] args) {
            Address address1=new Address("Surat","Guj","india");
            Address address2=new Address("Bvn","Guj","india");

            Emp e=new Emp(11,"Tina",address1);
            Emp e2=new Emp(12,"Mina",address2);

            e.display();
            e2.display();
        }
}
