package factory.simplefactory;

import factory.ICourse;

/**
 * Created by xuchangan on 2019/3/9
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course1 = factory.createCourse("Java");

        course1.record();
        ICourse course2 = factory.createCourse("CPlusPlus");
        course2.record();
        ICourse course3 = factory.createCourse("Computer");
        course3.record();

    }
}
