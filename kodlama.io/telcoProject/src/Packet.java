import java.util.List;

public class Packet {
    private int id;
    private String name;
    private String detail;
    private double price;
    private int packageValidityPeriod;
    private List<Subscription> subscriptions;

    public Packet() {
    }

    public Packet(int id, String name, String detail, double price, int packageValidityPeriod, List<Subscription> subscriptions) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.packageValidityPeriod = packageValidityPeriod;
        this.subscriptions = subscriptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPackageValidityPeriod() {
        return packageValidityPeriod;
    }

    public void setPackageValidityPeriod(int packageValidityPeriod) {
        this.packageValidityPeriod = packageValidityPeriod;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
