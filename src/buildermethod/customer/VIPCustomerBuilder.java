package buildermethod.customer;

import buildermethod.customer.CustomerBuilder;
import customerpkg.CustomerVIP;

public class VIPCustomerBuilder extends CustomerBuilder {
    private CustomerVIP cusVIP;
    @Override
    public void buildId(String id) {
        cusVIP.setIdCard(id);
    }

    @Override
    public void buildName(String name) {
        cusVIP.setName(name);
    }

    @Override
    public void buildAddress(String address) {
        cusVIP.setAddress(address);
    }

    @Override
    public void buildPhone(String phone) {
        cusVIP.setPhoneNum(phone);
    }

    public void buildIdCard(String idCard){
        cusVIP.setIdCard(idCard);
    }
    public CustomerVIP getCusVIP() {
        return cusVIP;
    }
}
