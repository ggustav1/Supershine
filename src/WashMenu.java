public class WashMenu {
    public static UserAccount UA;

    public static void main(String[] args) {
        System.out.println("Car Wash!");
        System.out.println("Fuck bitches");
        //Get Money!

        UA = new UserAccount();

        System.out.println(UA.ValidateUser(1, 1234));
        System.out.println(UA.ValidateUser(2, 1235));
    }
}
