import java.util.Scanner;

public class UserAccount {
    private int ID;
    private int PIN;
    private float AccountBalance;

    private boolean CheckPIN(int pin) {
        return this.PIN == pin;
    }

    public static void ValidateUser() {
        System.out.println("*********************************");
        System.out.println("* Welcome to SuperShine CarWash *");
        System.out.println("*********************************");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("ID please: ");
            int inID = input.nextInt();
            System.out.println("PIN please: ");
            int inPIN = input.nextInt();
            if (inID == 00 && inPIN == 000) {
                Admin.displayStatistics();
            } else {
                if (WashMenu.Accounts.get(inID).CheckPIN(inPIN)) {
                    WashMenu.activeUser = inID;
                    WashMenu.displayMenu();
                    break;
                } else {
                    System.out.println("* Invalid Login, try again *");
                }
            }
        }


    }

    public float GetAccountBalance() {
        return AccountBalance;
    } //Intet behov for denne funktion, oprettet da vi planlagde at bruge en txt fil til at holde UserAccount data

    public void ChangeAccountBalance(float BalanceChange)
    {
        AccountBalance += BalanceChange;
    }

    public UserAccount(int id, int pin, float accountBalance) {
        this.ID=id;
        this.PIN=pin;
        this.AccountBalance=accountBalance;
    }
}
