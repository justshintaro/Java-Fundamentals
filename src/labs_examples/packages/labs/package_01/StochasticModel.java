package labs_examples.packages.labs.package_01;
import labs_examples.packages.labs.package_02.DataAnalytics;

public class StochasticModel {
    private String professor;
    private int section;
    private String[] prerequisites;

    public StochasticModel(String pro, int s, String[] pre){
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
