package Thread;

import Character.*;
import Map.EquipStore;
import Map.Foodstore;
import Map.Gym;
import Map.Home;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Timer;



public class Main {

    private static Audio bgm;
    private static Audio fight;
    private static Audio eq;
    private static Audio rest;
    private static Audio food;

    //문자열 한글자씩 나오게 하는 스레드
    public static void slowPrint(String str, long time){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Human human = new Human();
        bgm = new Audio("src/audio/test.wav");
        fight = new Audio("src/audio/Inspired-_Clean_-NEFFEX.wav");
        eq = new Audio("src/audio/No-Doubt-Yung-Logos.wav");
        rest = new Audio("src/audio/Blue-Mood-Robert-Munzinger.wav");
        food = new Audio("src/audio/Housin-Yung-Logos.wav");

        String str = "헬스월드에 오신것을 환영합니다. 당신은 건강이 안좋거나 살이 많이 쪄서 비만인 상황입니다.\n " +
                "이 게임은 운동을 할 때마다 체지방이 빠지며 체지방이 0이 될때까지 운동을 하거나 3대500이라는 목표치를 달성할정도로 운동을 오래하면\n" +
                "클리어하는 게임입니다. 처음 헬스장을 등록하기 전에 운동기구에 대해서 낯설고 어려워하는 사람들에게 친숙하게 느껴지기 위해 게임형식으로 만들었습니다.\n" +
                "운동기구를 물리쳐가는 '헬스월드'를 통해서 건강을 되찾고 멋있는 사람이 되어봅시다!\n" +
                "==================================================================================================================================================\n" +
                "==================================================================================================================================================\n" +
                "+++            +++      ++++++++++++++++++                 ++++                +++                   +++++++++++++++++       +++            +++   \n" +
                "+++            +++      ++++++++++++++++++                ++++++               +++                   +++++++++++++++++       +++            +++   \n" +
                "+++            +++      ++++++++++++++++++               +++  +++              +++                   +++++++++++++++++       +++            +++   \n" +
                "+++            +++      +++                             +++    +++             +++                         +++               +++            +++   \n" +
                "+++            +++      +++                            ++++    ++++            +++                         +++               +++            +++   \n" +
                "++++++++++++++++++      ++++++++++++++++++            ++++++++++++++           +++                         +++               ++++++++++++++++++   \n" +
                "++++++++++++++++++      ++++++++++++++++++           ++++++++++++++++          +++                         +++               ++++++++++++++++++   \n" +
                "+++            +++      +++                         ++++++++  ++++++++         +++                         +++               ++++++++++++++++++   \n" +
                "+++            +++      +++                        ++++++++    ++++++++        +++                         +++               +++            +++   \n" +
                "+++            +++      ++++++++++++++++++        +++++++        +++++++       +++++++++++++++++           +++               +++            +++   \n" +
                "+++            +++      ++++++++++++++++++       ++++++            ++++++      +++++++++++++++++           +++               +++            +++   \n" +
                "+++            +++      ++++++++++++++++++      +++++                +++++     +++++++++++++++++           +++               +++            +++   \n" +
                "==================================================================================================================================================\n" +
                "==================================================================================================================================================\n";

        slowPrint(str, 2);

        System.out.println("당신의 캐릭터 번호를 골라주세요.");
        System.out.println("1. Guy 2. Lady 3. Gorilla");
        int num = sc.nextInt();

        if (num == 1) {

            System.out.println("Guy가 선택되었습니다.");
            human = new Guy();
            human.fat = 100;
            human.muscle = 35;
            human.level = 0;
            human.hp = 100;
            human.stressResistance = 20;
            human.money = 10;

        } else if (num == 2) {

            System.out.println("Lady가 선택되었습니다.");
            human = new Lady();
            human.fat = 200;
            human.muscle = 20;
            human.level = 0;
            human.hp = 100;
            human.stressResistance = 15;
            human.money = 10;

        } else if (num == 3) {

            System.out.println("Gorilla가 선택되었습니다.");
            human = new Gorilla();
            human.fat = 500;
            human.muscle = 100;
            human.level = 0;
            human.hp = 100;
            human.stressResistance = 30;
            human.money = 10;

        }

        System.out.println("캐릭터의 이름을 입력하세요. : ");
        human.name = sc.next();
        System.out.println("이름이 입력되었습니다.");

        bgm.start();


        System.out.println("반갑습니다 " + human.name + "님. " + human.name + "님의 MBTI는 무엇입니까? 당신의 성격에 맞는 스포츠를 추천해 드립니다. (예: ISFP)");
        String Mbti = sc.next();


        Mbti[] words = new Mbti[16];
        words[0] = new Mbti("ISTJ", "단정하고 반듯함의 표본. 혼자 차분히 목표를 향해 나아가는 '수영' 추천\n");
        words[1] = new Mbti("ISFJ", "세심하고 꼼꼼하며 인내심과 책임감이 강함. 몸의 변화를 섬세하게 찾아가는 '필라테스' 추천\n");
        words[2] = new Mbti("INTJ", "지적 욕구가 강하고 논리적인 편. 장기적인 승부에 강하고 독립적이고 계획적인 '피트니스' 추천\n");
        words[3] = new Mbti("INFJ", "생각이 많고 싶어서 혼자서 정리할 시간 필요. 과하게 생각하고 몰두하는 경향이 있기에 수련을 통해 마음의 균형을 찾을 수 있는 '요가' 추천\n");
        words[4] = new Mbti("ISTP", "조용하고 과묵하지만 신체적 능력이 뛰어나고 민첩하여 체육에 특화된 유형.기구를 사용할 섬세한 기술이 필요한 '패러글라이딩' 추천\n");
        words[5] = new Mbti("ISFP", "공감 능력이 아주 뛰어나고 혼자만의 시간이 중요함. 자연적이고 목가적인 것에 관심이 많아 사색의 시간을 가질 수 있는 '등산' 추천\n");
        words[6] = new Mbti("INTP", "쉴 새 없이 생각하며 한가지에 파고드는 기질이 강함. 정상에 도달하기 위한 루트를 짜기위해 두뇌력과 지구력을 필요로 하는 '클라이밍' 추천\n");
        words[7] = new Mbti("INFP", "긍정적이고 온화한 성격이지만 스트레스에 취약하여 감정 기복이 심함. 아름답게 자신을 표현하며 에너지를 발산 할 수 있는 '발레' 추천\n");
        words[8] = new Mbti("ESTP", "자유분방함. 스포츠를 가장 즐기는 유형. 자신감이 넘치고 활동적인 것을 좋아함. 도전 욕구가 강해서 사람들과 경쟁할 수 있고 격하게 스릴 있는 운동 적합. \n" +
                " 육감이 발달. 몸의 감각을 즉각적으로 느끼며 민첩함을 요구하는 '복싱' 추천.\n");
        words[9] = new Mbti("ESFP", "사교성이 많고 긍정적임. 주목받는 것을 좋아함. \n" +
                "계획적으로 반복되는 운동은 힘들 수 있어서 줌바, 에어로빅, 탄츠 같은 '댄스 스포츠' 추천 \n");
        words[10] = new Mbti("ENFP", "반복되는 일상에서 벗어나고 싶어함. 독립적이고 자유로운 삶 추구.\n" +
                "위기 대처 능력이 탁월하고 순발력이 좋아 여러 가지 기술이 필요, 집중력을 요구하는 '스케이트 보드' 추천.\n");
        words[11] = new Mbti("ENTP", "두뇌 회전이 빠르고 상상력도 풍부함. 하지만 끈기가 없는 편이어서 쉽게 흥미를 잃어버리기 때문에\n" +
                "여름에는 '서핑', 겨울에는 '스키' 추천. '스케이트보드'도 좋음.\n");
        words[12] = new Mbti("ESTJ", "조직적이고 계획적임. 목적의식 분명하고 현실적인 성향.\n" +
                "자기 시간을 가지는 것을 좋아하고 다수보다는 소수와의 관계에서 더 빛을 발하기 때문에\n" +
                "계획적이고 치밀하게 접근할 수 있는 '골프' 추천.\n");
        words[13] = new Mbti("ESFJ", "공감 능력이 뛰어나고 배려를 잘함.\n" +
                "경쟁에 스트레스를 받고 변화보다는 계획적인 것을 좋아함. 그래서 팀으로 루틴을 만들어 운동할 수 있는 '크로스핏' 추천.\\n ");
        words[14] = new Mbti("ENFJ", "사람을 좋아하며 친절하고 따뜻함. 화합과 협동에 능함.\n" +
                "경쟁에 취약한 성향이며 혼자만의 시간이 꼭 필요하기 때문에 무리속에 있어도 혼자만의 시간을 가질 수 있는 '러닝' 추천.\n");
        words[15] = new Mbti("ENTJ", "본투비리더인 ENTJ는 조직과 체계에 능하고 계획적.\n" +
                "그래서 사람들과 적당히 어울리며 두뇌를 쓰는 운동이 적합하여 상대를 분석하고 원리를 이해해야 하는 '테니스' 추천.\n");


        for (int i = 0; i < words.length; i++) {
            if (words[i].getMbti().equals(Mbti)) {
                words[i].Mbti_display();
                break;
            }

        }

        while (true) {

            System.out.println("==========================================");
            System.out.println("==========================================");
            System.out.println(human.name + "님." + "당신의 현재 스텟은 다음과 같습니다. \n");
            System.out.println(human.name + "의 레벨 : " + human.level);
            System.out.println(human.name + "의 경험치 : " + human.experience);
            System.out.println(human.name + "의 근육량 : " + human.muscle);
            System.out.println(human.name + "의 체지방 : " + human.fat);
            System.out.println(human.name + "의 체력 : " + human.hp);
            System.out.println(human.name + "의 스트레스 : " + human.stress);
            System.out.println(human.name + "의 스트레스내성도 : " + human.stressResistance);
            System.out.println(human.name + "의 돈 : " + human.money);
            System.out.println("==========================================");
            System.out.println("==========================================");




            System.out.println("입장할 장소를 입력하세요. : ");
            System.out.println("1. 헬스장");
            System.out.println("2. 장비상점");
            System.out.println("3. 음식점");
            System.out.println("4. 집");
            num = sc.nextInt();

            if (num == 1) {
                Monster monster = new Monster();
                Gym gym = new Gym();
                bgm.stop();
                fight.start();
                eq.stop();
                rest.stop();
                food.stop();

                str = "로딩중입니다! ■■■■■■■■■■■■■■■■■■";
                slowPrint(str, 100);

                System.out.println("헬스장에 입장하였습니다.");
                System.out.println("1. 덤벨");
                System.out.println("2. 바벨");
                System.out.println("3. 벤치프레스");
                System.out.println("4. 랫풀다운");
                System.out.println("5. 레그프레스");
                System.out.println("6. 로잉머신");
                System.out.println("7. 3대500");
                System.out.println("운동할 기구의 번호를 입력하세요. : ");
                num = sc.nextInt();

                MyTask task = new MyTask() {
                    public void run() {
                        System.out.println(LocalDateTime.now() + " : 앞으로도 규칙적으로 이 시간에 하길 바랍니다.  "
                                + Thread.currentThread().getName());
                        cancel();
                    }
                };

                // 타이머 객체 생성
                Timer timer = new Timer();
                long delay = 3000L;
                long period = 1000L;
                System.out.println(LocalDateTime.now() + " : 당신은 이 시간에 운동을 하군요! ");
                timer.scheduleAtFixedRate(task, 1000, 1000);
                // 1초후에 1초 간격으로 반복

                try {
                    // 2초후에 스레드를 멈춘다.
                    Thread.sleep(2000);
                    timer.cancel();

                } catch (InterruptedException exc) {
                    timer.cancel();
                }
                // 타이머 취소

                int temp = human.money;

                if ((human.money = Gym.show(human.money, num)) != -1) {
                    System.out.println("운동기구 사용이 가능합니다.");

                    if (num == 1) {

                        monster = new Dumbbell();
                        monster.name = "덤벨";
                        monster.hp = 500;
                        monster.level = 1;
                        monster.muscle = 10;
                        monster.fat = 5;
                        monster.money = 10;
                        monster.experience = 10;
                        monster.stress = 3;
                        System.out.println(monster.name + "로 운동을 시작합니다.");
                    }
                    if (num == 2) {

                        monster = new Barbell();
                        monster.name = "바벨";
                        monster.hp = 1000;
                        monster.level = 3;
                        monster.muscle = 30;
                        monster.fat = 5;
                        monster.money = 30;
                        monster.experience = 20;
                        monster.stress = 6;
                        System.out.println(monster.name + "로 운동을 시작합니다.");
                    }
                    if (num == 3) {

                        monster = new Benchpress();
                        monster.name = "벤치프레스";
                        monster.hp = 1500;
                        monster.level = 5;
                        monster.muscle = 50;
                        monster.fat = 10;
                        monster.money = 50;
                        monster.experience = 30;
                        monster.stress = 9;
                        System.out.println(monster.name + "로 운동을 시작합니다.");
                    }
                    if (num == 4) {

                        monster = new Latpulldown();
                        monster.name = "랫풀다운";
                        monster.hp = 2000;
                        monster.level = 6;
                        monster.muscle = 60;
                        monster.fat = 10;
                        monster.money = 60;
                        monster.experience = 30;
                        monster.stress = 9;
                        System.out.println(monster.name + "으로 운동을 시작합니다.");
                    }
                    if (num == 5) {

                        monster = new Legpress();
                        monster.name = "레그프래스";
                        monster.hp = 2500;
                        monster.level = 7;
                        monster.muscle = 70;
                        monster.fat = 10;
                        monster.money = 70;
                        monster.experience = 30;
                        monster.stress = 9;
                        System.out.println(monster.name + "로 운동을 시작합니다.");
                    }
                    if (num == 6) {

                        monster = new Rowingmachine();
                        monster.name = "로잉머신";
                        monster.hp = 3000;
                        monster.level = 8;
                        monster.muscle = 80;
                        monster.fat = 10;
                        monster.money = 80;
                        monster.experience = 30;
                        monster.stress = 9;
                        System.out.println(monster.name + "으로 운동을 시작합니다.");
                    }
                    if (num == 7) {

                        monster = new SBD();
                        monster.name = "3대500";
                        monster.hp = 20000;
                        monster.level = 10;
                        monster.muscle = 100;
                        monster.fat = 30;
                        monster.money = 1000;
                        monster.experience = 100;
                        monster.stress = 9;
                        System.out.println(monster.name + "으로 운동을 시작합니다.");

                    }
                }
                while (true) {
                    System.out.println(human.name + "이 운동합니다.");
                    monster.exercised(human.exercise());



                    if (monster.name.equals("3대500") && monster.hp <= 0) {
                        str = "3대 500을 클리어했습니다. \n ========헬스트레이너 엔딩======== \n 당신은 이제 유명한 헬스트레이너가 되었습니다!";
                        slowPrint(str, 100);


                        System.exit(0);
                        break;
                    }


                   /* Monster finalMonster = monster;
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public synchronized void run() {
                            if (finalMonster.hp <= 0 )
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("===============================조언===============================");
                                    System.out.println("==운동 후에는 영양을 섭취해야합니다. 운동 후 음식점에 가서 식사를 해주세요!==");
                                    System.out.println("=================================================================");

                                    try {

                                        Thread.sleep(1000);
                                    } catch (InterruptedException exc) {

                                    }
                                }
                        }
                    });
                    thread.start();
                    */

                    if (monster.hp <= 0) {

                        System.out.println(monster.name + "이(가) 죽었습니다." + monster.name + "이(가) 죽어 \n" +
                                "경험치 " + monster.experience + " 을 얻고 돈 " + monster.money + "원을 얻었습니다.");
                        human.experience += monster.experience;
                        human.money += monster.money;
                        human.stress += monster.stress;
                        human.fat -= monster.fat;
                        break;

                    }

                    System.out.println(monster.name + "이 운동당합니다.");
                    human.exercised(monster.exercise());

                    if (human.hp <= 0) {
                        str = human.name + "의 hp이 0이하가 되어 죽었습니다.\n" +
                                "================죽음 엔딩================ \n 본인에게 무리한 운동은 죽음을 초래합니다. Hint.운동만 하지말고 잘챙겨먹고 장비도 착용해서 체력을 유지하세요!";
                        slowPrint(str, 100);

                        System.exit(0);

                           /*human.hp = 10;
                           System.out.println(human.name + "이 체력" + human.hp + "으로 부활했습니다.");*/
                        break;
                    }
                }
            } else if (num == 2) {

                str = "로딩중입니다! ■■■■■■■■■■■■■■■■■■";
                slowPrint(str, 100);

                EquipStore equipStore = new EquipStore();
                System.out.println("장비 상점에 입장하였습니다.");
                System.out.println("1. 풀업밴드 (50원)");
                System.out.println("2. 리프팅 벨트 (100원)");
                System.out.println("3. 베르사 그립 프로 (150원)");
                System.out.println("4. 무릎보호대 (200원)");
                System.out.println("현재 돈이 " + human.money + "원 있습니다.");
                System.out.println("원하시는 물건의 번호를 입력하세요. : ");



                bgm.stop();
                fight.stop();
                eq.start();
                rest.stop();
                food.stop();

                num = sc.nextInt();
                int temp = human.money;

                if ((human.money = equipStore.show(human.money, num)) != -1) {
                    System.out.println("구입이 완료되었습니다.");

                    if (num == 1) {
                        human.hp += 5;
                        human.muscle += 10;
                    }
                    if (num == 2) {
                        human.hp += 15;
                        human.muscle += 20;
                    }
                    if (num == 3) {
                        human.hp += 30;
                        human.muscle += 30;
                    }
                    if (num == 4) {
                        human.hp += 60;
                        human.muscle += 40;
                    }

                    System.out.println(human.money + "원 남았습니다.");
                } else {
                    System.out.println("돈이 부족합니다.");
                    System.out.println(human.money + "원 남았습니다.");
                }
            } else if (num == 3) {

                str = "로딩중입니다! ■■■■■■■■■■■■■■■■■■";
                slowPrint(str, 100);

                Foodstore foodstore = new Foodstore();
                System.out.println("음식점에 입장하였습니다.");
                System.out.println("1. 샐러드 (10원) 2. 고구마 (5원) 3. 닭가슴살 (5원) 4. 과일 (2원) 5. 밥 (10원) 6. 빵 (3원) 7. 라면 (5원) 8. 패스트푸드 (10원) 9. 단백질보충제 (50원)");
                System.out.println("원하시는 음식의 번호를 입력하세요.");



                bgm.stop();
                fight.stop();
                eq.stop();
                rest.stop();
                food.start();

                num = sc.nextInt();
                int temp = human.money;

                if ((human.money = foodstore.show(human.money, num)) != -1) {
                    System.out.println("구입이 완료되어 돈이 ");

                    if (num == 1) {
                        human.hp += 20;
                        human.fat -= 6;
                    }
                    if (num == 2) {
                        human.hp += 20;
                        human.fat -= 3;
                    }
                    if (num == 3) {
                        human.hp += 20;
                        human.fat -= 2;
                        human.muscle += 3;
                    }
                    if (num == 4) {
                        human.hp += 10;
                        human.fat -= 1;
                    }
                    if (num == 5) {
                        human.hp += 30;
                        human.fat += 10;
                        human.stress -= 8;
                    }
                    if (num == 6) {
                        human.hp += 30;
                        human.fat += 15;
                        human.stress -= 2;
                    }
                    if (num == 7) {
                        human.hp += 30;
                        human.fat += 20;
                        human.stress -= 4;
                    }
                    if (num == 8) {
                        human.hp += 40;
                        human.fat += 36;
                        human.stress -= 12;
                    }
                    System.out.println(human.money + "원 남았습니다.");

                } else {
                    System.out.println("돈이 부족합니다.");
                    System.out.println(human.money + "원 남았습니다.");
                }
            } else if (num == 4) {

                str = "로딩중입니다! ■■■■■■■■■■■■■■■■■■";
                slowPrint(str, 100);


                Home home = new Home();
                System.out.println("집에 입장하였습니다.");
                System.out.println("1. 휴식 2. 수면");
                System.out.println("원하시는 활동의 번호를 입력하세요.");


                bgm.stop();
                fight.stop();
                eq.stop();
                rest.start();
                food.stop();

                num = sc.nextInt();
                int temp = human.money;

                if ((human.hp = home.show(human.hp, num)) != -1) {
                    System.out.println("활동이 완료되었습니다.");

                    if (num == 1) {
                        human.hp += 20;
                    }
                    if (num == 2) {
                        human.hp += 100;
                    }
                }
                System.out.println(human.money + "원 남았습니다.");
            } else {
                System.out.println("돈이 부족합니다.");
                System.out.println(human.money + "원 남았습니다.");
            }

            if (human.experience >= human.level * 80) {

                human.level += 1;
                System.out.println(human.name + "의 레벨이 " + human.level + "이 되었습니다.");
                human.money += human.level * 50;
                System.out.println("레벨업 보상으로 돈이 " + human.level * 50 + "원 증가하여");
                System.out.println(human.money + "원이 되었습니다.");
                human.muscle += human.level * 10;
                System.out.println("레벨업 보상으로 근육량이 " + human.level * 10 + " 증가하여");
                System.out.println(human.muscle + "이 되었습니다.");
                human.stressResistance += human.level * 5;
                System.out.println("레벨업 보상으로 스트레스내성도가 " + human.level * 5 + " 증가하여");
                System.out.println(human.stressResistance + "이 되었습니다.");
                human.experience = 0;
                human.stress = 0;
            }
            if (human.fat <= 0) {
                str = human.name + "의 체지방이 0이 되었습니다. 축하합니다! \n ================몸짱엔딩================\n" + human.name + "은 근사한 몸매를 가지게 되어 바디 프로필을 찍을 수 있게 되었습니다!";
                slowPrint(str, 100);

                System.exit(0);
            }


        }

            /*Thread.Body myBody = new Thread.Body(0, 100, 10, 100, 10, 20, 10, 100);
            String body = sc.next();

            System.out.println("당신이 할 것을 선택해 주세요. 그러면 해당 할 것을 하기위한 장소로 이동합니다.\n" +
                      " 1. 운동 -> 헬스장\n" +
                      " 2. 일 -> 일하는 곳\n" +
                      " 3. 식사 -> 집\n" +
                      " 4. 보충제 먹기 -> 집\n" +
                      " 5. 물마시기 -> 집\n" +
                      " 6. 휴식 -> 집\n" +
                      " 7. 술약속 -> 술집\n" +
                      " 8. 부차적 스포츠 -> 부차적 스포츠 하는 곳\n" +
                      " 9. 수면 -> 집");

            String num = sc.next();

            String[][] place = new String [9][2];
            place [0][0] = "1";
            place [0][1] = "당신은 헬스장에 갑니다. 헬스장에 도착했습니다. 무슨 운동을 하시겠습니까?\n" +
                                "1. 어깨 운동 2. 등 운동 3. 팔 운동 4. 가슴 운동 5. 복근 운동 6. 앞다리 운동 7. 뒷다리 운동 8. 종아리 운동";
               /* String area = sc.next();
              for(int y=0; y< place.length; y++){
                  for(int r=0; r<place[y].length; r++){
                      if(place[y][r].equals(area)){
                          System.out.println(place[y][2]);
                          break;
                      }
                  }
              }



            place [1][0] = "2";
            place [1][1] = "일하는 곳에 갑니다. 시간당 만원을 벌 수 있습니다. 몇시간 일하시겠습니까?\n" +
                            "1. 1시간 2. 2시간 3. 3시간 4. 4시간 5. 5시간 6. 6시간";


            place [2][0] = "3";
            place [2][1] = "집에서 식사를 합니다. 식사는 어떤 식사를 하시겠습니까?\n" +
                            "1. 샐러드 2. 고구마 3. 닭가슴살 4. 과일 5. 채소 6. 백반 7. 빵 8. 라면 9. 치킨 10. 피자 11. 햄버거";

            place [3][0] = "4";
            place [3][1] = "집에서 보충제를 먹습니다. 보충제는 어떤 것을 먹겠습니까?\n" +
                            "1. 게이너 2. MPH 3. BCAA 4. 아르기닌 5. 프로글루타민 ";

            place [4][0] = "5";
            place [4][1] = "집에서 물을 마십니다. 물은 얼마나 마시겠습니까?\n" +
                            "1. 1리터 2. 2리터 3. 3리터 ";

            place [5][0] = "6";
            place [5][1] = "집에서 휴식을 취합니다. 휴식은 몇시간 취하시겠습니까?\n" +
                            "1. 1시간 2. 2시간 3. 3시간 4. 4시간 ";

            place [6][0] = "7";
            place [6][1] = "술집에 갑니다. \n" + "술마신 후 돈이 10만원 감소하며 스트레스 30감소, 체지방 10증가, 근육량 10감소 합니다.";


            place [7][0] = "8";
            place [7][1] = "부차적 스포츠를 할 수 있는곳에 가서 부차적 스포츠를 합니다. 스트레스가 20 감소합니다";

            place [8][0] = "9";
            place [8][1] = "집에 가서 수면을 취합니다. 체력이 100까지 증가합니다.";

            for(int i=0; i< place.length; i++){
               for(int y=0; y<place[i].length; y++){
                  if(place[i][y].equals(num)){
                      System.out.println(place[i][1]);
                      break;
                  }
               }
            }*/
    }
}



