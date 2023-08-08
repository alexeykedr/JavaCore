package chapter_8;

/*page 209*/
class A2 {
    int i, j;

    void showij() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.print("i + j + k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A2 superOb = new A2();
        B2 subOb = new B2();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта supOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb:");
        subOb.sum();

    }
}
