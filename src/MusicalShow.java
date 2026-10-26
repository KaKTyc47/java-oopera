public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    @Override
    public String toString() {
        return "MusicalShow{" +
                "title='" + getTitle() + '\'' +
                ", duration=" + getDuration() +
                ", musicAuthor='" + musicAuthor + '\'' +
                ", librettoText='" + librettoText + '\'' +
                '}';
    }
}
