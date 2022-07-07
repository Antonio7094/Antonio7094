import java.util.Objects;

public class Player {
    String name;
     int Level = 0;
     int AC = 0;
     int XP = 0;
     int HP = 0;
     int STR = 0;
     int DEX = 0;
     int CON = 0;

    public Player(String n){
        Objects.requireNonNull(n);
        name = n;
    }

     public Player(String n, int L, int A, int X, int H, int S, int D, int C){
         this(n);
         Level = Math.max(L,0);
         AC = Math.max(A, 10);
         XP = Math.max(X,200);
         HP = Math.max(H,100);
         STR = Math.max(S,10);
         DEX = Math.max(D,10);
         CON = Math.max(C,10);
     }

}


