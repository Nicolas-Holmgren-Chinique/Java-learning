class Account {
    // these are the instance variables
    private String name;
    private double balance;

    // this is a constructor fo the class

    public Account(String userName, double balance) {
        this.name = userName;

        // Validate that the balance is greater than 0.0 if it isn't
        // instance variable balance keeps its default initial value 0.0

        if(balance > 0.0) { //if the balance is valid 
            this.balance = balance; //assign it to the instance var balance
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { //if depositAmount is valid 
            this.balance = balance + depositAmount; //assign to instance var balance
        }
    }

    // set the name this will allow the user to set the name of their account
    public void setName(String userName) {
        this.name = userName;
    }

    // this will 
    public String getName() {
        return this.name;
    }

}