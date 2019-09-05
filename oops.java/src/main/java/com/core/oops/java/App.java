package com.core.oops.java;

import com.core.daoimple.Daoimple;
import com.core.oops.pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Employee a=new Employee();
        System.out.println( "Hello World!" );
        Daoimple dao=new Daoimple();
        dao.insert();
    }
}
