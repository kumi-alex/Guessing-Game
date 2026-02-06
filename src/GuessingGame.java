/* 
The program has a welcome message 
The program generates a random number between 0 to 30
The program then asks the user to guess the number 
after the first trial , the user is given 4 more chance to guess the number 
at any of the points where we have a matching answer a congratulations message is sent to the user for winning 
the users get hints as to how close or away they are to or from number.   
when the user fails all four other trails the number is outputed and get a loosing message. 
the user is asked if they want to play again and a different number is generate by the program.

*/ 



import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Scanner object for taking input, named enter.
         Scanner Enter = new Scanner(System.in);
        // variables 
        double generatedNumber;
        int userGuess;
        char playAgain='y';

        while (playAgain =='y'|| playAgain=='Y'){ 
    
        //welcome message 
        System.out.println("###################################################################");
        System.out.println("###################################################################");
        System.out.println("####         Hey! Welcome to the Ultimate Guessing Game         ###");
        System.out.println("####         Guess a number between 0 to 10 to win...           ###");
        System.out.println("####         Dont worry you have 5 attempts                     ###");
        System.out.println("###################################################################");
        System.out.println("###################################################################");
        System.out.println("Umm... I have a number in mind, what do you think is it: ");

        //Generate a random number and save it to generateNumber variable
        generatedNumber=Math.round(Math.random()*10);

        //take first input 
        userGuess=Enter.nextInt();
        // checking for the first time 
        if (generatedNumber==userGuess){
            System.out.println("Wow! that's smooth... Right on your First guess.");
            System.out.println("you guessed "+ userGuess +" and I also thought of "+ generatedNumber);
            
        }

        else if (generatedNumber!=userGuess ){
            for (int i = 0; i< 5; i++){
               
                if (i == 4 && (generatedNumber!=userGuess)) { // Check if it's the last attempt
                    System.out.println("Sorry, you've used all your attempts.");
                    System.out.println("The correct number was: " + generatedNumber);
                }

                else if (generatedNumber!=userGuess){
                    if (generatedNumber<userGuess) {
                        System.out.println("We are sorry, you're wrong...");
                        System.out.println("Good news is "+ userGuess +" is Greater than what i guessed" );
                        System.out.println("What do you think it is then? ");
                        userGuess= Enter.nextInt();
                 if (generatedNumber==userGuess){
                System.out.println("Yay! you got it right this time.");
                System.out.println("you guessed"+ userGuess +" and I also thought of"+ generatedNumber);
                }
                }
                }
                else if (generatedNumber>userGuess){
                        System.out.println("We are sorry, you're wrong...");
                        System.out.println("Good news is "+ userGuess +" is less than what i guessed" );
                        System.out.println("What do you think it is then? ");
                        userGuess= Enter.nextInt();
                        if (generatedNumber==userGuess){
                System.out.println("Yay! you got it right this time.");
                System.out.println("you guessed"+ userGuess +" and I also thought of"+ generatedNumber);
                    }}
                }
            }
        else if (userGuess<0 || userGuess>10){
                System.out.println("\nEii, Buh you too what you type like that no ? ");
                System.out.println("Please enter a number between 0 to 10 only ");
                System.out.println("\nRestart the game again. ");

         } 
    System.out.println("Do you want to play again?(y/n) ");
    playAgain = Enter.next().charAt(0);

            }
    }
}
   
