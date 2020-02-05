package com.pradipta.lambas;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void greet(int x) {
        System.out.println("Hello world");
    }
}
