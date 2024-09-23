package software.ulpgc;
import java.time.LocalDate;


public class Person {
    private final String name; //Final una vez un valor no se puede dar otro valor
    private final LocalDate Birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        Birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - Birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Birthday=" + Birthday +
                ", age =" + getAge() +
                '}';
    }
}
