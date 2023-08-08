package chapter_9.Callback;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIntfaceMeth() {
        System.out.println("В классах реализующих интерфейсы," +
                " также могут определяться и другие члены.");
    }

}

