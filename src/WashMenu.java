import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WashMenu {
    public static int activeUser;
    public static Statistics statistics = new Statistics(); //instans af klassen Statistics er oprettet
    public static ArrayList<UserAccount> Accounts = new ArrayList<>();
    static WashType economy = new WashType("Economy ",50,Duration.ofMinutes(10),true); //Vi opretter de tre forskellige vasketyper
    static WashType standard = new WashType("Standard ",80,Duration.ofMinutes(15),true);
    static WashType de_Luxe = new WashType("De Luxe ",120,Duration.ofMinutes(20),false);

    public static void displayMenu() {
        System.out.println("Welcome to SuperShine Carwash - the best in the town");
        System.out.println("Choose one of the following options: ");
        System.out.println("1. Wash car");
        System.out.println("2. Check account balance");
        System.out.println("3. Refill account balance");
        System.out.println("4. End service");

        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        switch(in)
        {
            case 1: displayWashTypes();
                break;
            case 2: System.out.println(Accounts.get(activeUser).GetAccountBalance());
            displayMenu();
                break;
            case 3: refill();
                break;
            case 4: endService();
                break;
            default:
                System.out.println("Invalid input");
                displayMenu();
                break;
        }

    }
    private static void displayWashTypes(){
        System.out.println("Choose one of the following options:");
        System.out.println("1. " + economy.name + "price: " + economy.getPrice() + " estimated time: " + economy.time.toMinutes() + " Minutes");
        System.out.println("2. " + standard.name + "price: " + standard.getPrice() + " estimated time: " + standard.time.toMinutes() + " Minutes");
        System.out.println("3. " + de_Luxe.name + "price: " + de_Luxe.getPrice() + " estimated time: " + de_Luxe.time.toMinutes() + " Minutes");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a){
            case 1: initiateWash(economy);
                break;
            case 2: initiateWash(standard);
                break;
            case 3: initiateWash(de_Luxe);
                break;
        }
    }
    private static void refill(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter from 200DKK to 1000DKK the amount you would like to refill");
        float a = input.nextFloat();
        if (a>=200 && a<=1000){
            Accounts.get(activeUser).ChangeAccountBalance(a);
            displayMenu();

        }else{System.out.println("Invalid amount, please try again");
        refill();
        }

    }
    private static void initiateWash(WashType washType) {
        if(washType.getPrice() < Accounts.get(activeUser).GetAccountBalance()){
            Accounts.get(activeUser).ChangeAccountBalance(-washType.getPrice());
            washType.addToCompletedWashList();
            System.out.println("Your wash is now starting, it will be done in " + washType.time.toMinutes() + " Minutes.");
            endService();
            try {
                TimeUnit.MINUTES.sleep(washType.time.toMinutes());
            } catch (InterruptedException e) {} //Bliver ikke brugt til noget, men den skal være
        } else {
            System.out.println("Insufficient amounts, please refill your WashCard");
            displayMenu();
        }
    }
    private static void endService(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like a receipt? \nEnter yes or no");

        String a = input.nextLine();
        if (a.equals("yes")){System.out.println("Thank you for your visit \nYour current account balance is: " + Accounts.get(activeUser).GetAccountBalance());} //print

    }
    private static void addDummyData(){
        statistics.listOfCompletedWashes.add(new CompletedWash(economy));
        statistics.listOfCompletedWashes.add(new CompletedWash(economy));
        statistics.listOfCompletedWashes.add(new CompletedWash(de_Luxe));
        statistics.listOfCompletedWashes.add(new CompletedWash(standard));
        statistics.listOfCompletedWashes.add(new CompletedWash(economy));
        //vi bruger Arraylist'en fra klassen Statistics som hedder "listOfCompletedWashses" og tilføjer "dummy data"
        Accounts.add(new UserAccount(00, 000, 0));
        Accounts.add(new UserAccount(01,123, 50));
        Accounts.add(new UserAccount(02, 123, 999));
        Accounts.add(new UserAccount(03, 12345,500));
        Accounts.add(new UserAccount(04, 222, 214));

    }

    public static void main(String[] args) {
        addDummyData();
        UserAccount.ValidateUser();
        endService();


    }
}
