package govind;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class OptionMenu extends  Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$'  ###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<>();

    /* Validate login information customer number and pinNumber */
    public void getLogin()  {
        int  x = 1;
        do {
            try {
                data.put(123456, 11111);
                data.put(777777, 666666);
                data.put(888888, 101010);
                System.out.println("Welcome to ATM Project !:");

                System.out.print("Enter your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your Pin Number: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid character(s) . only numbers." + "\n");
                x = 2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("\n" + "Wrong Customer Number or PinNumber " + "\n");
        } while (x == 1);
    }

    /* Display Account type with menu Selection */

    public void getAccountType() {
        System.out.println("Select the Account you want to access");
        System.out.println("Type 1 - Checking Account");
        System.out.println(" Type 2 - Saving Account ");
        System.out.println(" Choice: ");

        int selection=menuInput.nextInt();
        switch (selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATM ,bye");
                break;
            default:
                System.out.println("\n" +"Invalid Choice."+"\n");
                getAccountType();
        }
    }

    /*Display checking Account Menu With Selections */
    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Deposit Funds");
        System.out.println("Choice ");
        int selection=menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM bye. ");
                break;

            default:
                System.out.println("\n"+"Invalid Choice ."+"\n");
                getChecking();
        }

    }

    /*Display checking Account Menu With Selections */
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Deposit Funds");
        System.out.println("Choice ");
        int selection=menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Saving Account Balance: "+moneyFormat.format(getSavingBalance()));
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM bye. ");
                break;

            default:
                System.out.println("\n"+"Invalid Choice ."+"\n");
                getChecking();
        }

    }

}
