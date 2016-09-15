import java.io.*;

public class trei {

   public static void main(String args[]) throws IOException
    {
    
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Welcome to jamrock");
         System.out.println("who are you?");
      String namex = br.readLine();
         System.out.println("Hello"+"\t"+namex);         
      domains();   
    
    }
   public static void domains()throws IOException
    {
    
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     
     System.out.println("\nChoose your domain:"+"\n"+"1.Geography,"+"2.History,"+"3.Science");

   
    int x = Integer.parseInt(br.readLine());
         if(x==1)
         {
          System.out.println("Geography");
       
     System.out.println("first question is:\nThe great Victoria Desert is located in?\n1.West Africa\n2.Australia");
     int a = Integer.parseInt(br.readLine()); 
     if(a==1)
     {
     System.out.println("wrooong"+"\n"+"GAME OVER");
     System.exit(0);
     }
     else if(a==2)
     {
     System.out.println("Genius"+"\t"+"one more to be a millionaire");
     System.out.println("The leading state in producing paper is:"+"\n"+"1.West Bengal"+"\n"+"2.China");
     }
     int b = Integer.parseInt(br.readLine());
     if(b==1)
     {
     System.out.println("It's your lucky day!you won a poney");
     domains();
     }
     else if(b==2)
     {
     System.out.println("so close to become a millionaire");	
     System.exit(0);

     }
      
      }
        
      if(x==2)
      {
      System.out.println("History");
      System.out.println("In what year was the Declaration of Independence created?"+"\n"+"1.1765"+"\n"+"2.1776");
      int c = Integer.parseInt(br.readLine());
      if(c==1){
      System.out.println("Looser");
      System.exit(0);
      }
      else if (c==2){
      System.out.println("Your win one candybar");
      
      }
      System.out.println("How many elevators does the Empire State Building have?"+"\n"+"1.99"+"\n"+"2.73");
      int d = Integer.parseInt(br.readLine());
      
      if (d==1){
      System.out.println("go at fishing");
      System.exit(0);
      }
      else if(d==2){
      System.out.println("you won a tripp to nowhere");
      domains();
      }
      }
      if(x==3)
      {
      System.out.println("Science");
      System.out.println("Brass gets discoloured in air because of the presence of which of the following gases in air?"+"\n"+"1.carbon dioxide"+"\n"+"2.hydrogen sulphide");
     
      int e = Integer.parseInt(br.readLine());
      if (e==1){
      System.out.println("byebye birdie");
      System.exit(0);
      }
      else if (e==2){
      System.out.println("you are on fire");}
      System.out.println("Which of the following is a non metal that remains liquid at room temperature?"+"\n"+"1.Helium"+"\n"+"2.Bromine");
      int f = Integer.parseInt(br.readLine());
      if (f==1){
      System.out.println("That's all folks");
      System.exit(0);
      }
      else if (f==2){
      System.out.println("we have a winner");
      winner();
      }
      
     }

}
    public static void winner() {
    for (int line = 1; line <= 4; line++) {
        System.out.print("|");

        for (int space = 1; space <= (line * -2 + 8); space++) {
            System.out.print(" ");
        }

        System.out.print("<>");

        for (int dot = 1; dot <= (line * 4 - 4); dot++) {
            System.out.print("$");
        }

        System.out.print("<>");

        for (int space = 1; space <= (line * -2 + 8); space++) {
            System.out.print(" ");
        }

        System.out.println("!");
    }
}
    
    
    }
    
 
   