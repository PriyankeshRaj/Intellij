package com.priyankesh;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE,0);
        System.out.println(cal.getTime());
        SimpleDateFormat format1=new SimpleDateFormat("dd-MM-yyyy");
        String formatted=format1.format(cal.getTime());
        System.out.println(formatted);
    }
}
