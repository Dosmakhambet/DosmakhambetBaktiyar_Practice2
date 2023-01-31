package main.java;

public class MyThread1 implements Runnable{
    Foo foo;
    Thread thread;

    MyThread1(Foo foo){
        this.foo = foo;
        thread = new Thread(this);
    }

    public void run(){
        foo.first();
    }
}
