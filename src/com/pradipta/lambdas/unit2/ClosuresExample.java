package com.pradipta.lambdas.unit2;

public class ClosuresExample {
    public static void main(String[] args){
        int a = 10;
        int b = 19;
//        doProcess(a, new Process() {
//            @Override
//            public void process(int i) {
//                final int b = 50;
//                System.out.println(i + b);
//            }
//        });

        doProcess(a, (i)-> System.out.println(i+b));
        System.out.println(b);
    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }
}

interface Process{
    void process(int i);
}
