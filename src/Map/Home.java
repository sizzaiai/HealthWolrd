package Map;

public class Home extends Map {
    int Rest = 2;
    int Sleep = 10;

    public int show(int money, int num) {

        name = "집";
        System.out.println(name + "에서 머무릅니다.");

        if (num == 1) {
            if (Rest <= money) {
                return money - Rest;
            }
        }
        if (num == 2) {
            if (Sleep <= money) {
                return money - Sleep;
            }
        }
        return money;
    }
}

