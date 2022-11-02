public class Matango {
    int hp = 50;
    char suffix;
    public Matango(char suffix){
        this.suffix = suffix;
    }
    public void attack(Hero h){
        System.out.println("キノコ"+this.suffix+"の攻撃");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }
}

public class PoisonMatango extends Matango{

    int poisonCount;

    PoisonMatango(char suffix){
        super(suffix);
        poisonCount = 5;
    }
    public void attack(Hero h){
        super.attack(h);
        if(poisonCount > 0){
            System.out.println("さらに毒の胞子をばらまいた！");
            int minusHp = h.hp/5;
            System.out.println(minusHp+"ポイントのダメージ！");
            hp -= minusHp;
            poisonCount--;
        }
    }

}