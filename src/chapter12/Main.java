package chapter12;

import java.sql.SQLData;

public class Main {
    public static <character, character> void main(String[] args) {
        //Slime s = new SuperHero();
        //Slime を　SuperHeroとして実体化　NG

        //扱えるメソッドの違い
        Character w = new Wizard();
        Matango m = new Matango();
        w.name = "アサカ";
        w.attack(m);

        character[] chara = new character[3];
        character h = new Hero();
        h.name = "ミナト";
        character t = new Thief();
        t.name = "ミナト";
        t.name = "タケシ";
        chara[0] = w; //アサカ
        chara[1] = h; //ミナト
        chara[2] = t; //タケシ

        Hostelry host = new Hostelry(); //宿屋
        host.heeling(chara);

        //多態性を使ったメソッド
        Monster s = new Slime();
        Monster g = new Goblin();
        Hero h2 = new Hero();
        h2.attack(s);
        h2.attack(g);
        System.out.println("モンスターの動き");
        for(Monster monster : mons){

        }
    }
}