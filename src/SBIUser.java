import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    private String name;
    private String acno;
    private double ball;
    private String pass;
    private double roi;

        public SBIUser(String name, double ball, String pass) {
        //user initialised
        this.name = name;
        this.ball = ball;
        this.pass = pass;

        //bank is initialising it
        this.roi = 6.5;
        this.acno = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public double getBall() {
        return ball;
    }

    public void setBall(double ball) {
        this.ball = ball;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    @Override
    public double checkBall() {

        return this.ball;
    }

    @Override
    public String addMoney(int amt) {
        ball = ball + amt;
        return"paisa he paisa"+ball;
    }

    @Override
    public String WithdrawMoney(int amt, String enteredpassword)
    {
        if(Objects.equals(enteredpassword,pass))
        {
                if(amt>ball)
                {
                    return "no money";
                }
                else
                {
                    ball = ball-amt;
                    return "lots of money";
                }
        }
        else
        {
            return "Wrong pass" ;
        }

    }

    @Override
    public double calculateInterest(int years) {
        return (ball*years*roi)/100;
    }
}
