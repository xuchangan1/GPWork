package pattern.singleton.doublecheck;

/**
 * Created by xuchangan on 2019/3/11
 **/
//TODO 双检锁单例模式
public class DoubleCheck {

    private  volatile static DoubleCheck instance = null;

    private DoubleCheck(){}

    public static DoubleCheck getInstance(){

        if(instance == null){
            synchronized (DoubleCheck.class){
                if(instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}