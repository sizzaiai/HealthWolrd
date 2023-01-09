package Character;

import java.util.Scanner;

public class Guy extends Human {

    public int exercise() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 상체 근육 쓰기");
        System.out.println("2. 하체 근육 쓰기");
        System.out.println("어떤 근육을 쓰시겠습니까?  : ");
        int num = sc.nextInt();

        int sum = 0;

        if(num == 1) {

            sum += level * 15;
            sum += muscle * 15;
            sum += stressResistance * 15;
            System.out.println("Guy가 가하는 데미지는 " + sum + "입니다.");
            return sum;

        }else if(num == 2) {

            sum += level * 20;
            sum += muscle * 15;
            sum += stressResistance * 10;
            System.out.println("Guy가 가하는 데미지는 " + sum + "입니다.");
            return sum;

        }

        System.out.println("Guy가 가하는 데미지는 " + sum + "입니다.");
        return sum;
    }

    public void exercised(int sum) {

        if (stressResistance >= sum) {
            hp = hp;
        } else {
            hp = hp + stressResistance - sum;
        }
    }
}

