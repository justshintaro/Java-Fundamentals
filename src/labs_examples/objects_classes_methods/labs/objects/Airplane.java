package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    Status status;
    Route route;
    Passengers passengers;
    Seat seat;

    double fuel;
    double currentFuelLevel;


    // first constructor
    public Airplane(){}

    // second constructor
    public Airplane(Status status, Route route, Passengers passengers, Seat seat){
        this.status = status;
        this.route = route;
        this.passengers = passengers;
        this.seat = seat;
    }

    // third constructor
    public Airplane(Status status, Route route, Passengers passengers, Seat seat, double fuel, double currentFuelLevel) {
        this.status = status;
        this.route = route;
        this.passengers = passengers;
        this.seat = seat;
        this.fuel = fuel;
        this.currentFuelLevel = currentFuelLevel;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }




    @Override
    public String toString() {
        return "Airplane{" +
                "\nstatus=" + status  +
                "\n, route= " + route +
                "\n, passengers=" + passengers +
                "\n, seat=" + seat +
                "\n, fuel=" + fuel +
                "\n, currentFuelLevel='" + currentFuelLevel + '\'' +
                '}';
    }
}
