package Day_4.Banking_Application;

// class PrintTable{
//     public synchronized void showTable(int num){
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i*num);
//             try {
//                 Thread.sleep(500);
//             } catch (Exception e) {
//                 System.out.println("Some error occurred !!");
//             }
//         }
//         System.out.println("Table of " + num + " is completely printed");
//     }
// }

// class FirstThread extends Thread{
//     PrintTable t;
//     FirstThread(PrintTable t){
//         this.t = t;
//     }
//     public void run(){
//         // System.out.println("I am the method of thread maker");
//         t.showTable(2);
//     }
// }

// class SecondThread extends Thread{
//     PrintTable t;
//     SecondThread(PrintTable t){
//         this.t = t;
//     }
//     public void run(){
//         // System.out.println("I am the method of thread maker");
//         t.showTable(5);
//     }
// }

class BankOperations{
    public void Deposit(int num){
        // System.out.println("I am the deposit method in bank work");
        try {
            System.out.println(num + " is going to be deposited ...");
            Thread.sleep(500);
            System.out.println("The process of deposit is going on .... Processing ... Please wait");
            Thread.sleep(500);
            System.out.println("Your amount is successfully deposited !!");
        } catch (Exception e) {
            System.out.println("Some error is caught at the end !!");
        }
    }

    public void Withdraw(int num){
        // System.out.println("I am the withdraw method in bank work");
        try {
            System.out.println(num + " is going to withdraw ...");
            Thread.sleep(500);
            System.out.println("The process of withdraw money is going on .... Processing ... Please wait");
            Thread.sleep(500);
            System.out.println("Your amount is successfully withdrawn !!");
        } catch (Exception e) {
            System.out.println("Some error is caught at the end !!");
        }
    }

    public void CheckBalance(int num){
        // System.out.println("I am the check balance method in bank work");
        try {
            System.out.println("Going to server for checking the balance");
            Thread.sleep(500);
            System.out.println(num + " is your current balance");
            Thread.sleep(500);
            System.out.println("Thank you for using our online services... !!");
        } catch (Exception e) {
            System.out.println("Some error caught the server side !!");
        }
    }

    public void PrintStatement(){
        // System.out.println("I am the print statement method in bank work");
        try {
            System.out.println("Going to server for checking the statement");
            Thread.sleep(500);
            for (int i = 0; i < 10; i++) {
                System.out.println("ICICI stat - " + i+1);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println("Some unexpected error is caught in the server side");
                }
            }
            System.out.println("Thank you for the visit at our online services");

        } catch (Exception e) {
            System.out.println("Some error caught the server side !!");
        }
    }
}

class DepositThread extends Thread{
    BankOperations bo;
    DepositThread(BankOperations bo){
        this.bo = bo;
    }

    public void run(){
        bo.Deposit(5000);
    }
}

class WithdrawThread extends Thread{
    BankOperations bo;
    WithdrawThread(BankOperations bo){
        this.bo = bo;
    }

    public void run(){
        bo.Withdraw(2000);
    }
}

class CheckBalanceThread extends Thread{
    BankOperations bo;
    CheckBalanceThread(BankOperations bo){
        this.bo = bo;
    }

    public void run(){
        bo.CheckBalance(50000);
    }
}

class PrintStatementThread extends Thread{
    BankOperations bo;
    PrintStatementThread(BankOperations bo){
        this.bo = bo;
    }

    public void run(){
        bo.PrintStatement();
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("Program illustrating banking application using multithreading");
        // PrintTable obj = new PrintTable();
        // FirstThread thread1 = new FirstThread(obj);
        // SecondThread thread2 = new SecondThread(obj);
        // thread1.start();
        // thread2.start();
        BankOperations bo = new BankOperations();
        DepositThread dthread = new DepositThread(bo);
        WithdrawThread wthread = new WithdrawThread(bo);
        CheckBalanceThread cthread = new CheckBalanceThread(bo);
        dthread.start();
    }
}

