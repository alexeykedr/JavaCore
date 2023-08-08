package chapter_8;

/*page 229*/
abstract class A6 {
    abstract void callme();

    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class B6 extends A6 {
    void callme() {
    }

    {
        System.out.println("Реализация метода callme() из класса B6.");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B6 b6 = new B6();

        b6.callme();
        b6.callmetoo();
    }
}
