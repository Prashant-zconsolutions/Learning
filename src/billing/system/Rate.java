package billing.system;



public class Rate {

    private Integer id;
    private String usertype;
    private Integer price;
    private Integer min;
    private Integer max;

    public Rate(Integer id, String usertype, Integer price, Integer min, Integer max) {
        this.id = id;
        this.usertype = usertype;
        this.price = price;
        this.min = min;
        this.max = max;
    }

    public Rate() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
