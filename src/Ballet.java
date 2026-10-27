public class Ballet extends MusicalShow {
    private Person choreographer;


    public Ballet(String title, int duration, Director director,
                  String musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {

        return choreographer;
    }

    @Override
    public String toString() {
        // Теперь мы можем обратиться к полям хореографа через геттеры
        String choreoName = (choreographer != null)
                ? choreographer.getName() + " " + choreographer.getSurname()
                : "Неизвестен";

        return "Ballet{" +
                "title='" + this.title + '\'' +
                ", duration=" + this.duration +
                ", choreographer='" + choreoName + '\'' +
                ", musicAuthor='" + musicAuthor + '\'' +
                '}';
    }
}
