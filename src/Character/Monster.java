package Character;

public class Monster extends Character{

    public int muscle;
    public int fat;
    public int money;
    public int experience;

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
