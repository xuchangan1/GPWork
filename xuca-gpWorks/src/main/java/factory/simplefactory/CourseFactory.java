package factory.simplefactory;

import factory.ICourse;
import factory.JavaCourse;
import factory.CPlusPlusCource;

/**
 * Created by xuchangan on 2019/3/9
 **/
public class CourseFactory {
    public ICourse createCourse(String courseName){
        if(courseName.equals("Java")){
            return new JavaCourse();
        }else if (courseName.equals("CPlusPlus")){
            return new CPlusPlusCource();
        }else{
            return null;
        }
    }
}
