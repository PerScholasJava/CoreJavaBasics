package perscholas.java_basics.oop1;

public class FireMonster extends Monster {
    String name;

    FireMonster(String name) {
        super(name);
    }


    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
