package com.basics;

public class CreatingLambdas {
    interface Greeting{
        public String sayHello(String string);
    }
    public void testGreeting(String a,Greeting g){
        String result = g.sayHello(a);
        System.out.println("Result: "+result);
    }

    public static void main(String[] args) {

        new CreatingLambdas().testGreeting("John",(String s)->"Hello "+s);
        new CreatingLambdas().testGreeting("",(String p)->!p.isEmpty()?"Hello "+p:"String is missing");
    }

}
