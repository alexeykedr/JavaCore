package chapter_6;

/*page 157*/

class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String args[]) {
        Box2 mybox = new Box2();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;


        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}