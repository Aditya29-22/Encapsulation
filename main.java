// Eencapusulation means wrapping up the data (functions, variables) into a single unit.
// It is one of the four fundamental OOP concepts.
// public private protected 
// data security
//code maintainability

// Getters and setters

class BankAccount{
    private int bankbalance;
    
    public void setBalance(int amount) {
        if (amount >= 0) {
            this.bankbalance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }
    
    //getters 
    public int getbalance() {
        return bankbalance;
    }
}

public class main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setBalance(5000);
        System.out.println("Bank balance is: " + myAccount.getbalance());
    }
}