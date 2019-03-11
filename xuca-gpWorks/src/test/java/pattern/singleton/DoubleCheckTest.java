package pattern.singleton;

import pattern.singleton.lazy.ExectorThread;

/**
 * Created by xuchangan on 2019/3/11
 **/
public class DoubleCheckTest {

    public static void main(String[] args) {

     Thread thread1 = new Thread(new ExectorThread());
     Thread thread2 = new Thread(new ExectorThread());
     thread1.start();
     thread2.start();
    }
}
