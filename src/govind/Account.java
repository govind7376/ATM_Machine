package govind;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account
{
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private  double savingBalance;


    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat(" '$'  ###,##0.00");

    //    set the  customer number
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber=customerNumber;
        return customerNumber;
    }
    //    get the  customer number
    public int getCustomerNumber() {
        return customerNumber;
    }

    //Set the pinNumber
    public int setPinNumber(int pinNumber)
    {
        this.pinNumber=pinNumber;
        return  pinNumber;
    }
    public int  getPinNumber()
    {
        return  pinNumber;
    }
    //Get  Saving Account Balance
    public double getSavingBalance(){
        return  savingBalance;
    }
    public double getCheckingBalance(){
        return  checkingBalance;
    }
//    Calculate Checking Account withdrawal
    public double calcCheckingWithdraw(double amount)
    {
        checkingBalance=(checkingBalance-amount);
        return  checkingBalance;
    }
    //    Calculate Checking Saving withdrawal
    public double calcCheckingDeposit(double amount)
    {
        checkingBalance=(checkingBalance+amount);
        return  checkingBalance;
    }
    //   Calculate Saving Account withdrawal
    public double calcSavingWithdraw(double amount)
    {
        savingBalance=(savingBalance-amount);
        return  savingBalance;
    }
    //   Calculate Saving Account deposit
    public double calcSavingDeposit(double amount)
    {
        savingBalance=(savingBalance+amount);
        return  savingBalance;
    }

    /*Customer Checking Account Withdraw input */
    public  void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance :"+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount= input.nextDouble();
        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance can not be negative ."+"\n");
        }
    }
    /*Customer Saving Account withdraw input */
    public  void getSavingWithdrawInput(){
        System.out.println("Checking Account Balance :"+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit in  Checking Account: ");
        double amount=input.nextDouble();
        if((savingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance can not be negative ."+"\n");
        }
    }
    /*Customer Checking Account Deposit input */
    public  void getCheckingDepositInput(){
        System.out.println("Checking Account Balance :"+moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit in  Checking Account:  ");
        double amount= input.nextDouble();
        if((savingBalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("New Checking Account Balance: "+moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Balance can not be negative ."+"\n");
        }
    }
    /*Customer Saving Account withdraw input */
    public  void getSavingDepositInput(){
        System.out.println("Checking Account Balance :"+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit in  Checking Account: ");
        double amount=input.nextDouble();
        if((checkingBalance+amount)>=0){
            calcSavingWithdraw(  amount);
            System.out.println("New SavingAccount Balance: "+moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance can not be negative ."+"\n");
        }
    }

}
