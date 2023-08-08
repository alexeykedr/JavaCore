package chapter_8;

/*page 218*/
class C {
    int i;
}

class D extends C {
    int i;

    D(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в  подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        D subD = new D(1, 2);
        subD.show();
    }
}
