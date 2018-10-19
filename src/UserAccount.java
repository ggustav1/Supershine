public class UserAccount {
    private int ID = 1;
    private int PIN = 1234;
    private float AccountBalance;

    public boolean ValidateUser(int id, int pin){
        return id == ID && pin == PIN;
    }

    public float GetAccountBalance(){
        return AccountBalance;
    }

    public void ChangeAccountBalance(float BalanceChange){
        AccountBalance += BalanceChange;
    }

}
