package pattern.prototype;

/**
 * Created by xuchangan on 2019/3/12
 **/
public class StudentDemo implements Cloneable {

        private String name;
        private String birthday;
        private String sex;
        private String school;
        private String company;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        @Override
        public String toString() {
            return "StudentDemo{" +
                    "name='" + name + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", sex='" + sex + '\'' +
                    ", school='" + school + '\'' +
                    ", company='" + company + '\'' +
                    '}';
        }
        @Override
        public Object clone(){//重写clone接口，达到克隆自己的效果
            StudentDemo studentDemo = null;
            try {
                studentDemo = (StudentDemo) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return studentDemo;
        }
}

