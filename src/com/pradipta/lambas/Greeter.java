package com.pradipta.lambas;

public class Greeter {
    public void greet(MyLambda greeting) {
        //System.out.println("In method");
        System.out.println(greeting.sum(5,6));
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        //greeter.greet(new HelloWorldGreeting());
        MyLambda lambda = (int a, int b) -> a+b;
        greeter.greet(lambda);
    }
}
