import java.util.Scanner;

public class UserAccount {
    private int ID;
    private int PIN;
    private float AccountBalance;

    private boolean CheckPIN(int pin) {
        return this.PIN == pin;
    }

    public static void ValidateUser() {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your user ID please : ");
            int inID = input.nextInt();
            System.out.println("Enter your PIN please: ");
            int inPIN = input.nextInt();
            if (inID == 00 && inPIN == 000) {
                Admin.displayStatistics();
            } else {
                WashMenu.activeUser = inID;
                if (WashMenu.Accounts.get(inID).CheckPIN(inPIN)) {
                    WashMenu.displayMenu();
                }
            }
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
