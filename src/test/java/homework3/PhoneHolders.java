package homework3;

import java.util.Objects;

public class PhoneHolders {
private String  name;
private int phone;
    public PhoneHolders(){}
    public PhoneHolders(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }



    @Override
    public String toString() {
        return "PhoneHolders{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneHolders holders = (PhoneHolders) o;
        return name.equals(holders.name);
    }
}
