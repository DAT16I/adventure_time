//DO THIS!
import java.util.Scanner;
public class AdventureTime {
   public static void main(String[] args) {
      String locations = "lumbridge, varrock, falador, Karamja, Wilderness";
      String location = "lumbridge";
      Scanner scanner = new Scanner(System.in);
      int skills[] = {1,1,1,1,1};
      String name;
      String weapon;
      int pomocka=821454854;
      int difolt=1750;
      double hp=20;
      int combat;
      int pigeons=666;
      String number;
      String way;
      int input = 0;
      int inputin = 0;
      int frags = 0;
      String choice;
      String choicein;
      //end of declarations
      System.out.println("Tell me your name adventurer!");
      name = scanner.nextLine();
      System.out.println("Welcome to the Lumbridge " + name+"!");
      delay(difolt);     
      //weapon select
      System.out.println("");
      System.out.println("What would you like to choose as your starting weapon?");
      System.out.println("available weapons: sword, staff, bow, bat, bread");
      weapon = scanner.nextLine();
      switch (weapon) {
      case "sword": pomocka=1; break;
      case "staff": pomocka=1; break;
      case "bow": pomocka=1; break;
      case "bat": pomocka=2; break;
      case "bread": pomocka=2; break;  
      default: System.out.println("I don't offer such a weapon, don't you try to annoy me!");
      delay(difolt);
      System.out.println("I'll let you choose once again, choose wisely!");
      weapon = scanner.nextLine();
      switch (weapon) {
      case "sword": pomocka=1; break;
      case "staff": pomocka=1; break;
      case "bow": pomocka=1; break;
      case "bat": pomocka=2; break;
      case "bread": pomocka=2; break;  
      default: System.out.println("I WARNED YOU! DON'T FUCK WITH ME!");
      delay(difolt);
      System.out.println("*swings*");
      delay(1500);
      death();  //death
      }}//end of switch  
   if (pomocka==1) {
   System.out.println("Wise choice "+name+"!");  
   } else {
    System.out.println("People always seem to surprise me!");
   }//end of weapon select
   delay(difolt);
      System.out.println("");
      System.out.println("Choose the biggest number you can think of");
      number = scanner.nextLine();  
     for (int br = 1;br>0;br++){
     System.out.println("Which way do you want to go? (left / right)");
      way = scanner.nextLine();
      if (way.equals("left")){//beggining of left
         delay(difolt);
         System.out.println("A dragon grabs you by your "+weapon);
         delay(difolt);
         System.out.println("You hold onto it tightly, you are getting air time");
         delay(difolt);
         System.out.println("As the seconds flow, you are losing your consciousness");
         delay(2*difolt);
            for (int heresy=1;heresy<50;heresy++){System.out.println("");}
         System.out.println("*LOADING*");
            for (int loading=1;loading<=20;loading++){
            delay(250);System.out.print("#");
              }
            for (int heresi=1;heresi<50;heresi++){System.out.println("");}
            //-------------------------------------------------------CS:GO----------------------------------------------------------------
         System.out.println("You respawned as a CT on de_cache");
         hp=100;
         delay(difolt);
         while (input==0){//while
         System.out.println("What weapon do you want to buy? (m4; awp; deagle)"); 
            weapon = scanner.nextLine();
             System.out.println("");         
                  switch (weapon) {//switch
                     case "m4": input=1; break;
                     case "awp": input=1; break;
                     case "deagle": 
                        delay(difolt);
                        votekick(name);//kicked                   
                     default: System.out.println("no such weapon");
                  }//end of switch
                  }//end of while
      System.out.println("A fellow teammate is asking you for a pistol drop");
      delay(difolt);
   input=0;    
     while (input==0){//while
         System.out.println("do you want to drop him? (yes / no)");
            choice = scanner.nextLine();
             System.out.println("");         
                  switch (choice) {//switch
                     case "yes":
                           System.out.println("He yells at you in russian but otherwise you are fine");
                           input=1; break;
                     case "no": 
                           System.out.println("Everyone is staring at you, his voicechat icon has appeared");
                           delay(difolt);
                           System.out.println("*indistinct russian swearing*");
                           delay(difolt);
                           votekick(name);
                           input=1; break;                 
                     default: System.out.print("Let me ask you again, ");
                  }//end of switch
                  }//end of while
                  delay(difolt);
         System.out.println("");
 input=0;
 inputin=0;      
       while (input==0){//while
         System.out.println("which site do you want to defend? (a / b)");
            choice = scanner.nextLine();
             System.out.println("");         
                  switch (choice) {//switch
                     case "a":
                           System.out.println("Your teammate dinks you because he doesn't want you to be here (remaining hp: 70)");
                           hp=70;
                           delay(difolt);
                           System.out.println("");
                                           while (inputin==0){//while
                                     System.out.println("Do you want to turn around and go B instead? (yes / no)");
                                 choicein = scanner.nextLine();
                                  System.out.println("");         
                                       switch (choicein) {//switch
                                          case "yes":
                                                inputin=1; break;
                                          case "no": 
                                                System.out.println("Your teammate shoots you in the head 3 more times while letting out an angry roar");
                                                delay(difolt);
                                                smrt();
                                                inputin=1; break;                 
                                          default: System.out.print("Let me ask you again, ");
                                       }//end of switch
                                       }//end of while                                                                                                                                                                                                               
                           input=1; break;
                     case "b":                         
                           input=1; break;                 
                     default: System.out.print("Let me ask you again, ");
                  }//end of switch
                  }//end of while
//end of site selection
   delay(difolt);
     System.out.println("You set yourself in a good position patiently waiting for the enemies");  
      delay(difolt);
       System.out.println("Generous gods have rewarded you for choosing to play on B, you hear the enemies coming");
      delay(difolt);
      input=0;
            while (input==0){//while
         System.out.println("do you want to tell your teammates, which are elsewhere? (yes / no)");
            choice = scanner.nextLine();
             System.out.println("");         
                  switch (choice) {//switch
                     case "yes":
                           System.out.println("One of your teammates screams \"SHAT AP AMERIKAN, KIK XIM\"");
                           delay(difolt);
                           votekick(name);
                           input=1; break;
                     case "no": 
                           System.out.println("your teammates are oblivious of the situation");
                           delay(difolt);
                           System.out.println("they all die and you are left in a 1v5 situation");
                           delay(difolt);
                           input=1; break;                 
                     default: System.out.print("Let me ask you again, ");
                  }//end of switch
                  }//end of while
System.out.println("The first terrorist enters the site but you easily take him down with your "+weapon);
delay(difolt);
input=0;
 while (input==0){//while
         System.out.println("do you want to throw one of your flashbangs? (yes / no)");
            choice = scanner.nextLine();
             System.out.println("");         
                  switch (choice) {//switch
                     case "yes":
                     hp=hp-40;
                           System.out.println("You skillfully throw your first flashbang, killing a fully blinded T");
                            System.out.println("You also take 40 damage (remaining hp: "+hp+")");
                            delay(difolt);
                           input=1; break;
                     case "no": 
                           System.out.println("Terrorists are flowing into the site, firing at you from multiple angles");
                           delay(difolt);
                           System.out.println("You succumb to their superior firepower");
                           delay(difolt);
                            smrt();
                           votekick(name);
                           input=1; break;                 
                     default: System.out.print("Let me ask you again, ");
                  }//end of switch
                  }//end of while
               delay(difolt);
      System.out.println("You watch as an enemy flashbang is flying inside the site");
      delay(difolt);
      input=0; 
      while (input==0){//while
         System.out.println("what do you do? You can spam the entrance, reload or flee (spam / reload / flee");
            choice = scanner.nextLine();
             System.out.println("");         
                  switch (choice) {//switch
                     case "spam":
                           if (weapon.equals("awp")){
                           System.out.println("your "+weapon+" is not very effective, you miss your shots and you are taken down");
                           delay(difolt);
                           smrt();
                           }else{//if m4
                            System.out.println("All you can see is white, after your vision restores you see that there are 4 out of 5 enemies dead");
                            delay(difolt);
                            System.out.println("Out of nowhere the last Terrorist stabs you in your back");
                            delay(difolt);
                            smrt();  
                           }//end of if weapon 
                           input=1; break;
                     case "reload": 
                           System.out.println("You reload your magazine during the blindtime");
                           delay(difolt);                      
                           input=1; break;     
                      case "flee": 
                           System.out.println("Your teammates get angry");
                           delay(difolt);                          
                           votekick(name);
                           input=1; break;                  
                     default: System.out.print("Let me ask you again, ");
                  }//end of switch
                  }//end of while               
                        System.out.println("You peek from behind the box and you one click a terrorist who was blinded by his teammate");
                        delay(difolt);
                  System.out.println("You hear steps behind a wall close to you");
                      delay(difolt);
                      input=0;
                     while (input==0){//while
         System.out.println("do you want to take a better cover or to throw a grenade? (cover / grenade)");
            choice = scanner.nextLine();
             System.out.println("");         
                  switch (choice) {//switch
                     case "cover":
                           System.out.println("You are now hiding behind a pile of concrete");
                           delay(difolt);
                            System.out.println("A blazing rag inside of a bottle is flying towards you");
                            delay(difolt);
                             System.out.println("*glass shattering*");
                             delay(500);
                             while (hp>0){hp=hp-5;  System.out.println("HP: "+hp);delay(200);}
                             smrt();  
                           input=1; break;
                     case "grenade": 
                           System.out.println("you throw the primed grenade behind the wall by bouncing it off the doorframe");
                           delay(difolt);
                           System.out.println("the explosion kills one of the 2 remaining enemies");
                           delay(difolt);
                           input=1; break;                 
                     default: System.out.print("Let me ask you again, ");
                  }//end of switch
                  }//end of while
               System.out.println("You try to go for the wallbang, you are hailing bullets into it");
               delay(difolt);
               if (weapon.equals("m4")){//m4
                 System.out.println("You empty your whole magazine");
                 delay(difolt); 
                 System.out.println("Now you are facing an important decission"); 
                 delay(difolt);
                 input=0;
                   while (input==0){//while
         System.out.println("do you want to reload or try to kill the enemy with the knife? (reload / knife)");
            choice = scanner.nextLine();
             System.out.println("");         
                  switch (choice) {//switch
                     case "reload":
                           System.out.println("You get as close to the wall as it is possible, the enemy hears the reload sound and starts raining bullets");
                           delay(difolt);
                          System.out.println("Right as he enters your plain sight");
                          delay(500);
                          System.out.println("");
                          System.out.println("*click* *click*");
                          delay(difolt); 
                          System.out.println("you still haven't finished reloading and he has a knife out already");
                           delay(difolt);
                           System.out.println("you throw away your "+weapon+" and soon after you receive a knife stab");
                           delay(difolt);
                           hp=hp-55;
                           System.out.println("you take 55 damage (remaining hp: "+hp+")");
                           delay(difolt);
                           if (hp>0){
                              System.out.println("You strike with your StatTrak Karambit | Fade");
                              delay(difolt);
                              System.out.println("His face makes a very uncomfortable expression");
                              delay(difolt);
                              System.out.println("You notice the shrapnel wounds caused by your grenade");
                              delay(difolt);
                              System.out.println("He falls to the ground dead");
                              delay(difolt);
                              System.out.println("COUNTER-TERRORISTS WIN");
                              delay(difolt);
                              System.out.println("*broken russian voice*");
                              delay(difolt);
                              System.out.println("FAKIN KNUP HAKER KIK");
                              delay(difolt);
                              votekick(name);
                           }else{
                           delay(difolt);
                           smrt();
                           }//THE END LOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLOLO
                           input=1; break;
                     case "knife": 
                           System.out.println("You pull out your knife, as soon as you run past the edge of the entrance");
                           delay(difolt);
                           System.out.println("the terrorist is there waiting to pop your head off");
                           delay(500);
                           smrt();
                           input=1; break;                 
                     default: System.out.print("Let me ask you again, ");
                  }//end of switch
                  }//end of while            
               }else{//awp
                System.out.println("After your third shot you hear your enemy being damaged");
                delay(difolt);
                System.out.println("In panic he storms the corner and hits you right in the left eye");
                delay(difolt);
                smrt();  
                  }  //end of if                     
      break;
      }//end of left   //also end of the game //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      else if (way.equals("right")){
      System.out.println("You encounter a pathetic griffin");
      delay(difolt);
      System.out.println("He laughs at your existence");
      delay(difolt);
      System.out.println("Do you want to use your "+weapon+"? (yes / no)");
      way = scanner.nextLine();
            if (way.equals("yes")){
                  switch (weapon){
                           case "sword":System.out.println("You point your "+weapon+"at him");
                           delay(difolt);
                           System.out.println("He is not amused");
                           delay(difolt);
                           death();//death
                       break;
                           case "staff":System.out.println("Your Walmart staff flees as they see this hellspawn");
                           delay(difolt);
                           System.out.println("The fat pathetic griffin eclipses the sun");
                           delay(difolt);
                           System.out.println("You feel an enormous pressure coming from above");
                           delay(difolt);
                           death();//death
                       break;
                           case "bow":delay(difolt);
                           death();//death
                       break;
                           case "bat":System.out.println("Your pet bat gives you an insecure look");
                           delay(difolt);
                           System.out.println("The griffin, scared shitless, slips on a bunch of rats and dies");
                           delay(difolt);
                           hatch();
                           System.out.println("OH?");
                           delay(2*difolt);
                           System.out.println("Your bat has hatched the");
                           delay(difolt);
                            nanana();
                                  System.out.println("BATMAN");
                             nanana();
                             delay(difolt);
                               System.out.println("A new superpower unlocked!");
                               delay(difolt);
                                System.out.println("MONEY"); 
                                delay(difolt);
                                 System.out.println("Do you want to buy the victory?");  
                                way = scanner.nextLine(); 
                                if (way.equals("yes")){
                                delay(difolt);
                                System.out.println("Congratulations, you win the game!");  
                                       System.exit(1); //WIN     
                                } else {delay(difolt); 
                                System.out.println("As you turn around, a mysterious knight equipped with full rune and a scimmy appears");
                                delay(difolt);
                                death();//death
                                 }
                        break;
                           case "bread":delay(difolt);
                           System.out.println("A group of pigeons flapping their wings furiously is charging you");
                           delay(difolt);
                           System.out.println("Your starting life total is 20");
                           delay(difolt);
                              for (combat=1;pigeons>0;combat++){
                                 System.out.println("*you swing with the "+weapon+"*");
                                 delay(difolt);
                                 System.out.println("A pigeon has been slain");
                                 delay(difolt);
                                 pigeons--;
                                 System.out.println(pigeons+" pigeons left");
                                 delay(difolt);
                              }//end of combat
                           System.out.println("You successfully defended your "+weapon+"!");
                           delay(difolt);
                           System.out.println("You went to the den to celebrate your triumph");
                           delay(difolt);
                                System.out.println("Congratulations, you win the game!");  
                                       System.exit(1); //WIN 
                        break;//break from switch
                       }//end of switch           
                   }//end of yes  
                   else {//no weapon
                           delay(difolt);
                           System.out.println("The weight of your weapon caused your pants to fall down");
                           delay(difolt);
                           System.out.println("You are now stranded with a horny griffin with nowhere to escape");
                           delay(difolt);
                           System.out.println("");
                           delay(difolt);
                           lennyface();
                           System.exit(1);//GAME OVER
                        }//end of no weapon  
      break;//break from no weapon, nepotrebne lebo v no weapon skape
      }//end of right
      else {}//end of repeat nevkladat nic dnu, ak sa stane toto, zopakuje sa vyber left/right
    }//end of right/left loop  
          System.out.println("if this was printed, something went wrong");   
}//end of main/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static void smrt(){
   death();
   }//end of smrt  
   
   /*
   delay shortens the whole try and catch thing, its' purpose is its' name
   */
   public static void delay(int d)   {
   try {
    Thread.sleep(d);                 
       } catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
                                        }
                                     }//end of delay
    public static void votekick(String nickname){
      System.out.println("vote: kick player "+nickname+"?");
                        System.out.println("YES: 1     NO:1");
                        delay(1800);
                        System.out.println("YES: 2     NO:1");
                        delay(250);
                        System.out.println("YES: 3     NO:1");
                        delay(1000);
                        System.out.println("YES: 4     NO:1");
                        System.out.println("vote passed!");
                        delay(3000);
                        System.out.println("Disconnected: You have been kicked from the server");                     
                        System.exit(1);//kicked 
    }//end of votekick                                 
   public static void nanana(){
   for (int nana=1;nana<3;nana++)
      {
       for (int batman=1;batman<8;batman++){
      delay(150); System.out.print("na");
       }//end of batman
       System.out.println("na");
       }
   }//end of nanana
   public static void lennyface() {
        System.out.println("");
        System.out.println("                                       `.-:/+osssssso+/:.`                                         ``-:/+osssssso+/:.`                                ");
        System.out.println("                   `/s+`            `:+yhdddddddsoooosyyhhs/.`         :sso.                    `-+yhdddddddsoooosyyhhs/.`    `/s+`                   ");
        System.out.println("                  .sdy.           `/yysydy/.../hh:  ````.:+yhs-`       +ddh.                  `/yhsydy/.../yh:  ````.:+yhs:`   .sdy-                  ");
        System.out.println("                 -yds.          `:yy/..hh-     -dy`        `-oho.      +ddh.                `:yh/.`hd-     -hy`        `-oho.   `odh:                 ");
        System.out.println("                -hdy.            ..`  .yh:    `/dy`          `..`      +ddh.                 ...  `yd:    `:dy`          `..`    `sdh:                ");
        System.out.println("               .hdh-                   -yho:::ohs.                     +dddys+:`                   -yho:::ohs-                    .ydh-               ");
        System.out.println("              `ydd/`                    `:+sss+-`                      /hhhhdddy/`                  `:+sss+:`                      :ddy.              ");
        System.out.println("              /ddh.                        ```                         `....:odddo`                    ```                         `ydd+`             ");
        System.out.println("             `yddo                                                           `/ddd/                                                 +ddh.             ");
        System.out.println("             .ddd/                                                            `sddh`                                                -ddd-             ");
        System.out.println("             -ddd:                                                             /ddd.                                                .ddd:             ");
        System.out.println("             -ddd:                                                             +ddd.                                                .ddd:             ");
        System.out.println("             .hdd/                                               ..-.         `yddy`                                                :ddd-             ");
        System.out.println("             `sdds`                                             `ohdy.       .oddd:                                                 oddy`             ");
        System.out.println("              :ddd.                                              .yddho:---:+yddh/`                                                .hdd/              ");
        System.out.println("              `oddo`                                              `+hdddddddddho-                                                 `+dds`              ");
        System.out.println("               `ydd:                                        `..`    `-/+ooo+:-`          `..`                                     -hdh.               ");
        System.out.println("                .ydh-                                       `/hy:``                    `-oho.                                    .ydh-                ");
        System.out.println("                 .ydy-                                        .+hyo:.````       ````.-+yhs-`                                    .ydy-                 ");
        System.out.println("                  `ody-                                         `:oyhhyso+++++++osyyhhs/.`                                     .yds.                  ");
        System.out.println("                   `:+/`                                           `.-/+ossyyysso+/:.`                                        `:+:`                   ");
        System.out.println(""); 
      }//end of lennyface
   public static void hatch()     {
   System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
   System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
   System.out.println(":::::::::::::::::::::/osyyso+:::::::::::::::::::::");
   System.out.println("::::::::::::::::::+ymMMMMMNNmdy+::::::::::::::::::");
   System.out.println("::::::::::::::::+dMMMMMMMMNNmmdhy+::::::::::::::::");
   System.out.println(":::::::::::::::yNMMMMMMMMNNNmmmdddy/::::::::::::::");
   System.out.println(":::::::::::::/dNMMMMMMMMMNNNmmmmdddh/:::::::::::::");
   System.out.println("::::::::::::/dNMMMMMMMMMNNNmmmmmdhhdh+::::::::::::");
   System.out.println(":::::::::::+mNMMMMMMMMMNNNNmmmmmdyyyhd+:::::::::::");
   System.out.println("::::::::::/mMMMMMMNMNNNNNNmddhhddhyyydd+::::::::::");
   System.out.println("::::::::::dMMMMMMMMMNNNNmhyyyyyyyyhhhddh::::::::::");
   System.out.println(":::::::::oMMMMMMMMMMNNNhyyyyyyyyysshdddds:::::::::");
   System.out.println(":::::::::mMMMMMMMNNNNNhyyyyyyyyssssyddddh:::::::::");
   System.out.println("::::::::/NMMMMMMMMNNNmyyyyyyyyssssssddddd/::::::::");
   System.out.println("::::::::+NMMMMMNNNNNNhyyyyyyysssssssddddd/::::::::");
   System.out.println("::::::::/NNNNNNNNNNNNhyyyyssssssssshddddd/::::::::");
   System.out.println(":::::::::hmNNNNNNNNNNmhyyssssssssshdddddy:::::::::");
   System.out.println(":::::::::/yhdmNNNNNmmmmhysssssssshdddddd/:::::::::");
   System.out.println("::::::::::/syyhdmmmmmmmmdhyssyyhddddmmd+::::::::::");
   System.out.println("::::::::::::oyyyyyhdmmmddddddddddddmdy/:::::::::::");
   System.out.println(":::::::::::::/ossssssyhddddddddddddy+:::::::::::::");
   System.out.println("::::::::::::::::+oossssddddddhhhs+::::::::::::::::");
   System.out.println(":::::::::::::::::::://oooooo+/::::::::::::::::::::");
   System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
   System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
   }//end of hatch
   public static void death()     {
     System.out.println("    		                      ...----....");
     System.out.println("                         ..-:\"''         ''\"-..");
     System.out.println("                      .-'                      '-.");
     System.out.println("                    .'              .     .       '.");
     System.out.println("                  .'   .          .    .      .    .''.");
     System.out.println("                .'  .    .       .   .   .     .   . ..:.");
     System.out.println("              .' .   . .  .       .   .   ..  .   . ....::.");
     System.out.println("             ..   .   .      .  .    .     .  ..  . ....:IA.");
     System.out.println("            .:  .   .    .    .  .  .    .. .  .. .. ....:IA.");
     System.out.println("           .: .   .   ..   .    .     . . .. . ... ....:.:VHA.");
     System.out.println("           '..  .  .. .   .       .  . .. . .. . .....:.::IHHB.");
     System.out.println("          .:. .  . .  . .   .  .  . . . ...:.:... .......:HIHMM.");
     System.out.println("         .:.... .   . .\"::\"'.. .   .  . .:.:.:II;,. .. ..:IHIMMA");
     System.out.println("         ':.:..  ..::IHHHHHI::. . .  ...:.::::.,,,. . ....VIMMHM"); 
     System.out.println("        .:::I. .AHHHHHHHHHHAI::. .:...,:IIHHHHHHMMMHHL:. . VMMMM");
     System.out.println("       .:.:V.:IVHHHHHHHMHMHHH::..:\" .:HIHHHHHHHHHHHHHMHHA. .VMMM.");
     System.out.println("       :..V.:IVHHHHHMMHHHHHHHB... . .:VPHHMHHHMMHHHHHHHHHAI.:VMMI");
     System.out.println("       ::V..:VIHHHHHHMMMHHHHHH. .   .I\":IIMHHMMHHHHHHHHHHHAPI:WMM");
     System.out.println("       ::\". .:.HHHHHHHHMMHHHHHI.  . .:..I:MHMMHHHHHHHHHMHV:':H:WM");
     System.out.println("       :: . :.::IIHHHHHHMMHHHHV  .ABA.:.:IMHMHMMMHMHHHHV:'. .IHWW");
     System.out.println("       '.  ..:..:.:IHHHHHMMHV\" .AVMHMA.:.'VHMMMMHHHHHV:' .  :IHWV");
     System.out.println("        :.  .:...:\".:.:TPP\"   .AVMMHMMA.:. \"VMMHHHP.:... .. :IVAI");
     System.out.println("       .:.   '... .:\"'   .   ..HMMMHMMMA::. .\"VHHI:::....  .:IHW'");
     System.out.println("       ...  .  . ..:IIPPIH: ..HMMMI.MMMV:I:.  .:ILLH:.. ...:I:IM");
     System.out.println("      : .   .'\"' .:.V\". .. .  :HMMM:IMMMI::I. ..:HHIIPPHI::'.P:HM.");
     System.out.println("     :.  .  .  .. ..:.. .    :AMMM IMMMM..:...:IV\":T::I::.\".:IHIMA");
     System.out.println("     'V:.. .. . .. .  .  .   'VMMV..VMMV :....:V:.:..:....::IHHHMH");
     System.out.println("      \\\"IHH:.II:.. .:. .  . . . \" :HB\"\" . . ..PI:.::.:::..:IHHMMV\"");
     System.out.println("        :IP\"\"HHII:.  .  .    . . .'V:. . . ..:IH:.:.::IHIHHMMMMM\"");
     System.out.println("         :V:. VIMA:I..  .     .  . .. . .  .:.I:I:..:IHHHHMMHHMMM");
     System.out.println("         :\"VI:.VWMA::. .:      .   .. .:. ..:.I::.:IVHHHMMMHMMMMI");
     System.out.println("         :.\"VIIHHMMA:.  .   .   .:  .:.. . .:.II:I:AMMMMMMHMMMMMI");
     System.out.println("        :..VIHIHMMMI...::.,:.,:!\"I:!\"I!\"I!\"V:AI:VAMMMMMMHMMMMMM'");
     System.out.println("        ':.:HIHIMHHA:\"!!\"I.:AXXXVVXXXXXXXA:.\"HPHIMMMMHHMHMMMMMV");
     System.out.println("          V:H:I:MA:W'I :AXXXIXII:IIIISSSSSSXXA.I.VMMMHMHMMMMMM");
     System.out.println("            'I::IVA ASSSSXSSSSBBSBMBSSSSSSBBMMMBS.VVMMHIMM'\"'");
     System.out.println("             I:: VPAIMSSSSSSSSSBSSSMMBSSSBBMMMMXXI:MMHIMMI");
     System.out.println("            .I::. \"H:XIIXBBMMMMMMMMMMMMMMMMMBXIXXMMPHIIMM'");
     System.out.println("            :::I.  ':XSSXXIIIIXSSBMBSSXXXIIIXXSMMAMI:.IMM");
     System.out.println("            :::I:.  .VSSSSSISISISSSBII:ISSSSBMMB:MI:..:MM");
     System.out.println("            ::.I:.  ':\"SSSSSSSISISSXIIXSSSSBMMB:AHI:..MMM.");
     System.out.println("            ::.I:. . ..:\"BBSSSSSSSSSSSSBBBMMMB:AHHI::.HMMI");
     System.out.println("            :..::.  . ..::\":BBBBBSSBBBMMMB:MMMMHHII::IHHMI");
     System.out.println("            ':.I:... ....:IHHHHHMMMMMMMMMMMMMMMHHIIIIHMMV\"");
     System.out.println("              \"V:. ..:...:.IHHHMMMMMMMMMMMMMMMMHHHMHHMHP'");
     System.out.println("               ':. .:::.:.::III::IHHHHMMMMMHMHMMHHHHM\"");
     System.out.println("                 \"::....::.:::..:..::IIIIIHHHHMMMHHMV\"");
     System.out.println("                   \"::.::.. .. .  ...:::IIHHMMMMHMV\"");
     System.out.println("                        \"V::... . .I::IHHMMV\"'");
     System.out.println("");
      System.out.println("GAME OVER"); 
      System.exit(1); 
   }//end of death
}//end of AdventureTime ;<