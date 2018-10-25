import java.time.*;
public class WashMenu {
    private boolean inUse;
    private WashType listOfWashType[];

    public void displayMenu(){}
    public void displayWashTypes(){}
    public void initiateWash(WashType washType){}
    public void endService(){}
    public static Statistics statistics = new Statistics(); //instans af klassen Statistics er oprettet


    public static void main(String[] args) {

        WashType economy = new WashType("Economy",50,Duration.ofMinutes(10),true); //Vi opretter de tre forskellige vasketyper
        WashType standard = new WashType("Standard",80,Duration.ofMinutes(15),true);
        WashType de_Luxe = new WashType("De Luxe",120,Duration.ofMinutes(20),false);

        statistics.listOfCompletedWashes.add(new CompletedWash(economy));
        statistics.listOfCompletedWashes.add(new CompletedWash(economy));
        statistics.listOfCompletedWashes.add(new CompletedWash(de_Luxe));
        statistics.listOfCompletedWashes.add(new CompletedWash(standard));
        statistics.listOfCompletedWashes.add(new CompletedWash(economy));
        //vi bruger Arraylist'en fra klassen Statistics som hedder "listOfCompletedWashses" og tilføjer "dummy data"

        System.out.println(statistics.getTotalWashes());
    }
}
