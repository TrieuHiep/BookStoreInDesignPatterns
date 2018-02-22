package buildermethod.customer;

public abstract class CustomerBuilder {
    abstract public void buildId(String id);
    abstract public void buildName(String name);
    abstract public void buildAddress(String address);
    abstract public void buildPhone(String phone);

}
