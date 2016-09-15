import java.io.*;
import java.util.*;
public class AdventureTimeGame
{

   public static void main( String[] args ) throws InterruptedException
      {   
      Scanner scanner = new Scanner(System.in);
      
      /*Dragon's name*/
      
      String dragonName="Fuckyouausarus";
      
      int restart;
      String name;
      int chosenWeapon;
      

      do {
      restart=0;
      //Introduction
      
      System.out.println(" Yo there adventurer! ");
      sleep();
      System.out.println(" Tell me your freaking name, bro: ");
      name = read();
      sleep();
      write(
         " Wazzap " + name + " nice to meet ya!" 
         );
      sleep();
      System.out.println(" Oi, " + name + ", how old are you?");
      String age = read();
      int old = Integer.parseInt(age);
      sleep();
      if( old < 18)
      {
      sleep();
      System.out.println(" A little thug a?.");
      }else{
         if( old>=18 && old<=47){
         sleep();
         System.out.println(" My bro, you're already a man. Nice!");}
         else{
         sleep();
         System.out.println(" Nice, an old fart.. Why are you playing this pops?...Nevermind.");
         }
      }
            
      //Choosing weapon//
      sleep();      
      System.out.println(" Choose a number between 1 and 3. It shall be your teammate, your brother, your f**king everything:");
      String[] weapon = new String[20];
      weapon[0]="8======Dildo";
      weapon[1]="|-|> butt plug";
      weapon[2]="B(.)(.)bs";
      do{
      chosenWeapon = scanner.nextInt();
      if(chosenWeapon<1||chosenWeapon>3){
      System.out.println("Really man?");
      }else{
      sleep();
      System.out.println("Your weapon is : " + weapon[(chosenWeapon-1)]);
      sleep();
      System.out.println("You are into some kinky shit man..");
      }}while(chosenWeapon<1||chosenWeapon>3);
      
      //Start//
      sleep();
      System.out.println("So, how about we start?");
      System.out.println("1.Yes                2.No");
      int start = scanner.nextInt();
      if(start==1) 
      { sleep();
      System.out.println(" That's the spirit! ");
      for(int i=1;i<=4;i++)
         {
         if (i==1){
         sleep();
         System.out.println(i+"." + " On your marks...");
         }
         if (i==2){
         sleep();
         System.out.println(i+"." + " Ready...");
         }
         if (i==3){
         sleep();
         System.out.println(i+"." + " Stop!");
         }
         if (i==4){
         sleep1();
         System.out.println(i+"." + " Kiddin', GO!");
         }

         }
      }else{
         System.out.println(" Want to restart or quit? ");
         System.out.println(" 1.Restart          2.Quit ");
         int choice1 = scanner.nextInt();
         if(choice1==1){
            restart=1;}
         else{
            endGame();
         }
         
      }
  
     } while (restart==1);
     for(int i=1;i<=4;i++){
     sleep1();
     }
     System.out.println(" Be patient dude it's loading, Jesus....");
     for(int i=1;i<=2;i++){
     sleep1();
     }
     System.out.println(" Almost there. These dots are annoying no?");
     for(int i=1;i<=3;i++){
     sleep1();
     }
     System.out.println("Ta-daahh motherf*cker! Done.");
     sleep();
     System.out.println("So, dude, here is the majestic land of... who gives a fu*k?? Yo, you want to move up, down, left or right?");
     
     /*Movements*/
     
     int go;
     do{
     String movement1 = read();
     go=1;
     if(movement1.equals("up")){
       write(" Ok, it's good so far.");
       sleep();
       write(" Ok, next: up, down, left or right?");
       String movement2 = read();
      if(movement2.equals("up")){
      write("You feel into a hole, surprise matha*fka!");
      endGame();}
      if(movement2.equals("left")){
      write("A wild flying f*ck appears. I didn't catch it so you're dead.");
      endGame();
      }
      if(movement2.equals("right")){
      write("Oops. That was the doorbell, brb mate.");
      sleep1();
      bestthing();
      }
      if(movement2.equals("down")){
      write("A wild " + dragonName +" appears!");
      sleep();
      write(" TUN TUN TUN TAAA!");
      sleep1();
      write(" Choose a number : 1.Fight 2.Bag 3.Flee ");
      int numberBattle = scanner.nextInt();
      do{
      if (numberBattle==2){
         write("You found a bottle of vodka!");
         sleep();
         write("Looks like the dragon wants a shot.");
         sleep();
         sleep();
         sleep();
         sleep1();
         write("Ok dude, you're awake?");
         sleep1();
         write("Dude you drank so much that you both got drunk and then poof I found you here. Are you having a headache, right?");
         endGame();
      }
      else{
         if(numberBattle==3){
            write("Such a pu**y. You deserve to die man..");
            sleep1();
            write("The dragon comes from behind and fu**ing kills you coward!");
            endGame();
         }
         else{
          if(numberBattle==1){
          /*Battle weapons*/
          go=1;
            if (chosenWeapon==1){
               write("You draw your dildo and then at full speed you jump and slap him.");
               sleep1();
               write("The dragon obviously burns you to death idiot!");
               endGame();
            }
            else{
            go=1;
               if (chosenWeapon==2){
                  write("You shove the butt plug up his reptilian ass.");
                  sleep1();
                  write("He seems to kinda like it...");
                  sleep1();
                  write("Dude... Wtf he is touching you?!.... I THINK WE SHOULD END IT HERE!");
                  endGame();
               }
               else{
               go=1;
                  if (chosenWeapon==3){
                     write("You show some cleavage.");
                     sleep1();
                     write("I think it's working...");
                     sleep1();
                     write("DUDEEEEEEE, go and flash him!");
                     sleep1();
                     write(name + " used boobs flash.");
                     sleep();
                     write(" It's super affective!");
                     sleep1();
                     write(dragonName + " has fainted.");
                     sleep();
                     write(name + "wins the battle. +35xp gained");
                     write(" YOU F^*%ING WON MAN! So proud... *bro tear*");
                     System.exit(0);
                  }
               
               }
            }
            }else{
            write("Dude, 1,2 or 3.");
            go=1;
            }
          }
         }
         }while(go==0);
         }
         }else{
         write("Nah dude, closed!");
         go=0;
         }
         
         }while(go==0);
     }
      
   
   
   
   //end of main
    
    public static void write(Object line) {
      System.out.println(line);
   }
   
   public static String read() {
      Scanner scanner = new Scanner(System.in);

      return scanner.nextLine();}
      
   public static void endGame() {
      write(
         "WWWWWWASTEEEEEEDDD"
      );
      System.exit(0);
   }
   
   public static void sleep1() throws InterruptedException{
      for(int i=1; i<=5; i++){
         System.out.print(".");
         Thread.sleep(500);         
      }
      System.out.print('\n');
   }
   public static void sleep() throws InterruptedException{
         Thread.sleep(700);         
      System.out.print('\n');}

   public static void bestthing() throws InterruptedException{
         Thread.sleep(700);         
      System.out.println("**************************COFFEE BREAK********************************");}
   
}