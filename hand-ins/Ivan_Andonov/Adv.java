import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class Adv {
    public static int h = 10;
    public static int sh = 15;
    public static int dmg = 2;
    public static int sdmg = 4;
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name you unlucky traveler?");
        String name = br.readLine();
        int a;
        int x;
        do{
            System.out.print("Are you ready to start your adventure "+name+"?\n1=yes\n2=no");
            a = Integer.parseInt(br.readLine());
            if(a==2){
                  System.out.println("Who doesn't like adventures? :(");
            }
            else if(a!=1 && a!=2){
                  System.out.println("That is not a valid command.");
            }
        }
        while(a==2 || (a!=1 && a!=2));
        System.out.println("After long hours of hardcore programming, you finally decide to go back home.\nFor some reason even unknown to you, you live in a cabin deep in the forest.\nYou're walking in the woods.\nThere's no one around, and your phone is dead.\nOut of the corner of your eye you spot him, Shia Labeouf.");
        System.out.println("As you feel the chills running down your spine, a sudden fear of death engulfs you.\nWhat will you do to try and get out with your life?\n1 = Try and silently move towards your car.\n2 = Break into a sprint!\n3 = Turn around and try to fight him!");
        do{x = Integer.parseInt(br.readLine());
            if(x==1){
               System.out.println("He's following you\nAbout 30 feet back.\nHe gets down on all fours and breaks into a sprint.\nHe's gaining on you.\nYou start running!");
            }
            else if(x==2){
               System.out.println("He gets down on all fours and breaks into a sprint.\nHe's gaining on you.");
            }
            else if(x==3){
               System.out.println("He dodges your attacks, gets a knife out and in one swift movement stabs you in the chest.\nYou are bleeding out and as you start to lose conscience \nyou feel your body being dragged off somewhere.\n\nYou have died.");
               System.exit(0);
            }

            else if(x!=1 && x!=2 && x!=3){
               System.out.println("That is not a valid command.");
            }
        }
        while(x!=1 && x!=2 && x!=3);
        System.out.println("You're looking for your car, \nBut you're all turned around.\nHe's almost upon you now\nAnd you can see there's blood on his face! \nMy god, there's blood everywhere! ");
        System.out.println("Running for your life\n(From Shia Labeouf.)\nHe's brandishing a knife.\n(It's Shia Labeouf.)\nLurking in the shadows\nHollywood superstar Shia Labeouf.\nLiving in the woods, \n(Shia Labeouf.)\nKilling for sport, \n(Shia Labeouf.)\nEating all the bodies\nActual, cannibal Shia Labeouf.");
        System.out.println("Now it's dark and you seem to have lost him, \nBut you're hopelessly lost yourself.\nStranded with a murderer, \nYou creep silently through the underbrush.\nA-ha! In the distance, \nA small cottage with a light on.\nHope! \nWhat will you do?\n1 = It might be a trap. Continue going through the woods.\n2 = Go towards it.");
        do{
            x = Integer.parseInt(br.readLine());
            if(x==1){
                System.out.println("You go on for 5-10 minutes, not seeing anything behind you. When suddenly\nSomething grabs your leg and takes you down.\nYou look into Shia’s eyes and you realize your death is upon you.");
                System.exit(0);
            }
            else if(x==2){System.out.println("You move stealthily toward it, \nBut your leg! AH! It's caught in a bear trap! ");
            }
            else if(x!=1 && x!=2){
               System.out.println("That is not a valid command.");
            }

        }
        while(x!=1 && x!=2);
        System.out.println("You are dead if you stay idly!\nYouneed to do something fast!\n1 = Continue towards the cottage dragging the trap with you.\n2 = Cut off your leg.\n3 = Stay and hope for the best.");
        do{
            x = Integer.parseInt(br.readLine());
            if(x==1){
               System.out.println("The sound attracts Shia Labeouf.\nYou die.");
               System.exit(0);
            }
            else if(x==3){
               System.out.println("That is a brilliant strategy!\nYou die.");
            }
            else if(x!=1 && x!=2 && x!=3){
               System.out.println("That is not a valid command.");
            }

        }
        while(x!=1 && x!=2 && x!=3);
        System.out.println("Gnawing off your leg, \n(Quiet, quiet.)\nLimping toward the cottage, \n(Quiet, quiet.)\nNow you're on the doorstep, \nSitting inside, Shia Labeouf.\nSharpening an ax, \n(Shia Labeouf.)\nBut he doesn't hear you enter. \nWhat is your next move?\n1 = Sneak up behind him.\n2 = Leave and try to get away.");
        do{
            x = Integer.parseInt(br.readLine());
            if(x==2){
               System.out.println("You do not get far.\nYou die.");
               System.exit(0);
            }
            else if(x!=1 && x!=2){
               System.out.println("That is not a valid command.");
            }
            
        }
        while(x!=1 && x!=2);
        System.out.println("You're sneaking up behind him.");
        //Battle
        System.out.println("Strangling superstar Shia Labeouf.");
        System.out.println("Shia HP : 18 => 15");
        do{
            Options();
            x = Integer.parseInt(br.readLine());
            if(x==1){Attack();}
            else if(x==2){YourStats();}
            else if(x==3){ShiaStats();}
            else if(x==4 && sdmg == 1){System.out.println("Why are you doing nothing");}
            else if(x==4 && sdmg == 4){Disarm();}
            else if(x!=1 && x!=2 && x!=3){
               System.out.println("That is not a valid command.");
            }
            if(h<=0){
               System.out.println("You have died.");
               System.exit(0);
            }
            ShiaAttack();
        }
        while(sh>0 || (x!=1 && x!=2 && x!=3 && x!=4));
        System.out.println("You limp into the dark woods, \nBlood oozing from your stump leg.\nBut you have won.\nYou have beaten Shia Labeouf.\nCongratulations "+name+".");
        System.out.println("Wait! He isn't dead! Shia Surprise!\nThere's a gun to your head, and death in his eyes.\nBut you can do Jiu Jitsu\nBody Slam superstar Shia LaBeouf\nLegendary fight with Shia LaBeouf\nNormal Tuesday night for Shia LaBeouf\nYou try to swing an axe at Shia LaBeouf\nBut blood is draining fast from your stump leg\n\nHe's dodging every swipe, he parries to the left\nYou counter to the right, you catch him in the neck\nYou're chopping off his head now\nYou have just decapitated Shia LaBeouf\n\nHis head topples to the floor, expressionless \nYou fall to your knees and catch your breath\nYou're finally safe from Shia LaBeouf.");
      }
   //Options
   public static void Options(){
         if(sdmg == 4){
            System.out.println("1 = Attack\n2 = Your Stats\n3 = Shia Stats\n4 = Disarm him");
         }
         else if(sdmg == 1){
            System.out.println("1 = Attack\n2 = Your Stats\n3 = Shia Stats\n4 = Wait");
         }
   }
   //Stats
   public static void YourStats(){
         System.out.println("HP = "+h+"\nDMG = "+dmg);
   }
   //ShiaStats
   public static void ShiaStats(){
      if(h<10){
         System.out.println("HP = "+sh+"\nDMG = "+sdmg);
      }
      if(h==10){
         System.out.println("HP = "+sh+"\nDMG = ????");
      }      
   }
   //Attack
   public static void Attack(){
   
         sh -= dmg;
         System.out.println("Shia HP = "+sh);
   }
   //ShiaAttack
   public static void ShiaAttack(){
         h -= sdmg;
         System.out.println("Shia attacks!\nHP = "+h);
   }
   //Disarm
   public static void Disarm(){
         sdmg -= 3;
         dmg += 3;
         System.out.println("You get Shia's knife.\n+ 3 dmg");
   }
}
