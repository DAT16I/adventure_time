import java.io.*;
import java.util.*;

//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------
//-------------- Rolandas Gedgaudas Trockis DAT16i ---------------------------------
//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------

public class RGTgame{
    public static void main(String[] args) throws IOException{
    //--------------------------PART1-Name introduction------------------------------

    
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("<<<<<QUEST GAME.PART 1>>>>>\n");
                       
      System.out.println("Player One, tell your name, please: ");
      String plrName1 = input.readLine();
      System.out.println("Hi " + plrName1 + ", nice to meet you.\n");
      nameLength(plrName1);
            
      System.out.println("Player Two, what's your name?: ");
      String plrName2 = input.readLine();
      System.out.println("Nice to meet you " + plrName2 + "\n");
      nameLength(plrName2);
      
      sameName(plrName1, plrName2);
            
      System.out.println("How old are you " + plrName1 + "?: ");
      int plrAge1 = Integer.parseInt(input.readLine());
      
      
      System.out.println("And how old are you " + plrName2 + "?: ");
      int plrAge2 = Integer.parseInt(input.readLine());
            
      youngerOlder(plrName1, plrAge1, plrName2, plrAge2);
      
    //--------------------------PART2-Quiz------------------------------
      
       System.out.println("<<<<<QUEST GAME.PART 2>>>>>\n");  
       System.out.println("You are at the gates of the city \"Nick\".\n Answer 3 questions and collect points.\n" +
       "You have 3 attempts to each question.\n 1Question = 1 Point." +
       "If you want to get into the city , your score must be at least 2 points.");  
       quiz(plrName1, plrName2);
       
    //--------------------------PART3------------------------------
       System.out.println("<<<<<QUEST GAME.PART 3>>>>>\n");
       System.out.println("You have entered into the city \"Nick\".\n");
       
          
    }
    
    // Static counter variable
    public static int count = 0;
    
    //------------------------- Part 1 Methods ------------------------------------------
    
