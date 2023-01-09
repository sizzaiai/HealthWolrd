package Character;

public class Benchpress extends Monster {
    public int exercise() {

        System.out.println("기구가 가하는 데미지는 " + muscle + " 입니다.");
        return muscle;

    }

    public void exercised(int sum) {

        if(fat >= sum) {
            hp = hp - 0;
        }else {
            hp = hp + fat - sum;
        }
    }
}
