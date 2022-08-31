package labs_examples.objects_classes_methods.labs.objects;

public class Seat {

    private boolean occupied;
    private String seat;

    public Seat(boolean occupied, String seat) {
        this.occupied = occupied;
        this.seat = seat;
    }


    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }



    @Override
    public String toString() {
        return "Seat{" +
                "occupied=" + occupied +
                ", seat='" + seat + '\'' +
                '}';
    }
}
