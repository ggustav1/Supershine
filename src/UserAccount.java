public class UserAccount {
    private int ID;
    private int PIN;
    private float AccountBalance;

    public boolean ValidateUser(int id, int pin){
        if(id == ID && pin == PIN){
            return true;
        } else  {
            return false;
        }
    }

    public float GetAccountBalance(){
        return AccountBalance;
    }

    public void ChangeAccountBalance(float BalanceChange){
        AccountBalance += BalanceChange;
    }

}
