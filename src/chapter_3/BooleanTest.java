package chapter_3;

/*page 81*/
public class BooleanTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println(" b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        if (b) {
            System.out.println("этот код выполняется");
        }
        b = false;
        if (b) {
            System.out.println("этот код не выполняется");
        }
        System.out.println("10 > 9 равно " + (10 > 9));

    }
}
