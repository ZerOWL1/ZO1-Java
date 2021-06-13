/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Ryuu
 */
public class Admin {
    private String acc;
    private int passwords;

    public Admin() {
    }

    public Admin(String acc, int passwords) {
        this.acc = acc;
        this.passwords = passwords;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public int getPasswords() {
        return passwords;
    }

    public void setPasswords(int passwords) {
        this.passwords = passwords;
    }

    @Override
    public String toString() {
        return "Admin{" + "acc=" + acc + ", passwords=" + passwords + '}';
    }
    
}
