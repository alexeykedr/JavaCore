package chapter_8;

/*page 225*/
class A5 {
    void callme(){
        System.out.println("В методе callme() из класса А5");
    }
}
 class B5 extends A5 {
    void callme(){
        System.out.println("В методе callme() из класса B5");
    }
 }
 class C5 extends A5 {
    void callme(){
        System.out.println("В методе callme() из класса C5");
    }
 }

class Dispatch {
    public static void main(String[] args) {
        A5 a5 = new A5();
        B5 b5 = new B5();
        C5 c5 = new C5();

        A5 r;
        r = a5;
        r.callme();

        r = b5;
        r.callme();

        r = c5;
        r.callme();
    }
}
