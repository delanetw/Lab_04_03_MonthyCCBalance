public class Main
{
    public static void main(String[] args)
    {
        double interest = .17;
        System.out.println("Enter your credit card balance: ");
        double balance = 5000;

        double balInt = balance * interest;
        double oneMon = balance + balInt;
        double balIntTwo = oneMon * interest;
        double twoMon = oneMon + balIntTwo;
        System.out.println("Your balance after one month is: " + oneMon + ", and your balance after two months is: " + twoMon);

    }
}