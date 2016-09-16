Remember to name your file the same as your class. Otherwise it won't compile.
Also the file needs to have the .java extension. Not the .class extension. That is for the
compiled bytecode.


Try and let your code breath a bit. It's more than ok to separate parts of your
code with empty lines to make it more readable.


Most of the time your indentation is also fucked ip.

```java
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
```

To make it easier to read both the scope and the flow of the code.

```java
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
```


The logic is fine, it's just very messy. Keep up the work!
