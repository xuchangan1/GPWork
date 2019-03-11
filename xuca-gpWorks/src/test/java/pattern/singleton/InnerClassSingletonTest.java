package pattern.singleton;

import pattern.singleton.staticinnerclass.InnerClassSingleton;

/**
 * Created by xuchangan on 2019/3/11
 **/
public class InnerClassSingletonTest {

    public static void main(String[] args) {

        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();

        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();

        System.out.println(instance1 == instance2);

    }





}
