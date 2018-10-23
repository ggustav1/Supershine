import java.time.*;

public class WashType {
    public String name;
    private float price;
    public Duration time; //Duration er en klasse inde i java.time (Importeret)
    public boolean earlybird;

    public WashType(String name, float price, Duration time, boolean earlybird) {
        this.name = name;
        this.price = price;
        this.time = time;
        this.earlybird = earlybird;
    }

    public float getPrice() {
        //if(earlybird && )
        return price;
    }

    public void addToCompletedWashList() {

    }
}
