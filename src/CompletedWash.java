import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class CompletedWash {
    public WashType type;
    public LocalDateTime dateAndTime;
    public boolean discountUsed;
    public float money;

    public CompletedWash(WashType type){
        this.type = type;
        this.dateAndTime = LocalDateTime.now();
        this.money = type.getPrice();
        discountUsed = dateAndTime.getHour() < 14 && type.earlybird && dateAndTime.getDayOfWeek() != DayOfWeek.SATURDAY && dateAndTime.getDayOfWeek() != DayOfWeek.SUNDAY;
    }
}
