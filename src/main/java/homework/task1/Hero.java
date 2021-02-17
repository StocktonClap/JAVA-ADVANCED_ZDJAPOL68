package homework.task1;

import java.time.LocalDate;

public class Hero extends Person{

    final String specialAbility;

    public Hero(String name, LocalDate birthDate, String specialAbility) {
        super(name, birthDate);
        this.specialAbility = specialAbility;
    }

    @Override
    public String toString() {
        return "Hero: " +name + "\n"+
                "Born: " +birthDate + "\n" +
                "Special ability: " +specialAbility;
    }
}
