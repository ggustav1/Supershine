import java.time.*;

public class CompletedWash {
    public WashType type;
    public LocalDateTime dateAndTime;
    public boolean discountUsed;

    CompletedWash(WashType type, LocalDateTime date, boolean useOfDiscount){
        this.type = type;
        this.dateAndTime = date;
        this.discountUsed = useOfDiscount;
    }
}
