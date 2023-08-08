package chapter_7;

/*page 177*/

class Overload {
    void test() {
        System.out.println("Параметры отсутствуют.");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload od = new Overload();
        double result;

        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}

