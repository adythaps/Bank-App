import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password, ball");

        //Create smu users
        String name = sc.nextLine();
        String pass = sc.nextLine();
        double ball = sc.nextDouble();

        HDFCuser hdfcuser = new HDFCuser(name, ball, pass);

        //add amount
        String sms2 = hdfcuser.addMoney(200);
        System.out.println(sms2);

        //withdraw money
        System.out.println("enter the amt");
        int money= sc.nextInt();
        System.out.println("enter pass");
        String enterpass = sc.next();
        System.out.println(hdfcuser.WithdrawMoney(money,enterpass));

        //ROI
        System.out.println("Return on your investment is =>"+hdfcuser.calculateInterest(20));
        System.out.println("hi there");
    }
}