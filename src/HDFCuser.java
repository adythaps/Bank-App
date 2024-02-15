import java.util.Objects;
import java.util.UUID;

public class HDFCuser implements BankInterface{

    private String name;
    private String acno;
    private double ball;
    private String pass;
    private double roi;

    public HDFCuser(String name, double ball, String pass) {
        this.name = name;
        this.ball = ball;
        this.pass = pass;
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
        return "Balance Remaining"+ball;
    }

    @Override
    public String WithdrawMoney(int amt, String EnteredPass) {
        if(Objects.equals(EnteredPass,pass)){
            if(amt>ball){
                return"not enough money";
            }
            else{
                ball=ball-amt;
                return"New ball = "+ball;
            }
        }
        else{
            return "Wrong pass";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (ball*years*roi)/100;
    }
}
