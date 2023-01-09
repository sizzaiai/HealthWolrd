package Map;

public class EquipStore extends Map {
    int pullupBand = 50;
    int liftingBelt = 100;
    int versaGrip = 150;
    int kneePads = 200;

    public int show(int money, int num) {

        name = "장비 가게";
        System.out.println(name + "에서 장비를 구매 시도하는 중입니다.");

        if(num == 1) {
            if(pullupBand <= money) {
                return money - pullupBand;
            }
        }
        if(num == 2) {
            if(liftingBelt <= money) {
                return money - liftingBelt;
            }
        }
        if(num == 3) {
            if(versaGrip <= money) {
                return money - versaGrip;
            }
        }
        if(num == 4) {
            if(kneePads <= money) {
                return money - kneePads;
            }
        }
        return money;
    }
}
