package Thread;

public class Body {
    private int level;
    private int hp;
    private int muscle;
    private int fat;
    private int stressResistance;
    private int stress;
    private int experience;
    private int money;

    Body(int level, int hp, int muscle, int fat, int stressResistance, int stress, int experience, int money) {
        this.level = level;
        this.hp = hp;
        this.muscle = muscle;
        this.fat = fat;
        this.stressResistance = stressResistance;
        this.stress = stress;
        this.experience = experience;
        this.money = money;
    }
    public void Body_display(){
        System.out.println(level);
        System.out.println(hp);
        System.out.println(muscle);
        System.out.println(fat);
        System.out.println(stressResistance);
        System.out.println(stress);
        System.out.println(experience);
        System.out.println(money); ;
    }


}
