package labs_examples.packages.labs.package_01;
import labs_examples.packages.labs.package_02.DataAnalytics;

public class ExtDataAnalytics extends DataAnalytics{
    String courseDescription;

    public ExtDataAnalytics(String pro, int s, String[] pre, String c){
        super(pro, s, pre);
        courseDescription = c;
    }

    public void show(){
        super.show();
        System.out.println(courseDescription);
        System.out.println();
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String c) {
        this.courseDescription = c;
    }

    // access protected variables in a different class
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String pro) {
        professor = pro;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int s) {
        section = s;
    }

    public String[] getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String[] pre) {
        prerequisites = pre;
    }

}
