import java.util.ArrayList;

public class Statistics {
    public ArrayList<CompletedWash> listOfCompletedWashes = new ArrayList<CompletedWash>();

    public float getMoney() {
        return 1;
    }

    public int getUserDiscount() {
        return 2;
    }

    public int getTotalWashes() {
        return 3;
    }

    public int getAmountOfWashes(WashType washtype) {
        int i = 0;
        for (int j = 0; j < listOfCompletedWashes.size(); j++){ // Kører listofcompletetedwashes igennem linje for linje.
        if (listOfCompletedWashes.get(j).type == washtype)
        {
        i++;
        }

        }
        return i;

        }

}
