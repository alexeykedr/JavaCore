package chapter_9.stack;

/*page 252*/
class IFTestЗ {
    public static void main(String[] args) {
        IntStack myStack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for (int i = 0; i < 12; i++) myStack.push(i);

        myStack = fs;
        for (int i = 0; i < 8; i++) myStack.push(i);

        myStack = ds;
        System.out.println("Знaчeния в динамическом стеке:");
        for (int i = 0; i < 12; i++)
            System.out.println(myStack.pop());

        myStack = fs;
        System.out.println("Знaчeния в фиксированном стеке:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack.pop());
    }
}
