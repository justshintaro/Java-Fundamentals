package labs_examples.packages.labs.package_02;
import labs_examples.packages.labs.package_01.ExtDataAnalytics;

public class Course {
    public static void main(String[] args) {
        ExtDataAnalytics[] subject1 = new ExtDataAnalytics[3];

        subject1[0] = new ExtDataAnalytics("Christopher Lloyd", 1,
                new String[]{"Tool for Analytics", "Data Management"}, "Survey tools available in Python for getting, cleaning, and analyzing data.");

        subject1[1] = new ExtDataAnalytics("Tom Hanks", 2,
                new String[]{"Tool for Analytics"}, "Survey tools available in Python for getting, cleaning, and analyzing data.");

        subject1[2] = new ExtDataAnalytics("Sam Jaffe", 2,
                new String[]{"Tool for Analytics"}, "Survey tools available in Python for getting, cleaning, and analyzing data.");

        for (int i = 0; i < subject1.length; i++){
            subject1[i].show();
        }

        for (int i = 0; i < subject1.length; i++){
            System.out.println(subject1[i].getProfessor());
        }

    }
}
