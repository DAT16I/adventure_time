Make sure you use the same amount of indentation everywhere.
Consistency is key!


In the spirit of consistency I would also like you to use curly brackets in all of you `if else` statements. Even your `if` one liners.


Give you application some breathing roomß as well. No harm in that.

```java
if (answer.equals("yes")){
 System.out.println("Let's put your mind to work. Think and answer fast, you have limited time !");
 allRiddles();

 }else
   if (answer.equals("no")){
     System.out.println("Then run you shall, scaried little one ! :)");
     }else System.out.println("Give me another answer");
}
```

```java
if (answer.equals("yes")) {

  System.out.println("Let's put your mind to work. Think and answer fast, you have limited time !");
  allRiddles();

}
else {

  if (answer.equals("no")) {
    System.out.println("Then run you shall, scaried little one ! :)");
  }
  else {
    System.out.println("Give me another answer");
  }

}
```


Nice addition with file reading to keep the bloat out of your application!


A good and well flowing application. Keep it up.
