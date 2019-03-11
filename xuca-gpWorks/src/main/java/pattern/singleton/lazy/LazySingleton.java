package pattern.singleton.lazy;

/**
 * Created by xuchangan on 2019/3/10
 **/
//TODO 懒汉模式会存在线程不安全的情况
public class LazySingleton {

    private  static LazySingleton instance = null;

    private LazySingleton(){}

    public static synchronized   LazySingleton getInstance(){//加synchorized关键字是为了解决线程不安全的问题，但是严重影响性能

        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
