package factory.simplefactory;

/**
 * Created by xuchangan on 2019/3/9
 **/
public class CourseFactory {
    public ICourse createCourse(String courseName){
        if(courseName.equals("Java")){
            return new JavaCourse();
        }else{
            return null;
        }
    }
}
