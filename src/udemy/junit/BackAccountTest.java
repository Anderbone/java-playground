package udemy.junit;

import static org.junit.Assert.*;

public class BackAccountTest {

    @org.junit.Test
    public void getBalance_deposit() {
        BackAccount account = new BackAccount("tim", "Tom", 1000);
        double balance = account.deposit(200, true);
        assertEquals(1200, account.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BackAccount account = new BackAccount("tim", "Tom", 1000);
        account.withdraw(200, true);
        assertEquals(800, account.getBalance(),0);
    }

    @org.junit.Test
    public void deposit() {
        BackAccount account = new BackAccount("tim", "Tom", 1000);
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
    }

}
