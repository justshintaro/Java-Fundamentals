package labs_examples.objects_classes_methods.labs.objects;

public class MyExample {

    public static void main(String[] args) {

        // first constructor
        System.out.println();
        Status firstStatus = new Status("Emirate", false, true);
        Route firstRoute = new Route("Beijing", "Istanbul");
        Passengers firstPassengers = new Passengers("Marina", 11, 4.11f);
        Seat firstSeat = new Seat(false, "S1");

        Airplane firstAirplane = new Airplane(firstStatus, firstRoute, firstPassengers, firstSeat, 123, 100);
        System.out.println(firstAirplane.toString());


        // second constructor
        System.out.println();
        Status secondStatus = new Status("ANA", true, true);
        Route secondRoute = new Route("Floria", "Paris");
        Passengers secondPassenger = new Passengers("Mike", 45, 5.8f);
        Seat secondSeat = new Seat(true, "A12");

        Airplane secondAirplane = new Airplane(secondStatus, secondRoute, secondPassenger, secondSeat, 500.111, 100);
        System.out.println(secondAirplane.toString());



        // third constructor
        Airplane thirdAirplane = new Airplane(new Status("JAL", true, false), new Route("Tokyo", "New York"),
                new Passengers("David", 34, 5.11f),new Seat(true, "N23"), 123, 98);


        System.out.println("My name is "+thirdAirplane.getPassengers().getName()+ ". My seat: "
                + thirdAirplane.getSeat().getSeat()+
                ". I am leaving "+thirdAirplane.getRoute().getDepCity()+" for "+thirdAirplane.getRoute().getDesCity());

        // toString
        System.out.println();
        System.out.println(thirdAirplane.toString());



    }
}
