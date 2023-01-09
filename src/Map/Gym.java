package Map;

public class Gym extends Map {
    static int Dumbbell = 3;
    static int Barbell = 3;
    static int Benchpress = 3;
    static int Latpulldown = 3;
    static int Legpress = 3;
    static int Rowingmachine = 3;
    static int SBD = 3;

    public static int show(int money, int num) {

        name = "헬스장";
        System.out.println(name + "에서 운동을 합니다.");

        if (num == 1) {
            if (Dumbbell <= money) {
                return money - Dumbbell;
            }
        }
        if (num == 2) {
            if (Barbell <= money) {
                return money - Barbell;
            }
        }
        if (num == 3) {
            if (Benchpress <= money) {
                return money - Benchpress;
            }
        }
        if (num == 4) {
            if (Latpulldown <= money) {
                return money - Latpulldown;
            }
        }
        if (num == 5) {
            if (Legpress <= money) {
                return money - Legpress;
            }
        }
        if (num == 6) {
            if (Rowingmachine <= money) {
                return money - Rowingmachine;
            }
        }
        if (num == 7) {
            if (SBD <= money) {
                return money - SBD;
            }
        }
        return money;
    }
}
