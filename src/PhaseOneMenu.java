//Antonio A Guzman 1001647094
import java.util.Scanner;



public class PhaseOneMenu {
    public static void main(String[] args){
        System.out.println("Main Menu");
        System.out.println(" ");
        System.out.println("Choose from the following options.");
        Scanner UserSelectionMenu = new Scanner(System.in);
        System.out.println("Start Game : 1");
        System.out.println("Exit : 2");
        String Menuchoice = UserSelectionMenu.nextLine();
        int choice = Integer.parseInt(Menuchoice);
        int statchoice;
        int choice2=0;

        if(choice==1)
        {
            System.out.println("Choose from the following options.");
            //Scanner PlayerSelect = new Scanner(System.in);
            System.out.println("One Player: 1");
            System.out.println("Two players: 2");
            //System.out.println("Back : 3");
            String Players = UserSelectionMenu.nextLine();
            choice2 = Integer.parseInt(Players);
        }
        else if (choice==2)
        {
            System.exit(0);
        }
        else{
            System.out.println("Invalid selection");
            System.exit(0);
        }

        if(choice2==1){
            String n = " ";
            int L=1;
            int A=15;
            int X=0;
            int H=50;
            int S=0;
            int D=0;
            int C=0;
            int pointstouse=10;
            Player p = new Player(n,L,A,X,H,S,D,C);
            System.out.println("Player 1 enter your name: ");
            //Scanner PlayerName = new Scanner(System.in);
             p.name = UserSelectionMenu.nextLine();
            //System.out.println("Player 1: "+ p.name);
            System.out.printf("Player 1 Name: %s, Level: %d, Armour: %d, Experience: %d, Health: %d, Strength: %d, Dexterity: %d, Constitution: %d",p.name,L,A,X,H,S,D,C);
            System.out.println(" ");
            System.out.println("Use 10 points to improve your attributes.");
            System.out.println("Select from the following options to increase your attributes +1 at a time.");
            //System.out.println("1. +1 Armor");
            //System.out.println("2. +1 Health");
            System.out.println("1. +1 Strength");
            System.out.println("2. +1 Dexterity");
            System.out.println("3. +1 Constitution");
            System.out.println("Points remaining : "+ pointstouse);
            while (pointstouse>0)
            {
                String AttributeChoice = UserSelectionMenu.nextLine();
                statchoice = Integer.parseInt(AttributeChoice);
             if(statchoice ==1){
                S++;
            }
            else if(statchoice == 2){
                D++;
            }
            else if(statchoice == 3){
                C++;
            }
            pointstouse--;
            System.out.printf("Player 1 Name: %s, Strength: %d, Dexterity: %d, Constitution: %d",p.name,S,D,C);
            System.out.println(" ");
                //System.out.println("1. +1 Armor");
                //System.out.println("2. +1 Health");
                System.out.println("1. +1 Strength");
                System.out.println("2. +1 Dexterity");
                System.out.println("3. +1 Constitution");
            System.out.println("Points remaining : "+ pointstouse);
            }
            H+=C;
            A+=D;
            System.out.println(" ");
            System.out.printf("Player 1 Name: %s, Level: %d, Armour: %d, Experience: %d, Health: %d, Strength: %d, Dexterity: %d, Constitution: %d",p.name,L,A,X,H,S,D,C);
            System.out.println(" ");
        }
        else if (choice2==2){
            String n = " ";
            int L=1;
            int A=15;
            int X=0;
            int H=50;
            int S=0;
            int D=0;
            int C=0;
            int pointstouse=10;
            Player p1 = new Player(n,L,A,X,H,S,D,C);
            System.out.print("Player 1 enter your name: ");
            p1.name = UserSelectionMenu.nextLine();
            //Scanner PlayerName = new Scanner(System.in);
            //String Name = UserSelectionMenu.nextLine();
            //System.out.println("Player 1: "+ p1.name);
            System.out.printf("Player 1 Name: %s, Level: %d, Armour: %d, Experience: %d, Health: %d, Strength: %d, Dexterity: %d, Constitution: %d",p1.name,L,A,X,H,S,D,C);
            System.out.println(" ");
            System.out.println("Use 10 points to improve your attributes.");
            System.out.println("Select from the following options to increase your attributes +1 at a time.");
            //System.out.println("1. +1 Armor");
            //System.out.println("2. +1 Health");
            System.out.println("1. +1 Strength");
            System.out.println("2. +1 Dexterity");
            System.out.println("3. +1 Constitution");
            System.out.println("Points remaining : "+ pointstouse);
            while (pointstouse>0)
            {
                String AttributeChoice = UserSelectionMenu.nextLine();
                statchoice = Integer.parseInt(AttributeChoice);
                if(statchoice ==1){
                    S++;
                }
                else if(statchoice == 2){
                    D++;
                }
                else if(statchoice == 3){
                    C++;
                }
                pointstouse--;
                System.out.printf("Player 1 Name: %s, Strength: %d, Dexterity: %d, Constitution: %d",p1.name,S,D,C);
                System.out.println(" ");
                //System.out.println("1. +1 Armor");
                //System.out.println("2. +1 Health");
                System.out.println("1. +1 Strength");
                System.out.println("2. +1 Dexterity");
                System.out.println("3. +1 Constitution");
                System.out.println("Points remaining : "+ pointstouse);
            }
            H+=C;
            A+=D;
            System.out.println(" ");
            System.out.printf("Player 1 Name: %s, Level: %d, Armour: %d, Experience: %d, Health: %d, Strength: %d, Dexterity: %d, Constitution: %d",p1.name,L,A,X,H,S,D,C);
            System.out.println(" ");
            System.out.println(" ");
            pointstouse+=10;


            String n2 = " ";
            int L2=1;
            int A2=15;
            int X2=0;
            int H2=50;
            int S2=0;
            int D2=0;
            int C2=0;
            Player p2 = new Player(n2,L2,A2,X2,H2,S2,D2,C2);
            System.out.print("Player 2 enter your name: ");
            p2.name = UserSelectionMenu.nextLine();
            //Scanner PlayerName = new Scanner(System.in);
            //String Name2 = UserSelectionMenu.nextLine();
            //System.out.println("Player 2: "+ p2.name);
            System.out.printf("Player 2 Name: %s, Level: %d, Armour: %d, Experience: %d, Health: %d, Strength: %d, Dexterity: %d, Constitution: %d",p2.name,L2,A2,X2,H2,S2,D2,C2);
            System.out.println(" ");
            System.out.println("Use 10 points to improve your attributes.");
            System.out.println("Select from the following options to increase your attributes +1 at a time.");
            //System.out.println("1. +1 Armor");
            //System.out.println("2. +1 Health");
            System.out.println("1. +1 Strength");
            System.out.println("2. +1 Dexterity");
            System.out.println("3. +1 Constitution");
            System.out.println("Points remaining : "+ pointstouse);
            //int statchoice = 0;
            while (pointstouse>0)
            {
                String AttributeChoice = UserSelectionMenu.nextLine();
                statchoice = Integer.parseInt(AttributeChoice);
                if(statchoice ==1){
                    S2++;
                }
                else if(statchoice == 2){
                    D2++;
                }
                else if(statchoice == 3){
                    C2++;
                }
                pointstouse--;
                System.out.printf("Player 2 Name: %s, Strength: %d, Dexterity: %d, Constitution: %d",p2.name,S2,D2,C2);
                System.out.println(" ");
                //System.out.println("1. +1 Armor");
                //System.out.println("2. +1 Health");
                System.out.println("1. +1 Strength");
                System.out.println("2. +1 Dexterity");
                System.out.println("3. +1 Constitution");
                System.out.println("Points remaining : "+ pointstouse);
            }
            H2+=C2;
            A2+=D2;
            System.out.println(" ");
            System.out.printf("Player 2 Name: %s, Level: %d, Armour: %d, Experience: %d, Health: %d, Strength: %d, Dexterity: %d, Constitution: %d",p2.name,L2,A2,X2,H2,S2,D2,C2);
            System.out.println(" ");
        }
//            else if (choice2==3){
//            System.out.println("Main Menu");
//            System.out.println(" ");
//            System.out.println("Choose from the following options.");
//            Scanner UserSelectionMenu2 = new Scanner(System.in);
//            System.out.println("Start Game : 1");
//            System.out.println("Exit : 2");
//            String Menuchoice2 = UserSelectionMenu2.nextLine();
//            int choice3 = Integer.parseInt(Menuchoice2);
        //}

        if (choice==1){
            String WPCH1 =" ";
            String DCTP1 =" ";
            int BNS1 = 0;
            String WPNM1;
            System.out.println(" ");
            System.out.println("Player 1 Select your Weapon:");
            System.out.println(" ");
            System.out.println("1. Greataxe");
            System.out.println("2. Longsword");
            System.out.println("3. Warhammer");
            System.out.println("4. Shortsword");
            System.out.println("5. Dagger");
            Weapons W1 = new Weapons(WPCH1,DCTP1,BNS1);
            WPNM1 = UserSelectionMenu.nextLine();
            switch(WPNM1){
                case "1":
                    WPCH1 = "Greataxe";
                    DCTP1 = "1d12";
                    BNS1 = 0;
                break;
                case "2":
                    WPCH1 = "Longsword";
                    DCTP1 = "1d10";
                    BNS1 = 1;
                    break;
                case "3":
                    WPCH1 = "Warhammer";
                    DCTP1 = "1d8";
                    BNS1 = 2;
                    break;
                case "4":
                    WPCH1 = "Shortsword";
                    DCTP1 = "1d6";
                    BNS1 = 3;
                    break;
                case "5":
                    WPCH1 = "Dagger";
                    DCTP1 = "1d4";
                    BNS1 = 4;
                    break;
            }
            W1.name = WPCH1;
            W1.Dicetype = DCTP1;
            W1.Bonus = BNS1;
            System.out.printf("PLayer 1 chosen weapon: %s",WPCH1);
            System.out.println(" ");


        }
        else if (choice==2){
            System.out.println(" ");
            System.out.println("Player 1 Select your Weapon:");
            System.out.println(" ");
            System.out.println("1. Greataxe");
            System.out.println("2. Longsword");
            System.out.println("3. Warhammer");
            System.out.println("4. Shortsword");
            System.out.println("5. Dagger");

            System.out.println(" ");
            System.out.println("Player 2 Select your Weapon:");
            System.out.println(" ");
            System.out.println("1. Greataxe");
            System.out.println("2. Longsword");
            System.out.println("3. Warhammer");
            System.out.println("4. Shortsword");
            System.out.println("5. Dagger");


        }



    }
}
