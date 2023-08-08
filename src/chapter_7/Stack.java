package chapter_7;

/*page 192*/
class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполлнен");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else
            return stck[tos--];
    }

}

class TestStack {
    public static void main(String args[]) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Стек в mystack1");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2");

        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}