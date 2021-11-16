package labs_examples.objects_classes_methods.labs.objects;

public class Route {

    private String depCity;
    private String desCity;

    public Route(String depCity, String desCity) {
        this.depCity = depCity;
        this.desCity = desCity;
    }




    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getDesCity() {
        return desCity;
    }

    public void setDesCity(String desCity) {
        this.desCity = desCity;
    }



    @Override
    public String toString() {
        return "Departing " + depCity +
                ", arriving " + desCity + ".";
    }
}
