public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(70);
        boss.setDefence("kinetic");
        System.out.println("BOSS-->  " + "Health: " + boss.getHealth() + " | Damage: "
                + boss.getDamage() + " | Defence: " + boss.getDefence());

        Hero[] heroes = createHeroes();
        for(Hero hero: heroes){
            System.out.println("Hero-->  " + "Health: " + hero.getHealth() + " | Damage: "
                    + hero.getDamage() + " | Ability: " + hero.getAbility());
        }
    }


    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(250, 30, "Laser");
        Hero hero2 = new Hero(400, 80);
        Hero hero3 = new Hero(150, 200, "Meteor");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;

    }
}
