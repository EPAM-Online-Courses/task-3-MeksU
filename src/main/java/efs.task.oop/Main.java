package efs.task.oop;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        Villager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager gheed = new Villager("Gheed", 50);
        Villager deckard = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.SHELTER);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckard.sayHello();
        warriv.sayHello();
        flawia.sayHello();
    }
}
