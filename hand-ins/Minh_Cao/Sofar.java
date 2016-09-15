import java.io.*;
import java.util.*;
public class Sofar{
   public static int life=2;
   public static void main(String[]args) throws IOException{

      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


         Scanner fillin=new Scanner(System.in);//fill

      write("Find your way");   //begin
      write("where are you?");
      write("I am at: ");
      //fill in place
         String place=br.readLine();
      write("OK.If you want the treasure, come over to my place.");

      //choices
      write("Your choice:1. Sure. Where are you?\t 2. Why should I? I am tired. I just want to stay here");

         int choice=fillin.nextInt();

      if(choice==1){
         write("I'll show you the way.");
         lop1();
         Run();
         }
      else if(choice==2) {
         write("GROAAH. You got eaten by lazy monster. Enjoy your time in its stomach");
         life=0;
         }
      else{
         write("You are not interesting at all");
         life=0;
      }


      write("you have "+life+" life");//print out life
      if(life<=1){
         write("you loose. Bye bye");
      }
      else{
         write("you win the game although I don't know why. Congratulations");
      }
      }

   //guessing number task


   public static void write(Object line){
      System.out.println(line);
   }

   public static void lop1(){
      write("Your question, guess the number I am thinking of");
      Scanner fillin=new Scanner(System.in);
      //call a random
      Random ran=new Random();
         int z=ran.nextInt(50)+1;
         int num1=1;
      //loop
      do{
         if (num1>z){
            write("guess again should be smaller");
         }
         else{
            write("bigger num");
         };
         //fill new guess
         num1=fillin.nextInt();
      }while(num1!=z);
      write("congrats");

      }

     // task2



   public static void Run(){
      write("here it comes. Run");
      write("++++++++++++++++++");
      write("press 8 to move forward, 2 to run backward, 4 to turn left and 6 to turn right");
      // fill in choice
      Scanner fillin=new Scanner(System.in);
         int choice=fillin.nextInt();

      // lame things to do ~
      if(choice==8){

            for(int i=1;i<=10;i++){

                write("run");
                if(i==5){
                write("turn left");
                }
                else{
                write("keep moving");
                }
            }
       }

       else if( choice==2 ){
          write("Sorry, it's right behind you");
          for (int e=1;e<10;e++){
              write("blood blood");
          }
          write("you lost a life, your life now: "+(life-=1));

       }
       else if( choice==4 ){
          write("You crash into the wall");
          write("One life has gone with the wind. You have "+(life-=1)+" life");
       }
       else{
          write("Swim, you meet a river. You have one more life for being wet.");
          life+=1;
       }

       }










}



   
