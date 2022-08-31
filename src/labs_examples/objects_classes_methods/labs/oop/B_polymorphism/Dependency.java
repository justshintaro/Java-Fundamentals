package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Dependency {

    Sport sport;

    public Dependency(Sport sport) {
        this.sport = sport;
    }

    public void testMethods(boolean x, long y){
        sport.popular(x);
        sport.country();
        sport.sportPopulation(y);
        System.out.println("-------------------");

    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
