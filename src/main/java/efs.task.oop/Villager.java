package efs.task.oop;

public class Villager implements Fighter{
    protected String name;
    protected int age;
    protected int health;

    public Villager(String name, int age){
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {return health;}

    public void sayHello(){
        System.out.println("Greetings traveler... I'm " + getName() + " and I'm " + getAge() + " years old");
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int)((100 - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        if(health - damage >= 0){
            health -= damage;
        }
        else{
            health = 0;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}