    //Method that counts name length
    public static void nameLength (String name) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int x = name.length();
         if (x < 5){
            System.out.println("BTW, " + name + " is a short name, isn't it? (Only " + x + " letters)\n");
           } else {
              String shortName = name.substring(0, 4);
              System.out.println("Wow, " + name + " is a long name. (" + x + " letters, rigth?)");
              System.out.println("Can I call you just " + shortName + "?\n(Y/N):");
              String answer = input.readLine();
                  if (answer.equals("Y") || answer.equals("y") ){
                        System.out.println("Thanks, I'll just call you " + shortName + " then.\n");
                   } else if (answer.equals("N") || answer.equals("n")){
                        System.out.println("Well..ok..." + name.toUpperCase() + "\n");
                     }                
            }
    }
    
    //Method finds if the names are the same
    public static void sameName (String name1, String name2) throws IOException {
      if (name1.equals(name2)){
         System.out.println("Nice! Same names!\n");
      } else {
            System.out.println(name1 + " and " + name2 + " will be the best friends!\n");
        }
    }

    //Method that finds wich player is younger
    public static void youngerOlder (String name1, int age1, String name2, int age2){
           if (age1 < age2){
            int x = age2 - age1;
            System.out.println(name1 + ", you are " + x + " years younger than " + name2 + ".\n");
           } else if (age1 == age2)
               {System.out.println("Oh! You both have born in " + (2016 - age1) + "!\n");
             }
             
                 else {
                    int y = age1 - age2;
                    System.out.println(name1 + ", you are " + y + " older than " + name2 + ".");
                    System.out.println("You must be bigger and stronger than " + name2 + ".");
                    System.out.println("So be good and take care of your younger fellow."); 
                  } 
    }
    
    //------------------- Part 2 Methods -----------------------------------------------------------
    
    //Method asks for answer for numberPi
    public static void numPi () throws IOException {
      System.out.println("What is the value of number Pi?\nAnswer format is x.xx\n");
       double correctD = 3.14;
       quizFlow(0,correctD);    
    }
    
    //Method perimeter of a circle
    public static void formula1 () throws IOException {      
      System.out.println("What is the formula of perimeter of a circle? (write the number of the correct answer).\n"+
      "1. R*D*Pi\n2. D*D*Pi\n3. 2*Pi*R\n4. 4*Pi*R\n");       
      int correct = 3;
      quizFlow(correct, 0);      
    }
    
    //Method random number from 1 to 5
    public static void random() throws IOException {
      System.out.println("Gues the number from 1 to 5.\n");
      int correct = (int )(Math.random() * 5 + 1);
      quizFlow(correct, 0);
     }
    
    //Method for the quiz flow
    public static void quizFlow(int correctAnswerNr, double correctAnswerNrD) throws IOException {
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      int tries = 3;
      int counterAttempt = 1;
      if (correctAnswerNr == 0) {
               double choiseNrD = Double.parseDouble(input.readLine());
               if (correctAnswerNrD == choiseNrD) {
                  System.out.println("The answer is correct!\nYou just earned 1 point.\n");
                  counter();
               } else {
                     do {            
                     System.out.println("Nice try but wrong! You have " + (tries - counterAttempt) + " tries left.Try again: ");
                     counterAttempt++;
                     choiseNrD = Double.parseDouble(input.readLine());
                        if (choiseNrD == correctAnswerNrD) {
                           System.out.println("Yes, that's right!\nYou just earned 1 point.\n");
                           counter();
                        }else if (counterAttempt == 3){
                           System.out.println("Total points: " + count + ". No points earned! You were all 3 times wrong!\n");
                          }      
                     } while (choiseNrD != correctAnswerNrD && counterAttempt < 3 );
                 }
       } else {
            int choiseNr = Integer.parseInt(input.readLine());                 
            if (correctAnswerNr != 0 && choiseNr != correctAnswerNr){      
               do {            
                  System.out.println("Nice try but wrong! You have " + (tries - counterAttempt) + " tries left.Try again: ");
                  counterAttempt++;
                  choiseNr = Integer.parseInt(input.readLine());
                     if (choiseNr == correctAnswerNr) {
                        System.out.println("Yes, that's right!\nYou just earned 1 point.\n");
                        counter();
                     }else if (counterAttempt == 3){
                        System.out.println("Total points: " + count + ". No points earned! You were all 3 times wrong!\n");
                       }      
                  } while (choiseNr != correctAnswerNr && counterAttempt < 3 );
             } else {
                 System.out.println("The answer is correct!\nYou just earned 1 point.\n");
                 counter();
               }
        }

    }

    
    //Method quiz
    public static void quiz(String n1, String n2)throws IOException {       
        if (count <= 1) {
           do{
             System.out.println("So " + n1 + " and " + n2 + " let's play math quiz!\n");
             numPi();
             formula1();
             random();          
           } while(count <2);
        } 
           System.out.println(n1 + " and " + n2 + ", thank you for playing!\nYour score is " + count + ".\nNOT BAD!\n");
           end();
                
    }
    
    //Counter
    public static void counter() throws IOException {
      count++;
      System.out.println("Total points: " + count + ".\n");
        
    }
    //End image
    public static void end() throws IOException {
    System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "ooooooooooooooooooooooooooo/:--:+ooooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "oooooooooooooooooooooooooo.      -oooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "ooooooooooooooooooooooooo:        +ooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "ooooooooooooooooooooooooo+`      -oooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "ooooooooooooooooooooooooooo:`  ./ooooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "ooooooooo+/-.....-:+oooooooo/ `oooooooo+/-.....-:+oooooo+-...:+oooo:...-/ooooooo\n"+
         "ooooooo/.           `:+ooo+-   `:oooo/.           `:ooo/      `+o+.      :oooooo\n"+
         "oooooo-               `/oo`      -o+-               `+o:       /+`       -oooooo\n"+
         "ooooo.       .:-        +o       `o.       :+/`       +:       -`       .+oooooo\n"+
         "oooo+       .ooo+       -o       `/       -ooo+```````::               -oooooooo\n"+
         "oooo/       :oooo       `o       `/       :oooo///////+:              .ooooooooo\n"+
         "oooo/       :oooo       `o       `+       .ooo:       ::               :oooooooo\n"+
         "oooo/       :oooo       `o       `o/       `-.       -o:       :`       .+oooooo\n"+
         "oooo/       :oooo       `o       `oo+.             `:oo:       /o.       `+ooooo\n"+
         "oooo/```````:oooo```````.o```````.oooo/-`       `.:oooo:```````/oo:```````:ooooo\n"+
         "oooooooooooooooooooooooooooooooooooooooooo+///++oooooooooooooooooooooooooooooooo\n"+
         "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n"+
         "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n"
      );

    }
  
}


 