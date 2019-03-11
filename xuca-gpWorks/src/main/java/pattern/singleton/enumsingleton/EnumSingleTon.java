package pattern.singleton.enumsingleton;

/**
 * Created by xuchangan on 2019/3/11
 **/
public enum EnumSingleTon{
    INSTANCE;

    public static EnumSingleTon getInstance(){
        return INSTANCE;
    }
}

