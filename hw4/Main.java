import Shields.Broneschit;
import Shields.Mantelet;
import Shields.NoShield;
import Weapons.Bow;
import Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Swordman> teamSword = new Team<>();
        System.out.println("Команда мечников");
        teamSword.addTeam(new Swordman("Король", 250, new Sword(25), new NoShield()))
                .addTeam(new Swordman("Джедай", 250, new Sword(25), new Mantelet(80)))
                .addTeam(new Swordman("Артур", 200, new Sword(50), new Broneschit(100)));

        for (Swordman swordman : teamSword) {
            System.out.println(swordman);
        }
        System.out.println("Минимальная защита");
        System.out.println(teamSword.minArmor());

        System.out.println();
        System.out.println("Команда Лучников");
        Team<Archer> teamArcher = new Team<>();
        teamArcher.addTeam(new Archer("Робин", 150, new Bow(99, 88)))
                .addTeam(new Archer("Король", 250, new Bow(77, 55)))
                .addTeam(new Archer("Гуд", 200, new Bow(80, 77)));

        for (Archer person : teamArcher) {
            System.out.println(person);
        }
        System.out.println("Максимальная дальнобойность");
        System.out.println(teamArcher.maxRange());

    }

}