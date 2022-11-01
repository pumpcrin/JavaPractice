import java.util.*;

public class Cleric {
    String name;
    int hp, mp;
    final int MAX_HP = 50;
    final int MAX_MP = 10;

    public void selfAid(){
        System.out.println(name+"はセルフエイドを唱えた！");
        mp -= 5;
        hp = MAX_HP;
        System.out.println("HPが最大まで回復した！");
    }
    
    public int pray(int second){
        System.out.println(name+"は"+second+"秒間天に祈った！");
        int plusMp = Math.min(MAX_MP - mp, second + Random().nextInt(3));
        mp += plusMp;
        System.out.println("MPが"+plusMp+"回復した！");
        return plusMp;
    }
}
