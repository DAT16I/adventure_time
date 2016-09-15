import java.util.*;
import java.io.*;

public class Game
{
  public static boolean token=true;
  public static void main(String args[])throws  FileNotFoundException {  
  
      Scanner input = new Scanner(System.in);
      putFile("temple.txt");
      System.out.println("HAHHAHAHAAHH !!!   Mortal, beware of entering my temple !");
      System.out.println("If you are not wise enough death will be your prise !");
      System.out.println("But first, let's hear your senseless name : ");
      String name = input.nextLine();
      System.out.println("Are you sure ?  (yes/no)");
      String answer = input.nextLine();
      if(answer.equals("yes"))System.out.println("How can you be after Einstein's relativity theory ? Nevermind , let's proceed !");
      else {
         if(answer.equals("no"))System.out.println("You seemed odd from the start ! i like you , let's proceed !");
            else System.out.println("Some seriosity here please !");
            }
      System.out.println("So tell me ! Will you have the courage ? I expect a simple answer (yes/no)");
      answer = input.nextLine();
      
      if (answer.equals("yes")){
       System.out.println("Let's put your mind to work. Think and answer fast, you have limited time !");
       allRiddles();

       }else
         if (answer.equals("no")){
           System.out.println("Then run you shall, scaried little one ! :)");
           }else System.out.println("Give me another answer"); 
     }
     
      /* method for opening and printing a file
       * @param nameFile name of file to open
       */
       
     public static void putFile(String nameFile)throws  FileNotFoundException{
      Scanner file = new Scanner(new File(nameFile));
      while (file.hasNextLine()) {
            System.out.println(file.nextLine());
            }
           }
    /* method for printing a riddle  
     *
     */      
     public static void riddle(String riddleTxt, String ans, String comment){
        if(token){
           System.out.print("\n\n\n\n\n\n\n\n\n");
           System.out.println(riddleTxt);
           System.out.print("\nTime :");

           for(int i=15; i>=1;i--){
            if(i>=10)System.out.print(i+"  ");
             else System.out.print(i+"   ");
              try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            if(i==6 || i==11)System.out.print("\n      ");
           }
            System.out.print("\nYour answer: ");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            if(answer.equals(ans)){
              System.out.println("Correct ! "+ comment);
              try {
                Thread.sleep(4000);
              } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
               }

              else {
               token=false;
               System.out.println("Wrong ! You lost and you can begin to cry  !!!");
               }
          }
     }
     public static void allRiddles()throws  FileNotFoundException{
      riddle("What has roots as nobody sees,\nIs taller than trees Up, up, up it goes,\nAnd yet never grows?","mountain", "You are not worthless after all ");
      riddle("Voiceless it cries,\nWingless flutters,\nToothless bites,\nMouthless mutters. . . ","wind", "Who knew you are that good");
      riddle("It cannot be seen, cannot be felt,\nCannot be heard, cannot be smelt.\nIt lies behind stars and under hills,\nAnd empty holes it fills.\nIt comes first and follows after,\nEnds life, kills laughter.","dark", "Let's not have a long day please !");
      riddle("A box without hinges, key or lid,\nYet golden treasure inside is hid.","egg", "You can stop already i wanna sleep ");
      riddle("Alive without breath,\nAs cold as death;\nNever thirsty, ever drinking,\nAll in mail never clinking","fish","Ok ok i know you watched the movie :(");
      System.out.println("Ok mortal, next one may be too difficult even for you . Don't you wanna go home ? (yes/no)");
      Scanner inn= new Scanner(System.in);
      String an = inn.nextLine();
      if(an.equals("no")){
         System.out.println("Ok i will not mis you !");
         System.out.println("");
         putFile("soldier.txt");
         System.out.println("Will you fight him or not ? (yes/no)");
         String ans2 = inn.nextLine();
         if(ans2.equals("no"))System.out.println("Good , come inside , i have some tea for you !");
         else{
            if(ans2.equals("yes"))System.out.println("You fool !! Only lasy people survive these thug days !");
            else  System.out.println("What ...?!?!");
         }
         }
      else{
       if(an.equals("yes"))System.out.println(":) You know where is the exit ! Don't let your mam wait, go cry !");
         else System.out.println("That is not what i want to hear !");
         }
     }
}