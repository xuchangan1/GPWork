package pattern.singleton.hungry;

/**
 * Created by xuchangan on 2019/3/10
 **/
//TODO:由于饿汉式单例模式不管用没用到这个实例，类加载的时候都会生产一个实例，会造成资源的浪费
public class HungrySingleton {

    private final static HungrySingleton instance = new HungrySingleton();


    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }

}
