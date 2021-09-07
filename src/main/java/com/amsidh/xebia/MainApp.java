package com.amsidh.xebia;

public class MainApp {
    public static void main(String[] args) {
        A a = new B();
        a.display();
        a.setX(50);
        System.out.println(a.getX());

        B b1 = new B();
        b1.show();
        b1.setY(100);
        System.out.println(b1.getY());

    }
}

class A {
    private Integer x = 10;

    public void display() {
        System.out.println("Hello World from A's display method");
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}

class B extends A {
    private Integer y = 20;

    public void show() {
        System.out.println("Hello World from B's show method");
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
