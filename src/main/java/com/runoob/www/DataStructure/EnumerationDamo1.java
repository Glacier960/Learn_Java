package com.runoob.www.DataStructure;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Enumeration;


/**
 * Enumeration  有两个方法1.hasMoreElements(),返回boolean  2.nextElement() 返回下一个元素
 * Vector       实现了一个动态数组.同步访问,包含许多传统方法,这些方法不属于集合框架
 */

/**
 * Created by Glacier on 1/12/2015.
 */
public class EnumerationDamo1 {
    public static void main(String args[]){
        Enumeration days;
        Vector dayNames = new Vector();
/*
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");

        List<String> list = new ArrayList<String>();*/
        String[] str = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //     Vector daynames = new Vector(str);


        for(int i=0;i<str.length;i++){
            dayNames.add(str[i]);
        }


        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        for(int i = 0;i < dayNames.size(); i++){
            String value = dayNames.get(i).toString();

            System.out.println(value);
        }

    }


}
