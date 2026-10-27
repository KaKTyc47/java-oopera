public class Director extends Person {


    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows){
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    public void addShow() {
        this.numberOfShows++;
    }
}
