import java.util.ArrayList;

public class UserAccount {
    private int ID;
    private int PIN;
    private float AccountBalance;

    public boolean ValidateUser(int pin){
        if(this.PIN == pin)
        {
            return true;
        }
        else
            {
            return false;
            }
    }

    public float GetAccountBalance()
    {
        return AccountBalance;
    }

    public void ChangeAccountBalance(float BalanceChange)
    {
        AccountBalance += BalanceChange;
    }

    public UserAccount(int id, int pin, float accountBalance)
    {
        this.ID=id;
        this.PIN=pin;
        this.AccountBalance=accountBalance;
    }
}
