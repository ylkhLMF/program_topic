package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Copyright: Copyright (c) 2020 Dreamfly
 *
 * @ClassName: GamePoker
 * @Description: 扑克小游戏
 * @version: v1.0.0
 * @author: liumf
 * @date: 15:40 2020/3/20
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 15:40       liumf           v1.1.0
 */
public class GamePoker {

    /** 一副扑克牌 */
    List<String> poker = new ArrayList<>();
    /** 花色 */
    String[] colors = new String[]{"♣","♠","♥","♦"};
    /** 数字 */
    String[] numbers ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    /** 定义玩家 */
    List<String> player01 = new ArrayList<>(16);
    List<String> player02 = new ArrayList<>(16);
    List<String> player03 = new ArrayList<>(16);
    /** 底牌 */
    List<String> holdCard = new ArrayList<>(16);


    /**
     * 第一步:组装54张牌
     */
    public void assemblyPoker(){
        this.poker.add("大王");
        this.poker.add("小王");
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color+number);
                // System.out.println(color+number);
            }
        }
    }

    /**
     * 第二步:洗牌
     */
    public void shuffle(){
        Collections.shuffle(poker);
    }

    /**
     * 第三步:发牌
     */

    public void dealPoker() {

        for (int i = 0; i < poker.size(); i++) {

            if (i >=poker.size()-3) {
                holdCard.add(poker.get(i));
            }else if (i % 3 == 0) {
                player01.add(poker.get(i));
            }else if (i % 3 == 1) {
                player02.add(poker.get(i));
            } else {
                player03.add(poker.get(i));
            }
        }
    }

    public static void main(String[] args) {
        GamePoker gamePoker = new GamePoker();
        gamePoker.assemblyPoker();
        System.out.println("洗牌前:"+gamePoker.poker);
        // 洗牌
        gamePoker.shuffle();
        System.out.println("洗牌后:"+gamePoker.poker);
        // 发牌
        gamePoker.dealPoker();
        System.out.println("赌神牌面:"+gamePoker.player01);
        System.out.println("赌侠牌面:"+gamePoker.player02);
        System.out.println("赌圣牌面:"+gamePoker.player03);
        System.out.println("底牌:"+gamePoker.holdCard);
    }

}