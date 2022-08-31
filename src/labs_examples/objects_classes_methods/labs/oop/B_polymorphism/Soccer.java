package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Soccer implements Sport{

    protected int numPlayers;
    protected String team;


    public Soccer() {
    }

    public Soccer(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public Soccer(String team) {
        this.team = team;
    }

    public Soccer(int numPlayers, String team) {
        this.numPlayers = numPlayers;
        this.team = team;
    }


    @Override
    public void popular(boolean x) {
        if (x == true) {
            System.out.println("this sport is popular!");
        } else {
            System.out.println("not really popular..");
        }
    }


    @Override
    public void country() {
        System.out.println("this sport is popular in Spain");

    }

    @Override
    public void sportPopulation(long y) {
        System.out.println("this sport population in this country is "+y);

    }


    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
