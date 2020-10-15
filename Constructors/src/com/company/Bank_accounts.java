package com.company;



public class Bank_accounts {
    private String account_no;
    private long balance;
    private String customer_name;
    private String email;
    private long phone_number;

    public Bank_accounts(){
        this("10102a",897689l,"ABCPINKA","uitixr@fv.com",7897097900l);
        //Constructor inside a constructor.
        System.out.println("Empty Constructor Called");
    }

    public Bank_accounts(String account_no,long balance,String customer_name,String email,long phone_number){
        System.out.println("Parameterized constructor called");
        this.account_no=account_no;
        this.balance=balance;
        this.customer_name=customer_name;
        this.email=email;
        this.phone_number=phone_number;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void deposit(long amt){
        balance+=amt;
        System.out.println("New Balance="+balance+"Amount deposited="+amt);
    }

    public void withdraw(long amt){
        if(balance>=amt) {
            balance -= amt;
            System.out.println("New Balance="+balance+"Amount withdrawn="+amt);
        }
        else
            System.out.println("Insufficient funds");
    }

}
