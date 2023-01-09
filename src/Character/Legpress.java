package Character;

public class Legpress extends Monster{
     public int exercise() {

       System.out.println("기구가 가하는 데미지는 " + muscle + " 입니다.");
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

