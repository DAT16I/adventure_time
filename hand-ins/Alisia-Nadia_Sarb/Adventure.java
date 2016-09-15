import java.io.*;
import java.util.*;
public class Adventure
{
   public static void main (String args[])throws Exception
   {

      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      String name,reason,choice;
      String Reason1="future";
      String Reason2="answer";
      String choice1="fight";
      String choice2="run";
      String choice4;
      String choice3="wednesday";
      int challenges=5;
      int chances=2;
      String answer1;
      String answer2="time";
      String Yes="yes";
      String No="no";
      String AnswerQuestion;
      String susie;
      write("Hello mortal,who are you and what brings you in the land of magic?\nDo you maybe want me to tell you the future or do you want to find the answer to a question?");
      /*Give the name
       And the reason
       The reason may be future or answer.
      */
      name=br.readLine();
      reason=br.readLine();

      write("My name is " + name + " and the reason why am I here is for the  " +  reason );

        if(reason.equals(Reason1))
             {
               write("The power of knowing the future is a blessing and a curse in the same time.\nSo if you really want to know you'll have to prove me thet you are strong enough.");
               write("Do you thing you are strong enough to pass all my tests?\n Are you going to fight or are you going to run?");
               choice=br.readLine();
               if(choice.equals(choice1))
                     write("Hahaha!I don't if you are really brave or really stupid.But I accept your answer.Let's begin.");

                else
                    if(choice.equals(choice2))
                         {
                           write("I knew from the first second I saw you that you were a coward.");
                           Gameover();
                           }

              }
      else
           if(reason.equals(Reason2))
               write("Ok!I hope that you are not going to ask me the meaning of life.\nBut before I answer your question you have to pas a test. ");
      write("Before you start I should warn you that you only have 2 chances.\nIf you refuse or if you lose a challenge you are going to lose a chance.\nYou have to pas 5 quests to succeed");
      write("Let's begin.Your first quest is a riddle. ");
      write("Wednesday, Tom and Joe went to a restaurant and ate dinner. \nWhen they were done they paid for the food and left.\n But Tom and Joe didn't pay for the food. \nWho did?");
      choice4=br.readLine();
      if(choice4.equals(choice3))
        { write("Correct.");
          challenges--;
          Challenges(challenges);

         }
      else
          {
          chances--;
          Chances(chances);
          Fine();}
      write("Now with my magic I am going to send you in your worst nightmare.\nDo you want to fight it or do you want to run?");
      choice=br.readLine();

      if(choice.equals(choice1))
         {write("I am impressed by your courage.Stay calm you passed the quest.I was only testing you.");

         challenges--;
         Challenges(challenges);
         }
      else
          if(choice.equals(choice2))
             {write("I was expecting more from you.You didn't pas this test.");
               chances--;
               Chances(chances);
               Fine();
              if(chances==0)
                 Gameover();
              }
      write("Your next quest a riddle again.");
      write("What flies without wings?");
      answer1=br.readLine();
      if(answer1.equals(answer2))
         {write("Are you cheating?Because you are right again. ");

          challenges--;

          Challenges(challenges);
          }
       else
            {write("It was really easy I don't understand how could you get it wrong.Maybe you should start reading more ");
               chances--;
               Chances(chances);
               Fine();
              if(chances==0)
                 Gameover();
             }
       write("Now you are going to have to dress like a mermaid and go outside to sing.\nRemember you can refuse the quest.");
       choice=br.readLine();
       if(choice.equals(choice1))
          {write("When you started to sing I began to regret my decision.If someone ever told you that you could sing he/she was lying.You are terrible.");
                     challenges--;
                     Challenges(challenges);
           }
       else
           {write("I don't know if I your decision should make me  happy or sad ");

            chances--;
            Chances(chances);
            Fine();
             if(chances==0)
                 Gameover();
            }
       write("The next quest and the most importan one.");
       write("You'll have to write : I saw Susie sitting in a shoe shine shop.");
       choice=br.readLine();
       if(choice.equals(choice1))
          susie= br.readLine();
       else
        if(choice.equals(choice2))
         {write("You are a disappoiment");
         chances--;
         Chances(chances);
         Fine();
          if(chances==0)
                 Gameover();
            }


        write("Congratulation!");
        write("I don't remember what you asked for but it doesn't mater because I wasn't going to do it anyways.");
        write("I did everything to see how far are you ready to go for what you want");
        for(int i=1;i<=10;i++)
           {
              write("You are really great!So now leave and go aftr your dreams because there are still a  lot of people that I have to test.!");

           }




    }
   public static void write(Object line)
   {
      System.out.println(line);
   }
   public static void Challenges(int quest)
   { write("You still have " + quest + " challenges");
   }
   public static void Chances(int chance)
   { write("You  have " + chance + " chance");
   }
   public static void Fine()
   {for(int i=1;i<=5;i++)
     write("You should be ashamed!It was so easy.");

   }

   public static void Gameover()
   {
      write("Game over!!!\nYou have to leave and never came back!\nMagic is not for everyone! ");
      System.exit(0);

}
}
   
