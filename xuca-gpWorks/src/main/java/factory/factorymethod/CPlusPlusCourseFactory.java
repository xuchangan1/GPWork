package factory.factorymethod;

import factory.CPlusPlusCource;
import factory.ICourse;

/**
 * Created by xuchangan on 2019/3/9
 **/
public class CPlusPlusCourseFactory implements CourseFactory {
    public ICourse creatCourse() {
        return new CPlusPlusCource();
    }
}
