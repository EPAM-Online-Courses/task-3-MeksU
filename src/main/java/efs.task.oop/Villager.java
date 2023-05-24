package efs.task.oop;

public class Villager {
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

    public void sayHello(){
        System.out.println("Greetings traveler... I'm " + getName() + " and I'm " + getAge() + " years old.");
    }
}