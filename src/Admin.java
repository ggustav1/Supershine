<<<<<<< Updated upstream
public class Admin
{
=======
public class Admin {

    private string ID;
    private int PIN;

    public boolean validateUser (string id, int pin)
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

>>>>>>> Stashed changes

}
