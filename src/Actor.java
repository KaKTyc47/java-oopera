import java.util.Objects;

public class Actor extends  Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height){
        super(name, surname, gender);
        if (height < 100 || height > 250) {
            throw new IllegalArgumentException("Рост должен быть в диапазоне от 100 до 250 см");
        }
        this.height = height;
    }



    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;
        return height == actor.height &&
                Objects.equals(gender, actor.gender) &&
                Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), gender, height);
    }
}
