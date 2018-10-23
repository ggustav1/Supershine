public class Admin {

    private String ID;
    private int PIN;

    public boolean validateUser (String id, int pin)
    {
        if(id == ID && pin == PIN)
        {
            return true;
        }
        else {
            return false;
         }
    }
    public void displayStatistics()
    {

    }



}
