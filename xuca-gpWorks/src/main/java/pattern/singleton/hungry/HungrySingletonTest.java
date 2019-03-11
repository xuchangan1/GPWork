package pattern.singleton.hungry;

/**
 * Created by xuchangan on 2019/3/10
 **/
public class HungrySingletonTest {

    public static void main(String[] args) {

        HungrySingleton instance1 = HungrySingleton.getInstance();

        HungrySingleton instance2 = HungrySingleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
