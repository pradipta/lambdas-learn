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

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in thread 1");
            }
        });

        Thread thread2 = new Thread(() -> System.out.println("Running in thread 2"));

        thread1.run();
        thread2.run();
    }
}
