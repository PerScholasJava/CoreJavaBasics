package perscholas.java_basics.oop1;

public class Monster implements MonsterActions{
    String name;

    public Monster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}
