/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryuu
 */
//BankingAccount
public class BankingAccount {
    //18000 + 5000 = 23000
    private int balance;

    public BankingAccount() {
    }

    //constructor
    public BankingAccount(Startup s) {
        this.balance = s.startup_getBalance();
    }

    //records the given debit
    public void debit(Debit d) {
        balance -= d.debit_getBalance();
    }

    //records the given credit
    public void credit(Credit c) {
        balance += c.credit_getBalance();
    }

    //returns current balance in pennies
    public int getBalance() {
        return balance;
    }
//
//    public BankingAccount(int balance) {
//        this.balance = balance;
//    }

    //define starup class
    public class Startup {

        private int balance;

        public Startup(int balance) {
            this.balance = balance;
        }

        public int startup_getBalance() {
            return balance;
        }
    }

    //define debit class
    public class Debit {

        private int balance;

        public Debit(int balance) {
            this.balance = balance;
        }

        public int debit_getBalance() {
            return balance;
        }
    }

    //define credit class
    public class Credit {

        private int balance;

        public Credit(int balance) {
            this.balance = balance;
        }

        public int credit_getBalance() {
            return balance;
        }
    }

}
