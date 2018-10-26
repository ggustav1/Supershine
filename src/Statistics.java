import java.util.ArrayList;

public class Statistics {
    public ArrayList<CompletedWash> listOfCompletedWashes = new ArrayList<CompletedWash>();

    public float getMoney() {
        float i = 0;
        for (int j = 0; j < listOfCompletedWashes.size(); j++) { // Kører listofcompletetedwashes igennem linje for linje.
            i += listOfCompletedWashes.get(j).money;
        }
        return i;

    }

    public int getUserDiscount() {
        int i = 0;
        for (int j = 0; j < listOfCompletedWashes.size(); j++){ // Kører listofcompletetedwashes igennem linje for linje.
            if (listOfCompletedWashes.get(j).discountUsed)  //hvis discountused er true, tæller den med.
            {
                i++;
            }
        }
        return i;
    }

    public int getTotalWashes() {
        return listOfCompletedWashes.size(); // finder størrelsen på listen
    }

    public int getAmountOfWashes(WashType washtype) {
        int i = 0;
        for (int j = 0; j < listOfCompletedWashes.size(); j++){ // Kører listofcompletetedwashes igennem linje for linje.
            if (listOfCompletedWashes.get(j).type == washtype) {
                i++;
            }
        }
        return i;
    }

}
