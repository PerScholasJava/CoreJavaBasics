package perscholas.java_basics.oop1;

public class StoneMonster extends Monster {
    String name;

    StoneMonster(String name) {
        super(name);
    }


    @Override
    public String attack() {
        return "Attack with stone!";
    }
}
