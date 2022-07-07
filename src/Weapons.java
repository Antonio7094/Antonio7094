import java.util.Objects;

public class Weapons{

    public String name;
    public String Dicetype;
    public int Bonus;

    public Weapons(String W,String DT){
        Objects.requireNonNull(W);
        name = W;
        Objects.requireNonNull(DT);
        Dicetype = DT;
        Bonus = 0;
    }

    public Weapons(String W, String DT, int Bonus){
        this(W,DT);
        Bonus = Math.max(0,4);
    }

    public String getName(){
        return name;
    }
    public String getDice(){
        return Dicetype;
    }
    public int getBonus(){
        return Bonus;
    }

    @Override
    public String toString(){
        return String.format("Weapon Name : %s , Dice Type : %s , Weapon Bonus : %d", name, Dicetype, Bonus);
    }
}
