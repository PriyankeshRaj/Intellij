package com.priyankesh;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private String phone_number;

    public Contacts(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public static Contacts createContacts(String name,String phone_number)
    {
        return new Contacts(name,phone_number);
    }
}
