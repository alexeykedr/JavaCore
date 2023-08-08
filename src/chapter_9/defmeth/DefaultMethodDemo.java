package chapter_9.defmeth;

/*page 257*/
interface MyIF {
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}

class MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());

        System.out.println(obj.getString());
    }
}
