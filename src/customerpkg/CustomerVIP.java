package customerpkg;

public class CustomerVIP extends Customer{
    private String idCard;

    public CustomerVIP() {
    }

    public CustomerVIP(String idCus, String name, String address, String phoneNum, String idCard) {
        super(idCus, name, address, phoneNum);
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
