package chapter_5;

/*page 153*/
public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До возврата.");
        if(t) return;

        System.out.println("Этот код выполняться не будет");
    }
}
