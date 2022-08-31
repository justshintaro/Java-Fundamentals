package labs_examples.input_output.labs;

public class FantasyLeader {

    private int rank;
    private String firstName;
    private String lastName;
    private String team;
    private String position;
    private double points;
    private int games;
    private double avg;

    public FantasyLeader() {
    }

    public FantasyLeader(int rank, String firstName, String lastName, String team, String position, double points, int games, double avg) {
        this.rank = rank;
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.position = position;
        this.points = points;
        this.games = games;
        this.avg = avg;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return rank + "," + firstName + "," + "," + team + "," + position + "," + points + "," + games + "," + avg;
    }
}
