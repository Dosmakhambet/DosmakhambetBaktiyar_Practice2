package main.java;

public class MyThread2 implements Runnable{
    Foo foo;
    Thread thread;

    MyThread2(Foo foo){
        this.foo = foo;
        thread = new Thread(this);
    }

    public void run(){
        foo.second();
    }
}
