public class Director extends Person {

    private Gender gender;
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows){
        super(name, surname);
        this.gender = gender;
        this.numberOfShows = numberOfShows;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
