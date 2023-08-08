package chapter_9.Callback;

class AnorherClient implements Callback{

    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));

    }
}
