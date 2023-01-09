package Character;

public class Human extends Character {

    public int level;
    public int hp;
    public int muscle;
    public int fat;
    public int stressResistance;
    public int stress;
    public int experience = 0;
    public int money;

    public int exercise() {
        return muscle;
    }

    public void exercised(int sum) {

        if(fat >= sum) {
            hp = hp;
        }else {
            hp = hp + fat - sum;
        }
    }
}
