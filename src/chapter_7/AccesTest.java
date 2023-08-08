package chapter_7;

/*page 190*/
class Test5 {
    int a;
    public int b;
    private int c;

    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}

class AccessTest {
    public static void main(String args[]) {
        Test5 ob = new Test5();

        ob.a = 10;
        ob.b = 20;

        // ob.c = 30; // error

        ob.setC(100);
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}