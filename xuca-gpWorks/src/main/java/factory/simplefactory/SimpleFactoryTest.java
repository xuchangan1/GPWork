package factory.simplefactory;

/**
 * Created by xuchangan on 2019/3/9
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.createCourse("Java");
        course.record();

    }
}
