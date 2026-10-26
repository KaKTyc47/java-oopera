public class Actor extends  Person {
    private Gender gender;
    private int height;

    public Actor(String name, String surname, Gender gender, int height){
        super(name, surname);
        this.gender = gender;
        if (height < 100 || height > 250) {
            throw new IllegalArgumentException("Рост должен быть в диапазоне от 100 до 250 см");
        }
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }
}
