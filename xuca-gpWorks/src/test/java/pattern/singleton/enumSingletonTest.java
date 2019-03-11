package pattern.singleton;

import pattern.singleton.enumsingleton.EnumSingleTon;

/**
 * Created by xuchangan on 2019/3/11
 **/
public class enumSingletonTest {

    public static void main(String[] args) {

        EnumSingleTon enumSingleTon1 = EnumSingleTon.getInstance();

        EnumSingleTon enumSingleTon2 = EnumSingleTon.getInstance();

        System.out.println(enumSingleTon1 == enumSingleTon2);
    }


}
