Try to be consistent in your choice of code style.
This is mainly in regards to your `if else` statements.


Java allows for skipping out on the curly brackets when you only are doing one
line statements after the if. The problem with this is that it's hard to
distinguish the scope of your program.

```java
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
```
Give your code some more breathing room. Let it fill your editor vertically.
That is more than ok!

```java
if(choice.equals(choice1)) {
  susie = br.readLine();
}
else {

  if(choice.equals(choice2)) {
    write("You are a disappoiment");
    chances--;
    Chances(chances);
    Fine();

    if(chances == 0) {
      Gameover();
    }

  }
}
```

It's Java convention to name you classes with a capital letter at the start,
but not your methods.

```java
public static void Challenges(int quest)
{ write("You still have " + quest + " challenges");
}
```
Again, breathing room and consistency.

```java
public static void challenges(int quest)
{
  write("You still have " + quest + " challenges");
}
```


I like the flow of your application and your use of `String.equals()` but I want
to see you use some more logical operators such as `&&` and `||`.


Your main points of critique is to try and be consistent with the way you write
code and sticking to the Java conventions when it comes to naming.


For the main part of your application you have very good variable naming!


Good job ;)
