package pattern.singleton.lazy;

import pattern.singleton.doublecheck.DoubleCheck;

/**
 * Created by xuchangan on 2019/3/10
 **/
public class ExectorThread implements Runnable{

    public void run() {

//      LazySingleton instance = LazySingleton.getInstance();
//
        DoubleCheck instance = DoubleCheck.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);

    }
}

