package homework3;

import java.util.ArrayList;

public class Phones {
   ArrayList<PhoneHolders> holders = new ArrayList<PhoneHolders>();

   public void add(String name, int phone) {
      holders.add(new PhoneHolders(name, phone));
   }

   public void get(String name) {
      for (int i = 0; i < this.holders.size(); i++) {
         if (this.holders.get(i).getName().equals(name)) {
            System.out.println(this.holders.get(i).getName() + ": " + this.holders.get(i).getPhone());
         }
      }
   }

   @Override
   public String toString() {
      return "Phones{" +
              "holders=" + holders +
              '}';
   }
}
