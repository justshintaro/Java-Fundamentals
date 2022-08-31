package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class DependencyIngectionController {

    public static void main(String[] args) {

        Soccer soccer1 = new Soccer(11, "Barcelona");
        Americanfootball football1 = new Americanfootball(44, "New York Giants");
        football1.cheerleader(true);

        Dependency example = new Dependency(soccer1);
        example.testMethods(true, 11111111l);

        System.out.println(soccer1.getNumPlayers());


        example.setSport(football1);
        example.testMethods(false, 123232323l);


    }
}