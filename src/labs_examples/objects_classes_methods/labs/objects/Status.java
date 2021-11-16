package labs_examples.objects_classes_methods.labs.objects;

public class Status {

    private String airplaneName;
    private boolean takeoff;
    private boolean landed;

    public Status(String airplaneName, boolean takeoff, boolean landed) {

        this.airplaneName = airplaneName;
        this.takeoff = takeoff;
        this.landed = landed;
    }


    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public boolean hasTakeoff() {
        return takeoff;
    }

    public void setTakeoff(boolean takeoff) {
        this.takeoff = takeoff;
    }

    public boolean hasLanded() {
        return landed;
    }

    public void setLanded(boolean landed) {
        this.landed = landed;
    }




    @Override
    public String toString() {
        return "Status{" +
                "airplaneName='" + airplaneName.toString() + '\'' +
                ", takeoff=" + takeoff +
                ", landed=" + landed +
                '}';
    }
}
