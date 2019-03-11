package pattern.singleton;

import pattern.singleton.lazy.ExectorThread;

/**
 * Created by xuchangan on 2019/3/10
 **/
public class LazySingletonTest {

    public static void main(String[] args) {

//        LazySingleton instance1 = LazySingleton.getInstance();
//
//        LazySingleton instance2 = LazySingleton.getInstance();
//
//        System.out.println(instance1);
//
//        System.out.println(instance2);
//
//        System.out.println(instance1 == instance2);

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}
