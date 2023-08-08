package chapter_9.Callback;

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnorherClient ob = new AnorherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
