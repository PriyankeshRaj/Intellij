package com.company;

public class VipCustomer {
    private String name;
    private long creditlimit;
    private String emailaddress;

    public VipCustomer(){
        this("TimBuchalka",999999l,"abc@email.com");
    }

    public VipCustomer(String name,long creditlimit){
        this(name,creditlimit,"abc@email.com");
    }

    public VipCustomer(String name, long creditlimit, String emailaddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    public long getCreditlimit() {
        return creditlimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}
