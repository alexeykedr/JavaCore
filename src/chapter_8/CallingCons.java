package chapter_8;

/*page 222*/

class A3 {
    A3() {
        System.out.println("В конструктор A");
    }
}

class B3 extends A3 {
    B3() {
        System.out.println("В конструктор B");
    }
}

class C3 extends B3 {
    C3() {
        System.out.println("В конструктор C");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C3 c = new C3();
    }
}
