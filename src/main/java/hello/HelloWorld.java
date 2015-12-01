package hello;

import org.joda.time.LocalTime;

/**
 * Created by Glacier on 30/11/2015.
 */
public class HelloWorld {
    public static void main(String args[]){
        LocalTime currentTime = new LocalTime();
        System.out.println("The time is:"+currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
