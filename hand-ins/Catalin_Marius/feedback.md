Remmeber to name your file the same as your class! Otherwise it won't compile.
It also have, to have the .java extension.


Nice usage of the `do while` loop.


I love the way you use the `sleep` implementation as well. Nicely thought out.


The only thing I can put my finger on is trying to let your code breath a bit
more. Space it out vertically to make it more readable. Also some of your
indentation is off which makes it harder to read as well.

```java
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
```

It's easier to tell what goes where and what scope the different things belong
to.

```java
do {

  chosenWeapon = scanner.nextInt();

  if(chosenWeapon < 1 || chosenWeapon > 3) {
    System.out.println("Really man?");
  }
  else {
    sleep();
    System.out.println("Your weapon is : " + weapon[(chosenWeapon - 1)]);
    sleep();
    System.out.println("You are into some kinky shit man..");
  }

}
while(chosenWeapon<1||chosenWeapon>3);
```


To enhance your sleep method maybe make it so that it utilizes overriding?

```java
public static void sleep() throws InterruptedException{
      Thread.sleep(700);         
   System.out.print('\n');}
```

This way you can call `sleep();` with out without a parameter and have some
added extra goody functionality. Just a thought.

```java
public static void sleep(int time) throws InterruptedException {
  Thread.sleep(time);         
  System.out.print('\n');
}

public static void sleep() throws InterruptedException {
  Thread.sleep(700);         
  System.out.print('\n');
}
```


All in all, good job!
