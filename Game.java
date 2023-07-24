import java.lang.reflect.Array;

public class Game {
   Array wordBank;
   Array letterBank;
   Array usedLetters;
   int lives; 
   String word;

   public Game(String word){ //This is custom Constructor Method, this will run every (new Person())
      this.word = word; //"this" object refers to this Person, it wokrs because Person was created at this point, thats why we have arrived at this line of code. 
      System.out.println("New game started.");
   }

   private void setWord(String string) {
      this.word = string;
   }

   private String getWord() {
      return this.word;
   }

   private void setUsedLetters(String letter){
      //add letter to usedLetters array
   }

   private void setLives(Integer number){
      this.lives = lives - number;
   }
   
   private void inputPrompt{
      System.out.println('Input goes here');
   }
}