
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryuu
 */
public class MinMaxAccount extends BankingAccount {

    //declare member variable
    private int min; //18000
    private int max; //23000

    //constructor

    public MinMaxAccount() {
    }
    
    public MinMaxAccount(Startup s) {
        super(s);
        this.min = s.startup_getBalance();
        this.max = s.startup_getBalance();
    }
    
    //2000
    @Override
    public void debit(Debit d){
        super.debit(d);
        update();
    }
    
    @Override
    public void credit(Credit c){
        super.credit(c); //2000
        update();
    }
    
    public void update(){
        //23000 > 
        int balance = getBalance();
        if(balance < min){
            min = balance;
        }else if(balance > max){
            max = balance;
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    
}
