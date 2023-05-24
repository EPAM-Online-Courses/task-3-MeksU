package efs.task.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        Villager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        Villager deckard = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckard.sayHello();
        warriv.sayHello();
        flawia.sayHello();

        Object objectAkara = akara;
        Object objectDeckard = deckard;

        //objectAkara.sayHello(); nie działa więc nie można wywoływać metod

        List<Villager> villagers = new ArrayList<>();
        villagers.add(kashya);
        villagers.add(akara);
        villagers.add(gheed);
        villagers.add(deckard);
        villagers.add(warriv);
        villagers.add(flawia);

        int i = 0;

        while(Monsters.monstersHealth > 0){
            if(villagers.get(i).getHealth() > 0) {
                System.out.println("\nPotwory posiadaja jeszcze " + Monsters.monstersHealth + " punkty zycia");
                System.out.println("Aktualnie walczacy osadnik to " + villagers.get(i));

                if(villagers.get(i).getHealth() > 0){
                    villagers.get(i).attack(Monsters.andariel);

                    if(Monsters.andariel.getHealth() > 0){
                        Monsters.andariel.attack(villagers.get(i));
                    }
                }

                if(villagers.get(i).getHealth() > 0){
                    villagers.get(i).attack(Monsters.blacksmith);

                    if(Monsters.blacksmith.getHealth() > 0){
                        Monsters.blacksmith.attack(villagers.get(i));
                    }
                }
            }

            if(++i == 6){
                i = 0;
            }
        }

        deckard = (ExtraordinaryVillager) objectDeckard;
        akara = (ExtraordinaryVillager) objectAkara;

        System.out.println("\nObozowisko ocalone!");
    }
}
