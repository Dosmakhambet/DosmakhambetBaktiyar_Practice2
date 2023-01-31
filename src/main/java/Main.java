package main.java;

public class Main {

    public static void main(String args[]){
        Foo foo = new Foo();

        MyThread1 t1 = new MyThread1(foo);
        MyThread2 t2 = new MyThread2(foo);
        MyThread3 t3 = new MyThread3(foo);

        t2.thread.start();
        t1.thread.start();
        t3.thread.start();
    }
}
