package chapter_7;

/*page 178*/
class OverLoadDemo2 {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове" +
                " test(double) a: " + a);
    }
}

class Overload2 {
    public static void main(String[] args) {
        OverLoadDemo2 od = new OverLoadDemo2();
        int i = 88;

        od.test();
        od.test(10, 20);
        od.test(i);
        od.test(123.2);
    }
}
