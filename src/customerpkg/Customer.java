package customerpkg;

public class Customer {
    protected String idCus;
    protected String name;
    protected String address;
    protected String phoneNum;

    public Customer() {
    }

    public Customer(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public Customer(String idCus, String name, String address, String phoneNum) {
        this.idCus = idCus;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getIdCus() {
        return idCus;
    }

    public void setIdCus(String idCus) {
        this.idCus = idCus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
