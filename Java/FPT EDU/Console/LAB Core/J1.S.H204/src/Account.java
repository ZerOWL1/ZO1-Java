/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryuu
 */
public class Account {

    private boolean processCall;

    public Account() {
    }

    public Account(Client c) {
        processCall = false;
    }

    boolean process(Transaction t) {
        processCall = true;
        return t.value() > Integer.MIN_VALUE && t.value() < Integer.MAX_VALUE;
    }

    public class Transaction {

        private int transValue;

        public Transaction(int transValue) {
            this.transValue = transValue;
        }
        
        public int value() {
            return transValue;
        }
    }

    public class Client {
    }
}
