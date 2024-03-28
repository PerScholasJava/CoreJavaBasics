package perscholas.java_basics.oop1;

public class WaterMonster extends Monster {
    String name;

    WaterMonster(String name) {
        super(name);
    }


    @Override
    public String attack() {
        return "Attack with water!";
    }
}
