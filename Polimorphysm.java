package JAVA;

class A {
    public void print(){
        System.out.println("Class-A");
    }
}

class B extends A{
    public void print(){
        System.out.println("Class-B");
    }
}

class C extends A{
    public void print(){
        System.out.println("Class-C");
    }
}

public class Polimorphysm {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();

        a.print();
        b.print();
        c.print();
    }
}
