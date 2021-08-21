/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryuu
 */
public class FilteredAccount extends Account {

    private int transaction;
    private int zero;

    public FilteredAccount(Client c) {
        super(c);
        zero = 0;
        transaction = 0;
    }

    @Override
    public boolean process(Transaction t) {
        transaction++;
        if (t.value() == 0) {
            zero++;
            return true;
        } else {
            return super.process(t);
        }
    }

    public double percentFiltered() {
        if (transaction == 0) {
            return 0.0;
        }
        return 100 - (((double) zero) * 100 / transaction);
    }
}
