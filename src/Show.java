import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

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
        if (listOfActors.contains(actor)) {
            System.out.println(" Актёр '" + actor.getName() + " " + actor.getSurname() +
                    "' уже участвует в спектакле \"" + this.title + "\". " +
                    "Дублирование запрещено!");
            return;
        }
        listOfActors.add(actor);
        System.out.println(" Актёр '" + actor.getName() + " " + actor.getSurname() +
                "' успешно добавлен в спектакль \"" + this.title + "\".");
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);


            if (currentActor.getSurname().equals(surnameToReplace)) {
                System.out.println("🔄 Заменяем актёра '" + currentActor.getName() + " " + currentActor.getSurname() +
                        "' на '" + newActor.getName() + " " + newActor.getSurname() + "' в спектакле \"" + this.title + "\".");


                listOfActors.set(i, newActor);


                return;
            }
        }


        System.out.println("⚠️ Предупреждение: Актёр с фамилией '" + surnameToReplace +
                "' не найден в составе спектакля \"" + this.title + "\". Замена не произведена.");
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
