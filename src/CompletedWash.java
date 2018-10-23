import java.time.*;

public class CompletedWash {
    private WashType type;
    private LocalDateTime dateAndTime;
    private boolean discountUsed;

    CompletedWash(WashType type, LocalDateTime date, boolean useOfDiscount){
        this.type = type;
        this.dateAndTime = date;
        this.discountUsed = useOfDiscount;
    }
}
