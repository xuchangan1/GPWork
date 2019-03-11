package pattern.singleton.staticinnerclass;

/**
 * Created by xuchangan on 2019/3/11
 **/
//Todo:利用静态内部类的加载机制，实现单例
public class InnerClassSingleton {

    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return LazyHoder.INSTANCE;
    }
    //默认不加载
    private static class LazyHoder{
       private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

}
