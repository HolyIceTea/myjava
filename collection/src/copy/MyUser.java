package copy;

import java.util.Objects;

public class MyUser {
   private String firstName;
    private String lastName;
    private Address address;
    
    public MyUser() {;}
    
    public MyUser(MyUser user) {
       this(user.getFirstName(), user.getLastName(), new Address(user.getAddress()));
    }

   public MyUser(String firstName, String lastName, Address address) {
      super();
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   @Override
   public String toString() {
      return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(firstName, lastName);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      MyUser other = (MyUser) obj;
      return firstName.equals(other.firstName) && lastName.equals(other.lastName);
   }
}













