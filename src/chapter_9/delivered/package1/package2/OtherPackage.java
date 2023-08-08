package chapter_9.delivered.package1.package2;

import chapter_9.delivered.package1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("Конструктор из другого пакета");

//        System.out.println("n = " + p.n);
//        System.out.println("n.pri = " + p.n_pri);
//        System.out.println("n.pro = " + p.n_pro);
        System.out.println("n.pub = " + p.n_pub);


    }
}
