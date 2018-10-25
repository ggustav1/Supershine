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

    public float getPrice()
    {
        LocalDateTime dateAndTime = LocalDateTime.now(); // now bruger vi fordi den er static. derfor behøver vi ikke bruge new

        if(dateAndTime.getHour() < 14 && earlybird && dateAndTime.getDayOfWeek() != DayOfWeek.SATURDAY && dateAndTime.getDayOfWeek() != DayOfWeek.SUNDAY){
            return price * 0.8f;
        }
        else
            {
            return price;
            }

    }

    public void addToCompletedWashList()
    {
        WashMenu.statistics.listOfCompletedWashes.add(new CompletedWash(this)); // "this" referere til sig selv og tager alt med fra klassen washtype.
    }
}
