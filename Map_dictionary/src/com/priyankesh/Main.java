package com.priyankesh;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	//English to Hinglish dictionary
        //Map is a type of interface and HashMap is a type of Map.
        Map<String,String> eng_to_hindi=new HashMap<String,String>();
        //Putting things inside dictionary
        eng_to_hindi.put("Monday","Somwar");
        eng_to_hindi.put("Tuesday","Mangalwar");
        eng_to_hindi.put("Wednesday","Buddhwar");
        eng_to_hindi.put("Thursday","Guruwar");
        eng_to_hindi.put("Friday","Shukrawar");
        eng_to_hindi.put("Saturday","Saniwar");
        eng_to_hindi.put("Sunday","Ravivar");
        //Retrieve things from dictionary
        System.out.println(eng_to_hindi.get("Monday"));
        System.out.println(eng_to_hindi.get("Tuesday"));
        System.out.println(eng_to_hindi.get("Wednesday"));
        System.out.println(eng_to_hindi.get("Thursday"));
        System.out.println(eng_to_hindi.get("Friday"));
        System.out.println(eng_to_hindi.get("Saturday"));
        System.out.println(eng_to_hindi.get("Sunday"));
        System.out.println(eng_to_hindi.get("123"));
        //Print out all keys
        System.out.println(eng_to_hindi.keySet());
        //Print out all values
        System.out.println(eng_to_hindi.values());
        //These above printed values & keys will not in the same order as we printed them but the Keys and Values are printed correspnding to each other.
        System.out.println("The size of our ditionary is "+ eng_to_hindi.size());

        //Shopping List
        //boolean isn't big enough..there is no pointer to it... no reference to it. So we use 'Boolean'
        //which makes it referenced to it..it makes it an object
        //So we does not need to worry about the primitive type 'boolean' with values 'true' and 'false'
        Map<String,Boolean> Shopping_list=new HashMap<String,Boolean>();
        //Put some stuff in dictionary
        Shopping_list.put("Egg",Boolean.TRUE);
        //Boolean.TRUE means the primitive value of boolean that is true ...Same is for Boolean.FALSE
        Shopping_list.put("Chicken",Boolean.TRUE);
        Shopping_list.put("Meat",Boolean.FALSE);
        Shopping_list.put("Chalk",Boolean.FALSE);
        Shopping_list.put("Pen",Boolean.TRUE);
        Shopping_list.put("Books",Boolean.TRUE);
        //Retrieving stuffs
        System.out.println(Shopping_list.get("Chicken"));
        System.out.println(Shopping_list.get("Chalk"));
        //Key-Value Pairs print out
        System.out.println(Shopping_list.toString());
        System.out.println(Shopping_list.isEmpty());
        //Remove things
        Shopping_list.remove("Pen");
        //Replace things
        Shopping_list.replace("Chalk",Boolean.TRUE);
        System.out.println(Shopping_list.toString());
        //Clears our dictionary
        Shopping_list.clear();
        System.out.println(Shopping_list.toString());
        //Is Empty?
        System.out.println(Shopping_list.isEmpty());
    }
}
