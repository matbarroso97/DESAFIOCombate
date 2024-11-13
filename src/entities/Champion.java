package entities;

public class Champion {

       private String name;
       private int life;
       private int attack;
       private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public int getLife() {
        return life;
    }

    public void takeDamage(Champion other){
           if (armor >= other.attack) {
               life -= 1;
           } else {
               life -= other.attack - armor;
           }
       }



    public String status() {
           if (life > 0) {
               return name + ": " + life + " de vida";
           } else {
               return name + ": 0 de vida (morreu)";
           }
       }

}
