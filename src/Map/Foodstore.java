package Map;

public class Foodstore extends Map {
    int salad = 10;
    int sweetPotato = 5;
    int chickenBreast = 5;
    int fruit = 2;
    int rice = 10;
    int bread = 3;
    int ramen = 5;
    int fastFood = 10;
    int protein = 50;

    public int show(int money, int num) {

        name = "음식점";
        System.out.println(name + "에서 음식을 사서 식사를 합니다.");

        if (num == 1) {
            if (salad <= money) {
                return money - salad;
            }
        }
        if (num == 2) {
            if (sweetPotato <= money) {
                return money - sweetPotato;
            }
        }
        if (num == 3) {
            if (chickenBreast <= money) {
                return money - chickenBreast;
            }
        }
        if (num == 4) {
            if (fruit <= money) {
                return money - fruit;
            }
        }
        if (num == 5) {
            if (rice <= money) {
                return money - rice;
            }
        }
        if (num == 6) {
            if (bread <= money) {
                return money - bread;
            }
        }
        if (num == 7) {
            if (ramen <= money) {
                return money - ramen;
            }
        }
        if (num == 8) {
            if (fastFood <= money) {
                return money - fastFood;
            }
        }
        if (num == 9) {
            if (protein <= money) {
                return money - protein;
            }
        }
        return money;
    }
}

