package com.pradipta.lambdas.unit3;

public class MethodReferenceExample {
    public static void main(String[] args){
        Thread thread1 = new Thread (()->print());
        Thread thread2 = new Thread(MethodReferenceExample::print);
        thread1.run();
        thread2.run();
    }

    public static void print(){
        System.out.println("Hello");
    }
}
