package buildermethod.customer;

import customerpkg.CustomerVIP;

public class CustomerDirector {
    public void construct(VIPCustomerBuilder vipBuilder,String id, String name, String add, String phone, String idCard){
        vipBuilder.buildId(id);
        vipBuilder.buildName(name);
        vipBuilder.buildAddress(add);
        vipBuilder.buildPhone(phone);
        vipBuilder.buildIdCard(idCard);
    }
}
