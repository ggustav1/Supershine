import java.time.*;

public class WashType {
    public String name;
    private float price;
    public Duration time;
    public boolean earlybird;

    public WashType(String name, float price, Duration time, boolean earlybird) {
        this.name = name;
        this.price = price;
        this.time = time;
        this.earlybird = earlybird;
    }

    public float getPrice() {
        // TODO Noget med early bird
        return price;
    }

    public void addToCompletedWashList() {

    }
}
