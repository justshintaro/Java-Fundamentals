package labs_examples.packages.labs.package_02;

public class DataAnalytics {
    protected String professor;
    protected int section;
    protected String[] prerequisites;

    public DataAnalytics(String pro, int s, String[] pre){
        professor = pro;
        section = s;
        prerequisites = pre;
    }

    public void show(){
        System.out.println(professor);
        System.out.println(section);
        System.out.println(prerequisites);
        System.out.println();
    }

}
