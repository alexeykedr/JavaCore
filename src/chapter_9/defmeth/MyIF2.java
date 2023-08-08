package chapter_9.defmeth;

/*page 260*/
public interface MyIF2 {
    int getNumber();

    default String getString() {
        return "Объект тиипа String по умолчанию";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
