package com.example.task1.Data_Refrance;

import java.util.ArrayList;

public class Pojo {
    public ArrayList<Class_model> myNumbers()    {
        ArrayList<Class_model> strings = new ArrayList<>();
        Class_model name=new Class_model("0","ahmed");
        Class_model name1=new Class_model("1","mohamed");
        Class_model name2=new Class_model("2","omar");
        Class_model name3=new Class_model("3","mahmoud");
        Class_model name4=new Class_model("4","mostafa");
        strings.add(name);
        strings.add(name1);
        strings.add(name2);
        strings.add(name3);
        strings.add(name4);
        return strings;
    }
}
