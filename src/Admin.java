public class Admin {

    public static void displayStatistics()
    {
        System.out.println("Welcome Admin \nThe following statistics of Supershine are as follow: ");
        System.out.println("Total money earned: " + WashMenu.statistics.getMoney() + " DKK");
        System.out.println("Total amount of Discount: " + WashMenu.statistics.getUserDiscount());
        System.out.println("Total amount of washes: " + WashMenu.statistics.getTotalWashes());
        System.out.println("Amount of Economy washes: " + WashMenu.statistics.getAmountOfWashes(WashMenu.economy));
        System.out.println("Amount of Standard washes: " + WashMenu.statistics.getAmountOfWashes(WashMenu.standard));
        System.out.println("Amount of De Luxe washes: " + WashMenu.statistics.getAmountOfWashes(WashMenu.de_Luxe));
    }
}
