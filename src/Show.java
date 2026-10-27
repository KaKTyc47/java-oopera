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
            System.out.println(" Актёр '" + actor + "' уже участвует в спектакле. Дублирование запрещено!");
            return;
        }
        listOfActors.add(actor);
        System.out.println( " Актёр '" + actor + "' успешно добавлен в спектакль.");
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {

        ArrayList<Actor> candidates = new ArrayList<>();

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surnameToReplace)) {
                candidates.add(actor);
            }
        }


        if (candidates.isEmpty()) {
            System.out.println(" Предупреждение: Актёр с фамилией '" + surnameToReplace +
                    "' не найден в составе спектакля \"" + this.title + "\".");
        }
        else if (candidates.size() > 1) {

            System.out.println(" Ошибка: Найдено " + candidates.size() +
                    " актёров с фамилией '" + surnameToReplace + "':");
            for (Actor c : candidates) {
                System.out.println("   - " + c);
            }
            System.out.println("Замена невозможна: фамилия не уникальна. Укажите более точные данные.");
        }
        else {

            Actor oldActor = candidates.get(0);
            int index = listOfActors.indexOf(oldActor);

            System.out.println(" Заменяем актёра '" + oldActor + "' на '" + newActor + "' в спектакле \"" + this.title + "\".");
            listOfActors.set(index, newActor);
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director.name +
                '}';
    }
}
