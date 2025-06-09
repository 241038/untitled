package chapter9;

public class Main {
    public static void main(String[] args) {
        //インスタンス
        Sword s = new Sword(); //剣
        s.name = "炎の剣";
        s.damege = 10;
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;
        h1.sword = s; //クラス型の代入
        System.out.println("装備品は" + h1.sword.name);

        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard z = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;

        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
    }
}
