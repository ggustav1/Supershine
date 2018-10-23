public class WashType {
    public String name;
    private float price;
    public float time;
    public boolean earlybird;

    public WashType(String name, float price, float time, boolean earlybird) {
        this.name = name;
        this.price = price;
        this.time = price;
        this.earlybird = earlybird;
    }

    public float getPrice() {
        // TODO Noget med early bird
        return price;
    }

    public void addToCompletedWashList() {

    }
}
