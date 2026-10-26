import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director){
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        if (listOfActors == null) {
            this.listOfActors = new ArrayList<>();
        } else {
            this.listOfActors = listOfActors;
        }
    }

    public void addActor(Actor actor) {
        listOfActors.add(actor);
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director.getName() +
                '}';
    }
}
