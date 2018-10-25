import java.time.*;

public class CompletedWash {
    public WashType type;
    public LocalDateTime dateAndTime;
    public boolean discountUsed;
    public float money;

    CompletedWash(WashType type){
        this.type = type;
        this.dateAndTime = LocalDateTime.now();
        this.money = type.getPrice();
        if(dateAndTime.getHour() < 14 && type.earlybird && dateAndTime.getDayOfWeek() != DayOfWeek.SATURDAY && dateAndTime.getDayOfWeek() != DayOfWeek.SUNDAY){
            discountUsed = true;
        } else {
            discountUsed = false;
        }
    }
}
